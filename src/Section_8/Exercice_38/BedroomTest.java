package Section_8.Exercice_38;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class BedroomTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final Wall wall1 = new Wall("West");
    private final Wall wall2 = new Wall("East");
    private final Wall wall3 = new Wall("South");
    private final Wall wall4 = new Wall("North");
    private final Ceiling ceiling = new Ceiling(12, 55);
    private final Bed bed = new Bed("Modern", 4, 3, 2, 1);
    private final Lamp lamp = new Lamp("Classic", false, 75);
    private final Bedroom bedroom = new Bedroom("Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

    @BeforeEach
    void setOutputStream() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    void setOriginalOut() {
        System.setOut(originalOut);
    }

    @Test
    void getLamp() {
        bedroom.getLamp().turnOn();
        assertEquals("Lamp -> Turning on", outputStream.toString());
        outputStream.reset();
    }

    @Test
    void makeBed() {
        bedroom.makeBed();
        assertEquals("Bedroom -> Making bed | Bed -> Making | ", outputStream.toString());
        outputStream.reset();
    }
}