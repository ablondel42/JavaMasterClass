package Expressions_Statements.EqualSumChecker;

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