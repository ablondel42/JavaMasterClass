package Inheritance.CarpetCostCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarpetCostCalculatorTest {

    @Test
    void getTotalCost() {
        Carpet carpet1 = new Carpet(3.5);
        Floor floor1 = new Floor(2.75, 4.0);
        Calculator calculator1 = new Calculator(floor1, carpet1);
        assertEquals(38.5, calculator1.getTotalCost());

        Carpet carpet2 = new Carpet(1.5);
        Floor floor2 = new Floor(5.4, 4.5);
        Calculator calculator2 = new Calculator(floor2, carpet2);
        assertEquals(36.45, calculator2.getTotalCost());
    }
}