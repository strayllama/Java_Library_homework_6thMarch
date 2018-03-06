import java.util.ArrayList;

public class Library {
    // Instance variables
    private ArrayList<Book> shelves;   // list array containing book objects
    private int capacity;

    // Constructor method for Borrower
    public Library() {
        shelves = new ArrayList<>();
        capacity = 20;
    }


    public int bookCount() {
        return this.shelves.size();
    }


    public void addBook(Book a_book) {
        if (this.bookCount() < this.capacity) {
            this.shelves.add(a_book);
        }
    }

    public Book rentOutBook() {
        if (this.bookCount() > 0) {
            return this.shelves.remove(0);
        }
        return null;
    }


} // end class Library
