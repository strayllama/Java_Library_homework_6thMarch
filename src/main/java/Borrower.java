import java.util.ArrayList;

public class Borrower {
    // Instance variables
    private ArrayList<Book> collection;

    // Constructor Method for Borrower
    public Borrower(){
        collection = new ArrayList<>();
    }


    public int collectionSize() {
        return this.collection.size();
    }

    public void addBook(Book a_book){
        this.collection.add(a_book);
    }

    public void rentBook(Library a_library) {
        this.collection.add(a_library.rentOutBook());
    }


} // end class Borrower
