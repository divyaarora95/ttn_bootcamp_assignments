//13. Coordinate 2 threads using wait() and notify().
public class WaitNotifyTest {
    
    public void method1(){
        synchronized (this){
            System.out.println("method 1 begins");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("method 1 is completed");
        }
    }
    
    public void method2(){
        synchronized (this){
            System.out.println("Method 2 begins");
            System.out.println("Method 2 is completed");
            notify();
        }
    }
    
    public static void main(String[] args) {
        WaitNotifyTest waitNotifyTest = new WaitNotifyTest();
        new Thread(new Runnable() {
            @Override
            public void run() {
                waitNotifyTest.method1();
            }
        }).start();
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                waitNotifyTest.method2();
        
            }
        }).start();
    }
}
