
public class VirtualThread {
    public static void main (String args[]) throws InterruptedException {
        System.out.println("Virtual Threads");
        int vtc = 100_0000;
        Long t1 = System.currentTimeMillis();
        for(int i =0; i < vtc; i++) {
            int vi = i;
            Thread vt = Thread.ofVirtual().start(() -> {
                int res = 1;
                for(int j = 0;j < 10; j++){
                    res *= (j+1);
                }
                System.out.println("Results["+vi+ "]: "+res);
            });
            vt.join();
        }
        Long t2 = System.currentTimeMillis();
        System.out.println("Time Taken by Virtual Threads : "+(t2-t1));
    }
}