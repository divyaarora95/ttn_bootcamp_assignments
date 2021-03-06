//4. Create an Employee Class with instance variables (String) name,
// (Integer)age, (String)city and get the instance of the Class using constructor reference
interface EmployeeHolder{
    Employee constructorReferenceMethod(String name, Integer age, String city);
}
class Employee{
    String name;
    Integer age;
    String city;


    public Employee(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    
    @Override
    public String toString() {
        return "name is: "+name+" age is: "+age+" city is: "+city;
    }
}

public class ConstructorReferenceTest {
    public static void main(String[] args) {
        EmployeeHolder employeeHolder = Employee::new;
        System.out.println(employeeHolder.constructorReferenceMethod("divya", 23, "delhi"));
        System.out.println(employeeHolder.constructorReferenceMethod("drishti", 21, "ahemdabaad"));
    }
}
