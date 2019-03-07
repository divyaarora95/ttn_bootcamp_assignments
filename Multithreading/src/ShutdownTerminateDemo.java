//4. Try shutdown() and shutdownNow() and observe the difference.
//5. Use isShutDown() and isTerminated() with ExecutorService.
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShutdownTerminateDemo {
    public static void main(String[] args) {
        System.out.println("Main Begins");
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        
        try{
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(4000L);
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
                        Thread.sleep(1000L);
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
                        Thread.sleep(2000L);
                        System.out.println("Thread 3");
                        
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            
        }
        
        finally{
            System.out.println("Bye");
            executorService.shutdown();
        }
//        executorService.shutdownNow();
    
    
        System.out.println(executorService.isTerminated());
        System.out.println(executorService.isShutdown());
        
        
        System.out.println("Main Finished");
        
    }
}
