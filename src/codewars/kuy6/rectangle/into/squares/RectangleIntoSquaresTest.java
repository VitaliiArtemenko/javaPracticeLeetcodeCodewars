package rectangle.into.squares;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleIntoSquaresTest {

    @Test
    public void sqInRect() {
        assertEquals(new ArrayList<>(Arrays.asList(3, 2, 1, 1)), RectangleIntoSquares.sqInRect(5, 3));
        assertEquals(new ArrayList<>(Arrays.asList(3, 2, 1, 1)), RectangleIntoSquares.sqInRect(3, 5));
        assertNull(RectangleIntoSquares.sqInRect(5, 5));
        assertEquals(new ArrayList<>(Arrays.asList(14, 6, 6, 2, 2, 2)),
                RectangleIntoSquares.sqInRect(14, 20));
        assertEquals(new ArrayList<>(Arrays.asList(14, 14, 9, 5, 4, 1, 1, 1, 1)),
                RectangleIntoSquares.sqInRect(37, 14));
        assertEquals(new ArrayList<>(Arrays.asList(230, 230, 230, 41, 41, 41, 41, 41, 25, 16, 9, 7, 2, 2, 2, 1, 1)),
                RectangleIntoSquares.sqInRect(731, 230));
    }
}