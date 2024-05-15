package Section_7.Exercice_33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    private final Point firstPoint = new Point(6, 5);
    private final Point secondPoint = new Point(3, 1);
    private final Point thirdPoint = new Point();

    @Test
    void distance() {
        assertEquals(7.810249675906654, firstPoint.distance());
    }

    @Test
    void testDistance() {
        assertEquals(5.0, firstPoint.distance(secondPoint));
    }

    @Test
    void testDistance1() {
        assertEquals(5.0, firstPoint.distance(2, 2));
    }

    @Test
    void testNoDistance() {
        assertEquals(0.0, thirdPoint.distance());
    }
}