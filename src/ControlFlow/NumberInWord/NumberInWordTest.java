package ControlFlow.NumberInWord;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class NumberInWordTest {
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
    void printNumberInWord() {
        NumberInWord.printNumberInWord(0);
        assertEquals("ZERO\n", outputStream.toString());
        outputStream.reset();
        NumberInWord.printNumberInWord(1);
        assertEquals("ONE\n", outputStream.toString());
        outputStream.reset();
        NumberInWord.printNumberInWord(2);
        assertEquals("TWO\n", outputStream.toString());
        outputStream.reset();
        NumberInWord.printNumberInWord(3);
        assertEquals("THREE\n", outputStream.toString());
        outputStream.reset();
        NumberInWord.printNumberInWord(4);
        assertEquals("FOUR\n", outputStream.toString());
        outputStream.reset();
        NumberInWord.printNumberInWord(5);
        assertEquals("FIVE\n", outputStream.toString());
        outputStream.reset();
        NumberInWord.printNumberInWord(6);
        assertEquals("SIX\n", outputStream.toString());
        outputStream.reset();
        NumberInWord.printNumberInWord(7);
        assertEquals("SEVEN\n", outputStream.toString());
        outputStream.reset();
        NumberInWord.printNumberInWord(8);
        assertEquals("EIGHT\n", outputStream.toString());
        outputStream.reset();
        NumberInWord.printNumberInWord(9);
        assertEquals("NINE\n", outputStream.toString());
        outputStream.reset();
        NumberInWord.printNumberInWord(10);
        assertEquals("other\n", outputStream.toString());
        outputStream.reset();
    }
}