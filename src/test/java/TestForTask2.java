import JavaOOP.Controllers.Controller;
import JavaOOP.Model.Book;
import org.junit.*;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;


public class TestForTask2 {
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void init() {
        book1 = new Book("book1", "author1", "pubHouse1", 1900, 200, 200);
        book2 = new Book("book1", "author1", "pubHouse1", 1900, 200, 200);
        book3 = new Book("book2", "author1", "pubHouse1", 1900, 200, 200);
    }

    @After
    public void clear() {
        book1 = null;
        book2 = null;
        book3 = null;
    }

    @Test
    public void equalsBooksTest() {
        assertTrue(book1.equals(book1));
        assertTrue(book1.equals(book2));
        assertFalse(book1.equals(book3));
    }

    @Test
    public void hashCodeForBooksTest() {
        assertEquals(book1.hashCode(), book2.hashCode());
        assertNotEquals(book1.hashCode(), book3.hashCode());
    }

    @Test
    public void sortBooksTest() {


        Book[] sorted = {
                new Book("book1", "author1", "pubHouse1", 1900, 200, 200),
                new Book("book2", "author1", "pubHouse2", 1900, 200, 200),
                new Book("book3", "author1", "pubHouse3", 1900, 200, 200),
        };
        Book[] unsorted = {
                new Book("book2", "author1", "pubHouse2", 1900, 200, 200),
                new Book("book3", "author1", "pubHouse3", 1900, 200, 200),
                new Book("book1", "author1", "pubHouse1", 1900, 200, 200),
        };
        Controller controller = new Controller(unsorted);
        Book[] actual = controller.sortBooksByPublishingHouse();

        for (int i = 0; i < sorted.length; i++) {
            assertEquals(sorted[i], actual[i]);
        }
    }
}
