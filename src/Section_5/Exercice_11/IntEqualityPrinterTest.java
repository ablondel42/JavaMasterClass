package Section_5.Exercice_11;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class IntEqualityPrinterTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setOutputStream() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    void setOriginalOut() {
        System.setOut(originalOut);
    }

    @Test
    void printEqual() {
        IntEqualityPrinter.printEqual(1, 1, 1);
        assertEquals("All numbers are equal\n", outputStream.toString());
        outputStream.reset();

        IntEqualityPrinter.printEqual(1, 1, 2);
        assertEquals("Neither all are equal or different\n", outputStream.toString());
        outputStream.reset();

        IntEqualityPrinter.printEqual(-1, -1, -1);
        assertEquals("Invalid Value\n", outputStream.toString());
        outputStream.reset();

        IntEqualityPrinter.printEqual(1, 2, 3);
        assertEquals("All numbers are different\n", outputStream.toString());
        outputStream.reset();
    }
}