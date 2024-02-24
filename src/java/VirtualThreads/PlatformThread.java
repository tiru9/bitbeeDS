public class PlatformThread {
    public static void main(String[] args) {
        final int numberOfThreads = 100_0000;
        Long t1 = System.currentTimeMillis();
        for (int i = 0; i < numberOfThreads; i++) {
            int threadNumber = i;
            Thread thread = new Thread(() -> {
                System.out.println("Thread " + threadNumber + " is running.");
            });
            thread.start();
        }
        Long t2 = System.currentTimeMillis();
        System.out.println("Time Taken by Virtual Threads : "+(t2-t1));
    }
}
