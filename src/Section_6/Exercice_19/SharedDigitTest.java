package Section_6.Exercice_19;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SharedDigitTest {

    @Test
    void hasSharedDigit() {
        assertTrue(SharedDigit.hasSharedDigit(12, 23));
        assertFalse(SharedDigit.hasSharedDigit(9, 99));
        assertTrue(SharedDigit.hasSharedDigit(15, 55));
    }
}