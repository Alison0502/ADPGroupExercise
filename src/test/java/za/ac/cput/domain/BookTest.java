/*
 * Book.java
 * This is the Book test
 * @author Alison Shirlene Williams(219140987),
 *
 *
 */
package za.ac.cput.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class TestBook {
    @Test
    public void testObjectEquality(){
        Book book1 = new Book("A Risk on Forever", "N. S. Perkins", "FIC027020");
        Book book2 = new Book("A Risk on Forever", "N. S. Perkins", "FIC027020");
        assertEquals(book1, book2);

    }

    @Test
    public void testObjectIdentity() {
        Book book1 = new Book("A Risk on Forever", "N. S. Perkins", "FIC027020");
        Book book2 = new Book("A Risk on Forever", "N. S. Perkins", "FIC027020");
        assertNotSame(book1, book2);
    }

    @Test
    public void testFailingTest() {
        assertThrows(NullPointerException.class, () -> new Book("", "N. S. Perkins", "FIC027020"));
        assertThrows(NullPointerException.class, () -> new Book("Love and Other Words", null, "FIC044000"));
        assertThrows(IllegalArgumentException.class, () -> new Book("The Dead Romantics", "Ashley Poston", null));
    }


    @Test
    @Timeout(1)
    public void testTimeout()  {
        assertTimeoutPreemptively(Duration.ofSeconds(1), () -> {
            Book book = new Book("Love and Other Words", "Christina Lauren", "FIC044000");
            assertEquals("Love and Other Words", book.getTitle());
            assertEquals("Christina Lauren", book.getAuthor());
            assertEquals("FIC044000", book.getIsbn());
        });
    }



    @Test
    @Disabled("Test currently disabled")
    void testDisabled() {
        Book book = new Book("The Dead Romantics", "Ashley Poston", "FIC026490");
        assertNotNull(book);
    }
}