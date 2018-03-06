import com.sun.tools.javah.Gen;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLibrary {
    Library mainLibrary;
    Book book;
    Book book2;
    Book book3;
    Book book4;
    Book book5;
    Book book6;
    Book book7;

    @Before
    public void before(){
        this.mainLibrary = new Library();
        this.book = new Book(Genre.Sifi);
        this.book2 = new Book(Genre.Sifi);
        this.book3 = new Book(Genre.Drama);
        this.book4 = new Book(Genre.Sifi);
        this.book5 = new Book(Genre.Romatic);
        this.book6 = new Book(Genre.Sifi);
        this.book7 = new Book(Genre.Sifi);
    }

    @Test
    public void canCount(){
        assertEquals(0,this.mainLibrary.bookCount());
    }

    @Test
    public void canAddBook(){
        this.mainLibrary.addBook(book);
        assertEquals(1, this.mainLibrary.bookCount());
    }

    @Test
    public void canRentBook(){
        this.mainLibrary.addBook(book);
        assertEquals(book,this.mainLibrary.rentOutBook());
    }

    @Test
    public void listGenreTracker(){
        mainLibrary.listBookTracker();
        // see print out!
    }

    @Test
    public void addedBooksGenresGetTracked(){
        mainLibrary.addBook(book);
        mainLibrary.addBook(book2);
        mainLibrary.addBook(book3);
        mainLibrary.addBook(book4);
        mainLibrary.addBook(book5);
        mainLibrary.addBook(book6);
        mainLibrary.addBook(book7);
        mainLibrary.listBookTracker();
        // see print out!
    }

} // end class TestLibrary
