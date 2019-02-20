class StaticExample{
    
    static String firstName = "Divya";
    static String lastName = "Arora";
    static int age = 23;
    
    static
    {
        System.out.println("FirstName: "+firstName);
    }
    
    static void myMethod()
    {
        System.out.println("Lastname: "+lastName);
    }
    
    void print_age()
    {
        System.out.println("Age: "+age);
    }
    
    public static void main(String[] args) {
        StaticExample.myMethod();
        System.out.println(StaticExample.age);
    }
}
