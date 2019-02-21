public class SingletonClassDemo {
    private static SingletonClassDemo obj;
    static {
        obj = new SingletonClassDemo();
    }
    
    private SingletonClassDemo()
    {
    
    }
    public static SingletonClassDemo getInstance(){
        return obj;
    }
    
    public void testMethod(){
        System.out.println("Code Working...!!");
    }
    
    public static void main(String[] args) {
        SingletonClassDemo s1 =getInstance();
        s1.testMethod();
    }
}
