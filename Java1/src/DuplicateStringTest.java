public class DuplicateStringTest {
    public static void main(String[] args) {
        String str = "where there is a will there is a way";
        int count;
        String wordArray[] = str.split(" ");
        for(int i =0; i<wordArray.length; i++)
        {
            count = 1;
            for(int j = i+1; j<wordArray.length; j++)
            {
                if(wordArray[i].equals(wordArray[j]))
                {
                    count++;
                    wordArray[j] = "";
                }
            }
            if(count>1 && wordArray[i]!= "")
            {
                System.out.println("Word "+wordArray[i]+" is repeated "+count+" number of times");
            }
        }
    }
}
