//1. Write the following a functional interface and implement it using lambda:
//        (1) First number is greater than second number or not             Parameter (int ,int ) Return boolean
//        (2) Increment the number by 1 and return incremented value    Parameter (int) Return int
//        (3) Concatination of 2 string                                                             Parameter (String , String ) Return (String)
//        (4) Convert a string to uppercase and return .                                Parameter (String) Return (String)

interface Compute{
    boolean computeMe(int a, int b);
}

interface Increment{
    int incrementNumber(int a);
}

interface ConcatenateStrings{
    String concatenateUs(String a, String b);
}

interface UpperCaseMe{
    String uppMe(String s);
}

public class LamdaDemo {
    public static void main(String[] args) {
        Compute compute = (a, b)->{
            if(a>b)
                return true;
            else
                return false;
        };
        
        System.out.println(compute.computeMe(12, 6));
        System.out.println(compute.computeMe(1, 13));
        
        Increment increment = (a)->{
            a +=1;
            return a;
        };
        
        System.out.println(increment.incrementNumber(12));
        
        ConcatenateStrings concatenateStrings = (a, b)->{
            return a+b;
        };
        
        System.out.println(concatenateStrings.concatenateUs("Divya", "Arora"));
        
        UpperCaseMe upperCaseMe = (s)->{
            return s.toUpperCase();
        };
        
        System.out.println(upperCaseMe.uppMe("divya"));
    }
}
