package Inheritance.PoolArea;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuboidTest {
    private final Rectangle rectangle = new Rectangle(5, 10);
    private final Cuboid cuboid = new Cuboid(5,10,5);

    @Test
    void getWidth() {
        assertEquals(5.0, rectangle.getWidth());
        assertEquals(5.0, cuboid.getWidth());
    }

    @Test
    void getLength() {
        assertEquals(10.0, rectangle.getLength());
        assertEquals(10.0, cuboid.getLength());
    }

    @Test
    void getArea() {
        assertEquals(50.0, rectangle.getArea());
        assertEquals(50.0, cuboid.getArea());
    }

    @Test
    void getHeight() {
        assertEquals(5.0, cuboid.getHeight());
    }

    @Test
    void getVolume() {
        assertEquals(250.0, cuboid.getVolume());
    }
}