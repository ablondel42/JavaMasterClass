package Section_6.Exercice_15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOddRangeTest {

    @Test
    void isOdd() {
        assertFalse(SumOddRange.isOdd(0));
        assertFalse(SumOddRange.isOdd(2));
        assertTrue(SumOddRange.isOdd(1));
        assertTrue(SumOddRange.isOdd(3));
    }

    @Test
    void sumOdd() {
        assertEquals(2500, SumOddRange.sumOdd(1, 100));
        assertEquals(-1, SumOddRange.sumOdd(-1, 100));
        assertEquals(0, SumOddRange.sumOdd(100, 100));
        assertEquals(13, SumOddRange.sumOdd(13, 13));
        assertEquals(-1, SumOddRange.sumOdd(100, -100));
        assertEquals(247500, SumOddRange.sumOdd(100, 1000));
    }
}