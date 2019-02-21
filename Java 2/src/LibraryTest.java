import java.util.ArrayList;

public class LibraryTest {
    public static void main(String[] args) {
        Library myLibrary = new Library();
        myLibrary.setLibraryLocation("GTB Nagar");
        ArrayList<Book> bookList = new ArrayList<>();
//        books
        Book b1 = new Book("The History of Tom Jones", 500, "Henry Fielding");
        Book b2 = new Book("Pride and Prejudice", 450, "Jane Austen");
        Book b3 = new Book("Wuthering Heights", 600, "Emily Brontë");
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        myLibrary.setListOfBooks(bookList);
        ArrayList<Member> memberList = new ArrayList<>();
//        members
        Member m1 = new Member("M1", "Jenny");
        Member m2 = new Member("M2", "Harry");
        Member m3 = new Member("M3", "Ron");
        Member m4 = new Member("M4", "Robert");
        memberList.add(m1);
        memberList.add(m2);
        memberList.add(m3);
        memberList.add(m4);
        myLibrary.setListOfMembers(memberList);
        myLibrary.setLibrarian("Gurbani Kalra");
//        Librarian
        Librarian l1 = new Librarian("L1", "Gurbani Kalra");
        
        myLibrary.getLibraryDetails();
        
    }
}
