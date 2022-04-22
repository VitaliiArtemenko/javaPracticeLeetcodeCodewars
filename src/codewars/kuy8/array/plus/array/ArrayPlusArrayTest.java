package array.plus.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayPlusArrayTest {

    @Test
    public void arrayPlusArray1Test() {
        assertEquals(21, ArrayPlusArray.arrayPlusArray1(new int[]{1,2,3}, new int[]{4,5,6}));
        assertEquals(-21, ArrayPlusArray.arrayPlusArray1(new int[]{-1,-2,-3}, new int[]{-4,-5,-6}));
        assertEquals(15, ArrayPlusArray.arrayPlusArray1(new int[]{0,0,0}, new int[]{4,5,6}));
        assertEquals(2100, ArrayPlusArray.arrayPlusArray1(new int[]{100,200,300}, new int[]{400,500,600}));
    }

    @Test
    public void arrayPlusArray2Test() {
        assertEquals(21, ArrayPlusArray.arrayPlusArray2(new int[]{1,2,3}, new int[]{4,5,6}));
        assertEquals(-21, ArrayPlusArray.arrayPlusArray2(new int[]{-1,-2,-3}, new int[]{-4,-5,-6}));
        assertEquals(15, ArrayPlusArray.arrayPlusArray2(new int[]{0,0,0}, new int[]{4,5,6}));
        assertEquals(2100, ArrayPlusArray.arrayPlusArray2(new int[]{100,200,300}, new int[]{400,500,600}));
    }
}