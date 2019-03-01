//2. Create a functional interface whose method takes 2 integers and return one integer.
@FunctionalInterface
interface Calculate{
    int add(int a, int b);
}
public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Calculate calculate = (a, b)-> a+b;
        System.out.println("the resultant output is : "+calculate.add(12, 15));
    }
}
