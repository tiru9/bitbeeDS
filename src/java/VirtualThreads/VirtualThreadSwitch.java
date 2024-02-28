import java.util.ArrayList;
import java.util.List;

public class VirtualThreadSwitch {
    public static void main (String args[]) throws InterruptedException {
        List<Thread> vThreads = new ArrayList<Thread>();
        for(int i = 0; i < 10; i++) {
            vThreads.add(Thread.ofVirtual().start(() -> {
                System.out.println("Thread :: " + Thread.currentThread());
                try{
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }));
        }

        for (Thread vThread : vThreads) {
            vThread.join();//waiting to complete all virtual threads first before main
        }

        List<Thread> pThreads = new ArrayList<Thread>();
        for(int i = 0; i < 10; i++) {
            pThreads.add(new Thread(() -> {
                try{
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }));
        }
        for (Thread pThread : pThreads) {pThread.start();
        }
        for (Thread pThread : pThreads) {
            pThread.join();//waiting to complete all virtual threads first before main
            System.out.println("Thread :: " + pThread.getName());
        }

    }
}