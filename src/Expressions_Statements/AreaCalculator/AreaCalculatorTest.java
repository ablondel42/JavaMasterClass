package Expressions_Statements.AreaCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaCalculatorTest {

    @Test
    void area() {
        assertEquals(78.53981633974483, AreaCalculator.area(5.0));
        assertEquals(-1, AreaCalculator.area(-1));
        assertEquals(20.0, AreaCalculator.area(5.0, 4.0));
        assertEquals(-1, AreaCalculator.area(-1.0, 4.0));
    }

}