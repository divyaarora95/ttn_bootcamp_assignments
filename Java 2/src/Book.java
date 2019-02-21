public class Book {
    String bookName;
    float bookPrice;
    String bookAuthor;
    
    Book(String bookName, float bookPrice, String bookAuthor)
    {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookAuthor = bookAuthor;
    }
    
    void getBookDetails()
    {
        System.out.println("Book Name : "+this.bookName);
        System.out.println("Book Price : "+this.bookPrice);
        System.out.println("Book Author : "+this.bookAuthor);
    }
}
