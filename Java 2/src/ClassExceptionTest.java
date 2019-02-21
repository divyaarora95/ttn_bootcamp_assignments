class Parents{
    String name;
    Parents(String name)
    {
        this.name = name;
    }
}
public class ClassExceptionTest{
    public static void main(String[] args) {
//        Bank p = new Bank();
        try{
            Parents p = new Parents("Divyaa");
            System.out.println(p.name);
            Class.forName("Divya.Arora");
            
        }
        catch (Exception e)
        {
            System.out.println("Exception : "+e);
        }
        finally {
            System.out.println("In Finally");
        }
    }
}
