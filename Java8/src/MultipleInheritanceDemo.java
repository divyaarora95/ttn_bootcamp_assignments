//8.  Implement multiple inheritance with default method inside  interface.
interface Parent1{
    default void myMethod(){
        System.out.println("My Method from Parent 1");
    }
}
interface Parent2{
    default void myMethod(){
        System.out.println("My Method from Parent 2");
    }
}
public class MultipleInheritanceDemo implements Parent1, Parent2 {
    public MultipleInheritanceDemo() {
        System.out.println("Object Instantiated");
    }
    public void myMethod(){
        Parent1.super.myMethod();
    }
    public static void main(String[] args) {
       MultipleInheritanceDemo multipleInheritanceDemo = new MultipleInheritanceDemo();
       multipleInheritanceDemo.myMethod();
    }
}
