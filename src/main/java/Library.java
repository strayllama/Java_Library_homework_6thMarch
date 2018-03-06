import com.sun.tools.javah.Gen;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    // Instance variables
    private ArrayList<Book> shelves;   // list array containing book objects
    private int capacity;
    private HashMap<Genre, Integer> tracker;

    // Constructor method for Borrower
    public Library() {
        shelves = new ArrayList<>();
        capacity = 20;
        tracker = new HashMap<Genre, Integer>();
        tracker.put(Genre.Horror, 0);
        tracker.put(Genre.Drama, 0);
        tracker.put(Genre.Romatic, 0);
        tracker.put(Genre.Sifi, 0);
    }


    public int bookCount() {
        return this.shelves.size();
    }


    public void addBook(Book a_book) {
        if (this.bookCount() < this.capacity) {
            this.shelves.add(a_book);
            for (Genre each_genre : tracker.keySet()) {
                if (each_genre == a_book.getGenre()) {
                    int previous_count = tracker.get(each_genre);
                    int new_count = previous_count + 1;
                    tracker.put(each_genre, new_count);
                    System.out.println("Added a " + each_genre + " book to the library");  // For testing as books added
                } // end if matchin genre
            } // end for each genre
        }  // end if capacity not reached
    } // end method addBook

    public Book rentOutBook() {
        if (this.bookCount() > 0) {
            return this.shelves.remove(0);
        }
        return null;
    }

    public void listBookTracker(){
        for (Genre genre : tracker.keySet()) {
            System.out.println("Genre " + genre + " has " + tracker.get(genre) + " Books");
        }
    }


} // end class Library
