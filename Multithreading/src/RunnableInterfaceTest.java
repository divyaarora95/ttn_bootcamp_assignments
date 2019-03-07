//1.Create and Run a Thread using Runnable Interface and Thread class.
public class RunnableInterfaceTest implements Runnable {
    
    @Override
    public void run() {
        System.out.println("Overridden Run Method");
    }
    
    public static void main(String[] args) {
        new Thread(new RunnableInterfaceTest()).start();
    }
}
