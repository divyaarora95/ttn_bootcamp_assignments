//1. Create and Run a Thread using Runnable Interface and Thread class.
public class ThreadClassDemo extends Thread {
    
    public void run(){
        System.out.println("Run Method Overriden Using Thread Class");
    }
    
    public static void main(String[] args) {
        new ThreadClassDemo().start();
    
    }
}
