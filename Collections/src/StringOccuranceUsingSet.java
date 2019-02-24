import java.util.HashSet;

public class StringOccuranceUsingSet {
    static void countCharacter(String str)
    {
        char charArray[] = str.toCharArray();
        HashSet<Character> hashSet = new HashSet<>();
        for(int i =0;i<charArray.length; i++)
        {
            hashSet.add(charArray[i]);
        }
        System.out.println(hashSet.size());
    }
    public static void main(String[] args) {
        String myString = "occurance";
        countCharacter(myString);
        
    }
}
