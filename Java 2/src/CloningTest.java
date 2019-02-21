class Student implements Cloneable
{
    String studentName;
    int studentAge;
    int studentRollNo;
    
    Student(String studentName, int studentAge, int studentRollNo)
    {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentRollNo = studentRollNo;
    }
    
    Student(Student s){
        System.out.println("Copy Constuctor called!!");
        studentName = s.studentName;
        studentAge = s.studentAge;
        studentRollNo = s.studentRollNo;
    }
    
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
    
}

public class CloningTest {
    public static void main(String[] args) {
        try {
            Student s1 = new Student("Divya", 23, 19);
            Student s2 = (Student)s1.clone();
            Student s3 = new Student(s1);
            System.out.println("Student 2 : "+s2.studentName+" student age : "+s2.studentAge+" student RollNo : "+s2.studentRollNo);
            System.out.println("Student 3 : "+s3.studentName+" student age : "+s3.studentAge+" student RollNo : "+s3.studentRollNo);
        }
        catch (CloneNotSupportedException e){
            System.out.println("Exception: "+e);
        }
    }

}
