package Section_7.Exercice_36;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {
    private final Circle circle = new Circle(3.75);
    private final Cylinder cylinder = new Cylinder(5.55, 7.25);

    @Test
    void getRadius() {
        assertEquals(3.75, circle.getRadius());
        assertEquals(5.55, cylinder.getRadius());
    }

    @Test
    void getArea() {
        assertEquals(44.178646691106465, circle.getArea());
        assertEquals(96.76890771219959, cylinder.getArea());
    }

    @Test
    void getHeight() {
        assertEquals(7.25, cylinder.getHeight());
    }

    @Test
    void getVolume() {
        assertEquals(701.574580913447, cylinder.getVolume());
    }
}