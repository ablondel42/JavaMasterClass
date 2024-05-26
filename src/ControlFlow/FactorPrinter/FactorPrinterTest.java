package ControlFlow.FactorPrinter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class FactorPrinterTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setOutputStream() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void setOriginalOut() {
        System.setOut(originalOut);
    }

    @Test
    void printFactors() {
        FactorPrinter.printFactors(6);
        assertEquals("1\n2\n3\n6\n", outputStream.toString());
        outputStream.reset();
        FactorPrinter.printFactors(32);
        assertEquals("1\n2\n4\n8\n16\n32\n", outputStream.toString());
        outputStream.reset();
        FactorPrinter.printFactors(10);
        assertEquals("1\n2\n5\n10\n", outputStream.toString());
        outputStream.reset();
        FactorPrinter.printFactors(-1);
        assertEquals("Invalid Value\n", outputStream.toString());
        outputStream.reset();
    }
}