package Expressions_Statements.DecimalComparator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecimalComparatorTest {

    @Test
    void areEqualByThreeDecimalPlaces() {
        assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
        assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
        assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
}