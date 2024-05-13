package Section_5.Exercice_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeenNumberCheckerTest {

    @Test
    void hasTeen() {
        assertTrue(TeenNumberChecker.hasTeen(9, 99, 19));
        assertTrue(TeenNumberChecker.hasTeen(23, 15, 42));
        assertFalse(TeenNumberChecker.hasTeen(22, 23, 34));
    }

    @Test
    void isTeen() {
        assertFalse(TeenNumberChecker.isTeen(9));
        assertTrue(TeenNumberChecker.isTeen(13));
    }
}