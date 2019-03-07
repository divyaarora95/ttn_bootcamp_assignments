//16. Create a deadlock and Resolve it using tryLock().
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockDemo {
    Lock myLock1 = new ReentrantLock(true);
    Lock myLock2 = new ReentrantLock(true);
    
    public void Person1(){
        myLock1.lock();
        System.out.println("Person 1 Lock 1");
        myLock2.lock();
        System.out.println("Person 1 Lock 2 ");
        myLock2.unlock();
        myLock1.unlock();
    }
    
    public void Person2(){
        myLock2.lock();
        System.out.println("Person 2 Lock 2");
        myLock1.lock();
        System.out.println("Person 2 Lock 1");
        myLock2.unlock();
        myLock1.unlock();
    }
    
    public static void main(String[] args) throws InterruptedException {
        DeadlockDemo deadlockDemo = new DeadlockDemo();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                deadlockDemo.Person1();
            }
        });
        
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                deadlockDemo.Person2();
        
            }
        });
        
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        
    }
}
