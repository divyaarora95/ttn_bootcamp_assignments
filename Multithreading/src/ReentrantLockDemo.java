import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
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
            System.out.println("Person 2 leaves");
            condition.signal();
        }
        finally {
            myLock.unlock();
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        SignalAllDemo reentrantLockDemo = new SignalAllDemo();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                reentrantLockDemo.Person1();
            }
        });
        
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                reentrantLockDemo.Person2();
            }
        });
        
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
