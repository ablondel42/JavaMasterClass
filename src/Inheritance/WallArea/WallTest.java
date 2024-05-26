package Inheritance.WallArea;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WallTest {
    private final Wall wall = new Wall(5, 4);

    @Test
    void getWidth() {
        assertEquals(5.0, wall.getWidth());
    }

    @Test
    void getHeight() {
        wall.setHeight(-1.5);
        assertEquals(0, wall.getHeight());
    }

    @Test
    void getArea() {
        assertEquals(20.0, wall.getArea());
    }
}