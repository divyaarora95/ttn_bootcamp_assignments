//9. Increase concurrency with Thread pools using newCachedThreadPool() and newFixedThreadPool().
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread implements Runnable{
    int threadId;
    
    public MyThread(int threadId) {
        this.threadId = threadId;
    }
    
    
    @Override
    public void run() {
        System.out.println("Thread name "+Thread.currentThread().getName()+" Start "+threadId);
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    
        System.out.println("Thread name "+Thread.currentThread().getName()+" End "+threadId);
    }
}
public class CatchedThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 1; i<=20; i++){
            executorService.submit(new MyThread(i));
        }
        executorService.shutdown();
    }
}
