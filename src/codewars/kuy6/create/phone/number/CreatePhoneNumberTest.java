package create.phone.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreatePhoneNumberTest {

    @Test
    public void testCreatePhoneNumber() {
        assertEquals("(123) 456-7890",
                CreatePhoneNumber.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        assertEquals("(111) 111-1111",
                CreatePhoneNumber.createPhoneNumber(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
        assertEquals("(239) 398-7718",
                CreatePhoneNumber.createPhoneNumber(new int[] {2, 3, 9, 3, 9, 8, 7, 7, 1, 8}));
        assertEquals("(772) 384-0765",
                CreatePhoneNumber.createPhoneNumber(new int[] {7, 7, 2, 3, 8, 4, 0, 7, 6, 5}));
        assertEquals("(070) 748-7673",
                CreatePhoneNumber.createPhoneNumber(new int[] {0, 7, 0, 7, 4, 8, 7, 6, 7, 3}));
    }
}