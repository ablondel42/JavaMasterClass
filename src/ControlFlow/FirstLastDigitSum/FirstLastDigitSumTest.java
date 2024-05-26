package ControlFlow.FirstLastDigitSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstLastDigitSumTest {

    @Test
    void sumFirstAndLastDigit() {
        assertEquals(4, FirstLastDigitSum.sumFirstAndLastDigit(252));
        assertEquals(9, FirstLastDigitSum.sumFirstAndLastDigit(257));
        assertEquals(0, FirstLastDigitSum.sumFirstAndLastDigit(0));
        assertEquals(10, FirstLastDigitSum.sumFirstAndLastDigit(5));
        assertEquals(-1, FirstLastDigitSum.sumFirstAndLastDigit(-10));
    }
}