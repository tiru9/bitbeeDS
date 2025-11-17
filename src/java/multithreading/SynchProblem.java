package multithreading;

public class SynchProblem {
    static int value =999;
    public static void main(String[] args){
        Thread t1 = new Thread(() -> {
            value++;
            System.out.println("Thread-1  value=" + value);
        },"Thread-1");

        Thread t2 = new Thread(() -> {
            value++;
            System.out.println("Thread-2  value=" + value);
        },"Thread-2");

        Thread t3 = new Thread(() -> {
            value++;
            System.out.println("Thread-3  value=" + value);
        },"Thread-3");

        Thread t4 = new Thread(() -> {
            value++;
            System.out.println("Thread-4  value=" + value);
        },"Thread-4");

        t1.start();
        t2.start();//not sure which read will start first
        t3.start();
        t4.start();
    }
}
