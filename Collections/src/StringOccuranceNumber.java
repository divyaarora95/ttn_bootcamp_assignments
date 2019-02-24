import java.util.HashMap;

public class StringOccuranceNumber {
    static void characterCount(String str)
    {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char myCharArray[] = str.toCharArray();
        
        for (char eachCharacter : myCharArray)
        {
            if(hashMap.containsKey(eachCharacter))
            {
                hashMap.put(eachCharacter, hashMap.get(eachCharacter)+1);
            }
            else
            {
                hashMap.put(eachCharacter, 1);
            }
        }
        
        for (HashMap.Entry entry: hashMap.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
    public static void main(String[] args) {
        String myString = "occasion";
        characterCount(myString);
    }
}
