import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {
    private PhoneBook phoneBook;

    @BeforeEach
    void setUp() {
        phoneBook = new PhoneBook();
    }

    @Test
    void addShouldReturnOneWhenFirstContactAdded() {
        int size = phoneBook.add("Petya", "123456");
        assertEquals(1, size);
    }

    @Test
    void addShouldReturnTwoWhenTwoDifferentContactsAdded() {
        phoneBook.add("Masha", "123456");
        int size = phoneBook.add("Kolya", "789012");
        assertEquals(2, size);
    }

    @Test
    void addShouldNotAddDuplicateName() {
        phoneBook.add("Petya", "123456");
        int size = phoneBook.add("Petya", "999999");
        assertEquals(1, size);
    }

    @Test
    void findByNumberShouldReturnNameWhenNumberExists() {
        phoneBook.add("Petya", "123456");
        String name = phoneBook.findByNumber("123456");
        assertEquals("Petya", name);
    }

    @Test
    void findByNumberShouldReturnNullWhenNumberNotFound() {
        String name = phoneBook.findByNumber("000000");
        assertNull(name);
    }
}
