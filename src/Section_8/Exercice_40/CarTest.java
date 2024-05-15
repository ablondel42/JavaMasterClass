package Section_8.Exercice_40;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    private final Car car = new Car(8, "Base car");
    private final Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
    private final Ford ford = new Ford(6, "Ford Falcon");
    private final Holden holden = new Holden(6, "Holden Commodore");

    @Test
    void startEngine() {
        assertEquals("Car -> startEngine()", car.startEngine());
        assertEquals("Mitsubishi -> startEngine()", mitsubishi.startEngine());
        assertEquals("Ford -> startEngine()", ford.startEngine());
        assertEquals("Holden -> startEngine()", holden.startEngine());
    }

    @Test
    void accelerate() {
        assertEquals("Car -> accelerate()", car.accelerate());
        assertEquals("Mitsubishi -> accelerate()", mitsubishi.accelerate());
        assertEquals("Ford -> accelerate()", ford.accelerate());
        assertEquals("Holden -> accelerate()", holden.accelerate());
    }

    @Test
    void brake() {
        assertEquals("Car -> brake()", car.brake());
        assertEquals("Mitsubishi -> brake()", mitsubishi.brake());
        assertEquals("Ford -> brake()", ford.brake());
        assertEquals("Holden -> brake()", holden.brake());
    }
}