public class TryCatchDemo{
    public static void main(String[] args) {
        try {
            int count = 8;
            int myArray[] = {4, 15, 20, 23, 65};
            if(count == 1)
            {
                System.out.println(myArray[6]);
            }
            
            else
            {
                System.out.println(myArray[3]/0);
            }
            
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception : "+e);
            return;
        }
        
        catch (Exception e)
        {
            System.out.println("Exception : "+e);
        }
        
        finally {
            System.out.println("We are inside finally and out of try catch.");
        }
    }
}
