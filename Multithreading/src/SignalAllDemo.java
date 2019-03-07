//15. Use Reentract lock for coordinating 2 threads with signal(), signalAll() and wait().
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SignalAllDemo {
    Lock myLock = new ReentrantLock(true);
    Condition condition = myLock.newCondition();
    
    public void Person1(){
        try {
            myLock.lock();
            System.out.println("Person 1 enters");
            condition.await();
            System.out.println("Person 1 leaves");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            myLock.unlock();
        }
    }
    
    public void Person2(){
        try{
            myLock.lock();
            System.out.println("Person 2 enters");
            condition.await();
            System.out.println("Person 2 leaves");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            myLock.unlock();
        }
    }
    
    public void Person3(){
        try{
            myLock.lock();
            System.out.println("Person 3 enters");
            System.out.println("Person 3 leaves");
            condition.signalAll();
        }
        finally {
            myLock.unlock();
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        SignalAllDemo signalAllDemo = new SignalAllDemo();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                signalAllDemo.Person1();
            }
        });
        
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                signalAllDemo.Person2();
            }
        });
        
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                signalAllDemo.Person3();
        
            }
        });
        
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
    }
}
