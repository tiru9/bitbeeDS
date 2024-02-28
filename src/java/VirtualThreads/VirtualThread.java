
public class VirtualThread {
    public static void main (String args[]) throws InterruptedException {
        System.out.println("Virtual Threads");
        int vtc = 100_000_0;
        Long t1 = System.currentTimeMillis();
        for(int i =1; i <= vtc; i++) {
            int count = i;
            Thread vt = Thread.ofVirtual().start(() -> {
                System.out.println("Virtual Thread with count"+count);
            });
            vt.join();
        }
        Long t2 = System.currentTimeMillis();
        System.out.println("Time Taken by Virtual Threads : "+(t2-t1));
    }
}