package Section_5.Exercice_2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class SpeedConverterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void toMilesPerHour() {
        assertEquals(1, SpeedConverter.toMilesPerHour(1.5));
        assertEquals(6, SpeedConverter.toMilesPerHour(10.25));
        assertEquals(-1, SpeedConverter.toMilesPerHour(-5.6));
        assertEquals(16, SpeedConverter.toMilesPerHour(25.42));
        assertEquals(47, SpeedConverter.toMilesPerHour(75.114));
    }

    @Test
    void printConversion() {
        SpeedConverter.printConversion(1.5);
        assertEquals("1.5 km/h = 1 mi/h\n", outContent.toString());
        outContent.reset();

        SpeedConverter.printConversion(10.25);
        assertEquals("10.25 km/h = 6 mi/h\n", outContent.toString());
        outContent.reset();

        SpeedConverter.printConversion(-5.6);
        assertEquals("Invalid Value\n", outContent.toString());
        outContent.reset();

        SpeedConverter.printConversion(25.42);
        assertEquals("25.42 km/h = 16 mi/h\n", outContent.toString());
        outContent.reset();

        SpeedConverter.printConversion(75.114);
        assertEquals("75.114 km/h = 47 mi/h\n", outContent.toString());
        outContent.reset();
    }
}