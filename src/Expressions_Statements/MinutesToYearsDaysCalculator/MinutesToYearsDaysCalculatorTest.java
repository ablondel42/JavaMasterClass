package Expressions_Statements.MinutesToYearsDaysCalculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class MinutesToYearsDaysCalculatorTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setOutStream() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void setOriginalOut() {
        System.setOut(originalOut);
    }

    @Test
    void printYearsAndDays() {
        MinutesToYearsDaysCalculator.printYearsAndDays(525600);
        assertEquals("525600 min = 1 y and 0 d\n", outContent.toString());
        outContent.reset();

        MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
        assertEquals("1051200 min = 2 y and 0 d\n", outContent.toString());
        outContent.reset();

        MinutesToYearsDaysCalculator.printYearsAndDays(561600);
        assertEquals("561600 min = 1 y and 25 d\n", outContent.toString());
        outContent.reset();
    }
}