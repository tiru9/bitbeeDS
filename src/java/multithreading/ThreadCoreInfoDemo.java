package multithreading;

public class ThreadCoreInfoDemo {
    public static void main(String[] args) {

        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Available CPU cores: " + cores);
        System.out.println("Starting concurrent tasks...\n");

        for (int i = 1; i <= 4; i++) {
            int threadId = i;
            new Thread(() -> {
                System.out.println("Thread " + threadId + " started on: " + Thread.currentThread().getName());
                heavyTask(threadId);
                System.out.println("Thread " + threadId + " finished.");
            }).start();
        }
    }

    private static void heavyTask(int id) {
        long sum = 0;
        for (int i = 0; i < 100_000_000; i++)
            sum += i;
        System.out.println("Thread " + id + " computation done!");
    }
}
