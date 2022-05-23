package multiplesOf3and5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MultiplesOf3and5Test {

    @Test
    public void testMultiplesOf3and5() {
        assertEquals(23, MultiplesOf3and5.multiplesOf3and5(10));
        assertEquals(0, MultiplesOf3and5.multiplesOf3and5(-33));
        assertEquals(171858, MultiplesOf3and5.multiplesOf3and5(859));
        assertEquals(2470545, MultiplesOf3and5.multiplesOf3and5(3254));
        assertEquals(810, MultiplesOf3and5.multiplesOf3and5(60));
    }

    @Test
    public void testMultiplesOf3and5Stream() {
        assertEquals(23, MultiplesOf3and5.multiplesOf3and5Stream(10));
        assertEquals(0, MultiplesOf3and5.multiplesOf3and5Stream(-33));
        assertEquals(171858, MultiplesOf3and5.multiplesOf3and5Stream(859));
        assertEquals(2470545, MultiplesOf3and5.multiplesOf3and5Stream(3254));
        assertEquals(810, MultiplesOf3and5.multiplesOf3and5Stream(60));
    }
}