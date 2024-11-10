<<<<<<< HEAD
import java.util.ArrayList;
class Book {
    int bookId;
    String bookName;
    String authorName;
    //constructor
    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    // Method to display book details
    public void display() {
        System.out.println("BookId: " + bookId + ", Book Name: " + bookName + ", Author Name: " + authorName);
    }
}

public class Booksques {
    public static void main(String[] args) {
        // Creating an ArrayList to store Book objects
        ArrayList<Book> bookList = new ArrayList<>();

        // Adding Book objects to the list
        bookList.add(new Book(101, "book1", "author1"));
        bookList.add(new Book(102, "book2", "author2"));
        bookList.add(new Book(103, "book3", "author3"));
        // Using an advanced for loop to display all book details
        for (Book book : bookList) {
            book.display();
        }
    }
}
=======
import java.util.ArrayList;
class Book {
    int bookId;
    String bookName;
    String authorName;
    //constructor
    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    // Method to display book details
    public void display() {
        System.out.println("BookId: " + bookId + ", Book Name: " + bookName + ", Author Name: " + authorName);
    }
}

public class Booksques {
    public static void main(String[] args) {
        // Creating an ArrayList to store Book objects
        ArrayList<Book> bookList = new ArrayList<>();

        // Adding Book objects to the list
        bookList.add(new Book(101, "book1", "author1"));
        bookList.add(new Book(102, "book2", "author2"));
        bookList.add(new Book(103, "book3", "author3"));
        // Using an advanced for loop to display all book details
        for (Book book : bookList) {
            book.display();
        }
    }
}
>>>>>>> d5fa77123764c975fd733818b5f9fbfcee1af006
