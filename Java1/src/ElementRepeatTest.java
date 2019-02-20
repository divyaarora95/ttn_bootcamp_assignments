public class ElementRepeatTest {
    static void findSingle(int array1[], int array1Size)
    {
        int resultXOR = array1[0];
        for (int i= 1; i<array1Size; i++)
        {
            resultXOR = resultXOR ^ array1[i];
            
        }
        System.out.println(resultXOR);
//        return  resultXOR;
    }
    
    public static void main(String[] args) {
        int dummyArray[] = {1, 4, 3, 4, 1};
        int n = dummyArray.length;
        System.out.println("Element occuring twice is: ");
        findSingle(dummyArray, dummyArray.length);
    
    
    }
}
