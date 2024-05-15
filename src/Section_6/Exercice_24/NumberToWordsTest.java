package Section_6.Exercice_24;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class NumberToWordsTest {
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
    void numberToWords() {
        NumberToWords.numberToWords(123);
        assertEquals("One\nTwo\nThree\n", outputStream.toString());
        outputStream.reset();
        NumberToWords.numberToWords(1010);
        assertEquals("One\nZero\nOne\nZero\n", outputStream.toString());
        outputStream.reset();
        NumberToWords.numberToWords(1000);
        assertEquals("One\nZero\nZero\nZero\n", outputStream.toString());
        outputStream.reset();
        NumberToWords.numberToWords(-12);
        assertEquals("Invalid Value\n", outputStream.toString());
        outputStream.reset();
    }

    @Test
    void reverse() {
        assertEquals(-121, NumberToWords.reverse(-121));
        assertEquals(2121, NumberToWords.reverse(1212));
        assertEquals(4321, NumberToWords.reverse(1234));
        assertEquals(1, NumberToWords.reverse(100));
    }

    @Test
    void getDigitCount() {
        assertEquals(1, NumberToWords.getDigitCount(0));
        assertEquals(3, NumberToWords.getDigitCount(123));
        assertEquals(-1, NumberToWords.getDigitCount(-12));
        assertEquals(4, NumberToWords.getDigitCount(5200));
    }
}