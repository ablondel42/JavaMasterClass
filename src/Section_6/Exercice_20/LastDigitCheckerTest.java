package Section_6.Exercice_20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastDigitCheckerTest {

    @Test
    void hasSameLastDigit() {
        assertTrue(LastDigitChecker.hasSameLastDigit(41,22,71));
        assertTrue(LastDigitChecker.hasSameLastDigit(23,32,42));
        assertFalse(LastDigitChecker.hasSameLastDigit(9,99,999));
    }

    @Test
    void isValid() {
        assertTrue(LastDigitChecker.isValid(10));
        assertTrue(LastDigitChecker.isValid(468));
        assertFalse(LastDigitChecker.isValid(1051));
    }
}