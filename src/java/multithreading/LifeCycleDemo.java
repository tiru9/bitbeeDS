package multithreading;

class Shared {
    synchronized void waitTask() {
        try {
            System.out.println("T1 waiting...");
            wait();
            System.out.println("T1 resumed!");
        }catch (InterruptedException e) {
            System.out.println("Interrupted Exception at waitTask()..");
        }
    }
    synchronized void notifyTask() {
        System.out.println("T2 notifying...");
        notifyAll();
    }
}

public class LifeCycleDemo {
    public static void main(String[] a) throws Exception {
        Shared s = new Shared();
        Thread t1 = new Thread(() -> s.waitTask(), "T1");
        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(500);
                s.notifyTask();
            } catch (Exception e) {}}, "T2");

        System.out.println("Before start: " + t1.getState());
        t1.start(); t2.start(); t1.join(); t2.join();
        System.out.println("After end: " + t1.getState());
    }
}
