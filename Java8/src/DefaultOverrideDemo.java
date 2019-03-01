//7.  Override the default method of the interface.

interface DefaultDemo{
    default void display() {
        System.out.println("Hi, I'm display's body from  interface");
    }
}
public class DefaultOverrideDemo implements DefaultDemo {
    public void display(){
        System.out.println("Hey, it's me display from Class");
    }
    public static void main(String[] args) {
        DefaultOverrideDemo defaultOverrideDemo = new DefaultOverrideDemo();
        defaultOverrideDemo.display();
    }
}
