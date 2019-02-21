class CustomExcepton extends Exception{
    
    public CustomExcepton(String str) {
        super(str);
    }
    
    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
public class CustomExceptionTest
{
    public static void main(String[] args) {
        try {
            throw new CustomExcepton("Custom Exception Occured!!");
        }
        catch (CustomExcepton e)
        {
            System.out.println("Custom Exception caught");
    
            System.out.println(e.getMessage());
            System.out.println(e.fillInStackTrace());
        }
    }
}
