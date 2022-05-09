package rectangle.into.squares;

import java.util.*;

public class RectangleIntoSquares {

    public static List<Integer> sqInRect(int lng, int wdth) {
        if (lng == wdth) {
            return null;
        }

        List<Integer> squares = new ArrayList<>();

        while (lng != wdth) {
            if (lng > wdth) {
                lng -= wdth;
                squares.add(wdth);
            }
            if (lng < wdth) {
                wdth -= lng;
                squares.add(lng);
            }
        }
        squares.add(lng);
        return squares;
    }
}