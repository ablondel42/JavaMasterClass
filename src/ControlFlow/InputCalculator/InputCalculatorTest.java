package ControlFlow.InputCalculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class InputCalculatorTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    private final ByteArrayInputStream inputStream = new ByteArrayInputStream(
            "1\n2\n3\n4\n5\na\n".getBytes()
    );
    private final ByteArrayInputStream inputStream2 = new ByteArrayInputStream(
            "hello\n".getBytes()
    );

    @BeforeEach
    void setOutputStream() {
        System.setOut(new PrintStream(outputStream));
        System.setIn(inputStream);
    }

    @AfterEach
    void setOriginalOut() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    void inputThenPrintSumAndAverage() {
        InputCalculator.inputThenPrintSumAndAverage();
        assertEquals("SUM = 15 AVG = 3\n", outputStream.toString());
        outputStream.reset();
        inputStream.reset();

        System.setIn(inputStream2);
        InputCalculator.inputThenPrintSumAndAverage();
        assertEquals("SUM = 0 AVG = 0\n", outputStream.toString());
        outputStream.reset();
        inputStream.reset();
        inputStream2.reset();
    }
}