package reverse.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseNumberTest {

    @Test
    public void reverse() {
        assertEquals( 321, ReverseNumber.reverse( 123 ));
        assertEquals( -321, ReverseNumber.reverse( -123 ));
        assertEquals( 1, ReverseNumber.reverse( 1000 ));
        assertEquals( 4321234, ReverseNumber.reverse( 4321234 ));
        assertEquals( 0, ReverseNumber.reverse( 0 ));
        assertEquals( 5, ReverseNumber.reverse( 5 ));
        assertEquals( 89898989, ReverseNumber.reverse( 98989898 ));
    }
}