//12. Use Atomic Classes instead of Synchronize method and blocks.
import java.util.concurrent.atomic.AtomicInteger;

public class SynchronizeToAccessAMethod {
    
    AtomicInteger count = new AtomicInteger();
    
    public void incrementCount(){
//        System.out.println("we are inside increment Count");
        count.incrementAndGet();
    }

    public void myMethod1()
    {
        for (int i =0; i<=9; i++)
        {
            incrementCount();
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        SynchronizeToAccessAMethod syncDemo = new SynchronizeToAccessAMethod();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                syncDemo.myMethod1();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                syncDemo.myMethod1();
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("the final Value for Count is: "+syncDemo.count);

    }
}
