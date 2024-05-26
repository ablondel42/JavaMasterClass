package ControlFlow.DiagonalStar;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DiagonalStarTest {
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
    void printSquareStar() {
        DiagonalStar.printSquareStar(5);
        assertEquals("""
*****
** **
* * *
** **
*****
""", outputStream.toString());
        outputStream.reset();

        DiagonalStar.printSquareStar(8);
        assertEquals("""
********
**    **
* *  * *
*  **  *
*  **  *
* *  * *
**    **
********
""", outputStream.toString());
        outputStream.reset();

        DiagonalStar.printSquareStar(1);
        assertEquals("Invalid Value\n", outputStream.toString());
        outputStream.reset();
    }
}