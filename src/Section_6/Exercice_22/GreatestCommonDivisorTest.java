package Section_6.Exercice_22;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {

    @Test
    void getGreatestCommonDivisor() {
        assertEquals(5, GreatestCommonDivisor.getGreatestCommonDivisor(25, 15));
        assertEquals(6, GreatestCommonDivisor.getGreatestCommonDivisor(12, 30));
        assertEquals(-1, GreatestCommonDivisor.getGreatestCommonDivisor(9, 18));
        assertEquals(9, GreatestCommonDivisor.getGreatestCommonDivisor(81, 153));
    }
}