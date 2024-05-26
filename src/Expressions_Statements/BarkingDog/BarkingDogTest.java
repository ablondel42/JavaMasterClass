package Expressions_Statements.BarkingDog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarkingDogTest {

    @Test
    void shouldWakeUp() {
        assertTrue(BarkingDog.shouldWakeUp(true, 1));
        assertFalse(BarkingDog.shouldWakeUp(false, 2));
        assertFalse(BarkingDog.shouldWakeUp(true, 8));
        assertFalse(BarkingDog.shouldWakeUp(true, -1));
    }
}