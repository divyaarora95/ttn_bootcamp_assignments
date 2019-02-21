public class Librarian implements Person {
    String librarianId;
    String librarianName;
    
    Librarian(String librarianId, String librarianName)
    {
        this.librarianId = librarianId;
        this.librarianName = librarianName;
    }
    
    public void getPersonDetails(){
        System.out.println("Member ID : "+this.librarianId);
        System.out.println("Member Name : "+this.librarianName);
    }
}
