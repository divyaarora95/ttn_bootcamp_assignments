import java.util.ArrayList;

public class Library {
    
    private String libraryLocation;
    private ArrayList<Book> listOfBooks = new ArrayList<>();
    private ArrayList<Member> listOfMembers = new ArrayList<>();
    private String librarian;
    
    public String getLibraryLocation() {
        return libraryLocation;
    }
    
    public void setLibraryLocation(String libraryLocation) {
        this.libraryLocation = libraryLocation;
    }
    
    public ArrayList<Book> getListOfBooks() {
        return listOfBooks;
    }
    
    public void setListOfBooks(ArrayList<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }
    
    public ArrayList<Member> getListOfMembers() {
        return listOfMembers;
    }
    
    public void setListOfMembers(ArrayList<Member> listOfMembers) {
        this.listOfMembers = listOfMembers;
    }
    
    public String getLibrarian() {
        return librarian;
    }
    
    public void setLibrarian(String librarian) {
        this.librarian = librarian;
    }
    
    public void getLibraryDetails()
    {
        System.out.println(getLibraryLocation());
        System.out.println(getLibrarian());
        for(Book b : listOfBooks)
        {
            b.getBookDetails();
        }
        for (Member m : listOfMembers)
        {
            m.getPersonDetails();
        }
    }
}
