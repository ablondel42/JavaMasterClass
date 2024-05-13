package Section_6.Exercice_14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfDaysInMonthTest {

    @Test
    void isLeapYear() {
        assertFalse(NumberOfDaysInMonth.isLeapYear(-1600));
        assertTrue(NumberOfDaysInMonth.isLeapYear(1600));
        assertFalse(NumberOfDaysInMonth.isLeapYear(2017));
        assertTrue(NumberOfDaysInMonth.isLeapYear(2000));
    }

    @Test
    void getDaysInMonth() {
        assertEquals(31, NumberOfDaysInMonth.getDaysInMonth(1, 2020));
        assertEquals(29, NumberOfDaysInMonth.getDaysInMonth(2, 2020));
        assertEquals(28, NumberOfDaysInMonth.getDaysInMonth(2, 2018));
        assertEquals(-1, NumberOfDaysInMonth.getDaysInMonth(-1, 2020));
        assertEquals(-1, NumberOfDaysInMonth.getDaysInMonth(1, -2020));
    }
}