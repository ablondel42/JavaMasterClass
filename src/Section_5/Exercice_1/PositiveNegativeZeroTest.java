package Section_5.Exercice_1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PositiveNegativeZeroTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PositiveNegativeZero pnz = new PositiveNegativeZero();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void checkNumber() {
        pnz.checkNumber(1);
        assertEquals("positive\n", outContent.toString());
        outContent.reset();

        pnz.checkNumber(0);
        assertEquals("zero\n", outContent.toString());
        outContent.reset();

        pnz.checkNumber(-1);
        assertEquals("negative\n", outContent.toString());
        outContent.reset();
    }
}