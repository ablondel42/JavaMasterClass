package Arrays.ReverseArray;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void testReverseArray() {
        ReverseArray.reverse(new int[] {1, 2, 3, 4, 5});
        assertEquals("Array = [1, 2, 3, 4, 5]\nReversed array = [5, 4, 3, 2, 1]\n", outputStream.toString());
        outputStream.reset();
    }
}