package Section_5.Exercice_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    void isLeapYear() {
        assertFalse(LeapYear.isLeapYear(-1600));
        assertTrue(LeapYear.isLeapYear(1600));
        assertFalse(LeapYear.isLeapYear(2017));
        assertTrue(LeapYear.isLeapYear(2000));
    }
}