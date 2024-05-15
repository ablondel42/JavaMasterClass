package Section_6.Exercice_25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlourPackerTest {

    @Test
    void canPack() {
        assertFalse(FlourPacker.canPack(1, 0, 4));
        assertTrue(FlourPacker.canPack(1, 0, 5));
        assertTrue(FlourPacker.canPack(0, 5, 4));
        assertTrue(FlourPacker.canPack(2, 2, 11));
        assertFalse(FlourPacker.canPack(-1, 2, 12));
    }
}