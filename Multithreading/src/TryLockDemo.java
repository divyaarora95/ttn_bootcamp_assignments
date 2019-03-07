//16 Create a deadlock and Resolve it using tryLock().
// PART B
import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockDemo {
    
    Lock myLock1 = new ReentrantLock(true);
    Lock myLock2 = new ReentrantLock(true);
    
    
    public void acquireLock(Lock myLock1, Lock myLock2){
        boolean acquiremyLock1 = myLock1.tryLock();
        boolean acquiremyLock2 = myLock2.tryLock();
        
        if(acquiremyLock1 && acquiremyLock2)
        {
            return;
        }
        
        if(acquiremyLock1)
        {
            myLock1.unlock();
        }
        
        if(acquiremyLock2)
        {
            myLock2.unlock();
        }
    }
    public void Person1(){
        acquireLock(myLock1, myLock2);
//        myLock1.lock();
        System.out.println("Person 1 Lock 1");
//        myLock2.lock();
        System.out.println("Person 1 Lock 2 ");
        myLock2.unlock();
        myLock1.unlock();
    }
    
    public void Person2(){
        acquireLock(myLock1, myLock2);
//        myLock2.lock();
        System.out.println("Person 2 Lock 2");
//        myLock1.lock();
        System.out.println("Person 2 Lock 1");
        myLock2.unlock();
        myLock1.unlock();
    }
    
    public static void main(String[] args) throws InterruptedException {
        TryLockDemo tryLockDemo = new TryLockDemo();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                tryLockDemo.Person1();
            }
        });
        
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                tryLockDemo.Person2();
            }
        });
        
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
    
}
