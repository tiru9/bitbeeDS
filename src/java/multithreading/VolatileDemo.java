package multithreading;

public class VolatileDemo {

    static volatile boolean flag = true;   // VOLATILE
    static int value = 0;

    public static void main(String[] args) {
        Thread reader1 = new Thread(() -> {
            while (flag) {
                System.out.println("Thread-1 Reader: value=" + value);
            }         // may loop FOREVER

        }, "Thread-1");

        Thread reader2 = new Thread(() -> {
            while (flag) {
                System.out.println("Thread-2 Reader: value=" + value);
            }// may loop FOREVER

        }, "Thread-2");

        Thread writer = new Thread(() -> {
            sleep(100);
            value = 42;               // write shared data
            flag = false;              // publish flag
            System.out.println("Thread-4 Writer: flag=false, value=42");
        }, "Thread-4");

        Thread reader3 = new Thread(() -> {
            while (flag) {
                System.out.println("Thread-3 Reader: value=" + value);
            }         // may loop FOREVER

        }, "Thread-3");

        reader1.start();
        reader2.start();
        writer.start();
        reader3.start();
    }

    static void sleep(long ms) {
        try { Thread.sleep(ms); } catch (Exception ignored) {}
    }
}
