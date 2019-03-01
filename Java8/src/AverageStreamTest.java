//11. Find average of the number inside integer list after doubling it.
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AverageStreamTest {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2, 5, 3, 6, 7, 9);
//        integerList.stream().filter((i)-> 2 * i).reduce(0, (a, b)->a+b/integerList.size());
        System.out.println("Required average is: "+integerList.stream().collect(Collectors.averagingInt((i)->2*i)));
//        Another Mehod
        System.out.println("Required average is: "+integerList.stream().map(integer -> integer * 2).collect(Collectors.averagingInt(Integer::intValue)));
    }
}
