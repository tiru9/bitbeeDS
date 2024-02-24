import java.util.ArrayList;
import java.util.List;

public class VirtualThreadSwitch {
    public static void main (String args[]) throws InterruptedException {
        Thread.ofPlatform().start(() ->{
            System.out.println("Platform Thread :: "+Thread.currentThread());
        });

        Thread.ofVirtual().start(() ->{
            System.out.println("Virtual Thread :: "+Thread.currentThread());
        }).join();

       /* List<Thread> vThreads = new ArrayList<Thread>();
        for(int i = 0; i < 10; i++) {
            vThreads.add(Thread.ofVirtual().unstarted(() -> {
                System.out.println("Thread :: " + Thread.currentThread());
                try{
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }));
       }

        for (Thread vThread : vThreads) {vThread.start();}
        for (Thread vThread : vThreads) {
            vThread.join();//waiting to complete all virtual threads first before main
        }
*/    }
}