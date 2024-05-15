package Section_7.Exercice_30;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    private final SimpleCalculator calculator = new SimpleCalculator();

    @Test
    void getAdditionResult() {
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        assertEquals(9.0, calculator.getAdditionResult());
    }

    @Test
    void getSubtractionResult() {
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        assertEquals(1.0, calculator.getSubtractionResult());
    }

    @Test
    void getMultiplicationResult() {
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        assertEquals(0.0, calculator.getMultiplicationResult());
    }

    @Test
    void getDivisionResult() {
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        assertEquals(0.0, calculator.getDivisionResult());
    }
}