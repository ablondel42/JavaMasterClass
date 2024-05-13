package Section_5.Exercice_3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MegaBytesConverterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    private final MegaBytesConverter mbc = new MegaBytesConverter();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void printMegaBytesAndKiloBytes() {
        mbc.printMegaBytesAndKiloBytes(2500);
        assertEquals("2500 KB = 2 MB and 452 KB\n", outContent.toString());
        outContent.reset();

        mbc.printMegaBytesAndKiloBytes(-1024);
        assertEquals("Invalid Value\n", outContent.toString());
        outContent.reset();

        mbc.printMegaBytesAndKiloBytes(5000);
        assertEquals("5000 KB = 4 MB and 904 KB\n", outContent.toString());
        outContent.reset();
    }
}