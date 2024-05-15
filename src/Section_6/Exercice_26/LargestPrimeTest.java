package Section_6.Exercice_26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestPrimeTest {

    @Test
    void getLargestPrime() {
        assertEquals(7, LargestPrime.getLargestPrime(21));
        assertEquals(31, LargestPrime.getLargestPrime(217));
        assertEquals(-1, LargestPrime.getLargestPrime(0));
        assertEquals(5, LargestPrime.getLargestPrime(45));
        assertEquals(-1, LargestPrime.getLargestPrime(-1));
    }
}