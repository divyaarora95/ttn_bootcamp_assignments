//14. Coordinate mulitple threads using wait() and notifyAll()
public class NotifyAllDemo {
    public void method1(){
        synchronized (this){
            System.out.println("Method 1 begins");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("method 1 ends");
    
        }
    }
    public void method2(){
        synchronized (this){
            System.out.println("Method 2 begins");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("method 2 ends");
        }
    }
    public void method3(){
        synchronized (this){
            System.out.println("Method 3 begins");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("method 3 ends");
        }
    }
    public void method4(){
        synchronized (this){
            System.out.println("Method 4 begins");
            System.out.println("Method 4 Ends");
            notifyAll();
        }
    }
    public static void main(String[] args) {
        NotifyAllDemo notifyAllDemo = new NotifyAllDemo();
        new Thread(new Runnable() {
            @Override
            public void run() {
                notifyAllDemo.method1();
            }
        }).start();
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                notifyAllDemo.method2();
            }
        }).start();
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                notifyAllDemo.method3();
            }
        }).start();
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                notifyAllDemo.method4();
            }
        }).start();
    }
}
