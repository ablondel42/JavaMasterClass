package Section_5.Exercice_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualSumCheckerTest {

    @Test
    void hasEqualSum() {
        assertFalse(EqualSumChecker.hasEqualSum(1, 1, 1));
        assertTrue(EqualSumChecker.hasEqualSum(1, 1, 2));
        assertTrue(EqualSumChecker.hasEqualSum(1, -1, 0));
    }
}