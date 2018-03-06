import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBorrower {
    Library mainLibrary;
    Book book;
    Borrower person;

    @Before
    public void before(){
        mainLibrary = new Library();
        book = new Book();
        person = new Borrower();
    }

    @Test
    public void canAddBookToCollection(){
        this.person.addBook(book);
        assertEquals(1, this.person.collectionSize());
    }
    @Test
    public void canRentBook(){
        this.mainLibrary.addBook(book);
        this.person.rentBook(mainLibrary);
        assertEquals(0, this.mainLibrary.bookCount());
    }

}
