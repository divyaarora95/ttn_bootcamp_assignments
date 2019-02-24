import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SumList {
    public static void main(String[] args) {
        List<Float> myArrayList = new ArrayList<>();
        myArrayList.add(23f);
        myArrayList.add(12f);
        myArrayList.add(15f);
        myArrayList.add(10f);
        myArrayList.add(7f);
        float mySum = 0f;
        
        Iterator<Float> myIterator = myArrayList.iterator();
        
        while (myIterator.hasNext())
            mySum += myIterator.next();
    
        System.out.println("sum is : "+mySum);
    }
}
