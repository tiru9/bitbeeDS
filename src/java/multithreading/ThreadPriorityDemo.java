package multithreading;

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        Thread high = new Thread(() -> System.out.println("High priority"), "High");
        Thread low = new Thread(() -> System.out.println("Low priority"), "Low");
        high.setPriority(Thread.MAX_PRIORITY);
        low.setPriority(Thread.MIN_PRIORITY);
        high.start();
        low.start();
        System.out.println("Main Thread with Norm Priority..");
    }
}
