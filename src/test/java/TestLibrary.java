import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLibrary {
    Library mainLibrary;
    Book book;

    @Before
    public void before(){
        this.mainLibrary = new Library();
        this.book = new Book();
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


} // end class TestLibrary
