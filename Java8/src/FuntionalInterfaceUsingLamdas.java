//5. Implement following functional interfaces from java.util.function using lambdas:
//
//(1) Consumer
//
//(2) Supplier
//
//(3) Predicate
//
//(4) Function

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FuntionalInterfaceUsingLamdas {
    public static void main(String[] args) {
//    Predicate
        Predicate<Integer> predicate = (myNumber)-> myNumber>10;
        System.out.println("Is 15 is greater than 10 ?"+predicate.test(15));
//    Function
        Function<String, Integer> function = (myString)-> myString.length();
        System.out.println("Calculating th length of String supplied i.e 'divya' "+function.apply("divya"));
//    Consumer
        Consumer<String> consumer = (str) -> {
            str = str.concat("World");
            System.out.println("Concatinatng the given 2 Strings we have: "+str);
        };
        consumer.accept("Hello");
//    Supplier
        Supplier<Integer> supplier = ()-> 8;
        System.out.println("Supplied Value is: "+supplier.get());
    }
}
