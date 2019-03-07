//2. Use sleep and join methods with thread.
public class SleepJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Begining Main");
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Running Thread 1");
            }
        });
        
        Thread thread2 = new Thread((new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Running Thread 2");
            }
        }));
        
        thread1.start();
        thread2.start();
        
        thread1.join();
        thread2.join();
    
        System.out.println("Main Finished");
        
    }
}
