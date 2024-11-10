import java.util.ArrayList;

class Book{
    private int bookId;
    private Strng bookName;
    private String authorName;
    public Book(int bookId,String bookName,String authorName){
        super();
        this.bookId=bookId;
        this.bookName=bookName;
        this.authorName=authorName;
    }
    @Override
    public String toString(){
        return "Book [bookId "+bookId+", bookName "+bookName+", autherName "+authorName+"]";
    }
}
public class CustomArrayList {
    public static void main(String[] args) {
        ArrayList<Book> books=new ArrayList<>();
        books.add(new Book(101, "abc", "wxy"));
        books.add(new Book(102, "bcd", "xyz"));
        System.out.println("--All Books--");
        for(Book b:books){
            System.out.println(b);
        }
    }
    
}
