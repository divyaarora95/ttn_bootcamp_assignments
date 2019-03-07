//3. Use a singleThreadExecutor to submit multiple threads.
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleExecutorServiceDemo {
    public static void main(String[] args) {
        System.out.println("Main Begins");
        ExecutorService executorService = Executors.newSingleThreadExecutor();
    
        try{
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(0000L);
                        System.out.println("Thread 1");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
    
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(3000L);
                        System.out.println("Thread 2");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
    
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(4000L);
                        System.out.println("Thread 3");
                
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
    
        }
        
        finally{
            executorService.shutdown();
        }
    
        System.out.println("Main Finished");
        
    }
}
