public class PlatformThread {
    public static void main(String[] args) {
        final int numberOfThreads = 100_000_0;
        Long t1 = System.currentTimeMillis();
        for (int i = 1; i <= numberOfThreads; i++) {
            int threadNumber = i;
            Thread thread = new Thread(() -> {
                System.out.println("Platform Thread with count" + threadNumber);
            });
            thread.start();
        }
        Long t2 = System.currentTimeMillis();
        System.out.println("Time Taken by Platform Threads : "+(t2-t1));
    }
}
