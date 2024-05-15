package Section_7.Exercice_35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexNumberTest {
    ComplexNumber firstNumber = new ComplexNumber(1.0, 1.0);
    ComplexNumber secondNumber = new ComplexNumber(2.5, -1.5);

    @Test
    void getComplexNumber() {
        firstNumber.add(1, 1);
        assertEquals(2.0, firstNumber.getReal());
        assertEquals(2.0, firstNumber.getImaginary());
        firstNumber.subtract(secondNumber);
        assertEquals(-0.5, firstNumber.getReal());
        assertEquals(3.5, firstNumber.getImaginary());
        secondNumber.subtract(firstNumber);
        assertEquals(3.0, secondNumber.getReal());
        assertEquals(-5.0, secondNumber.getImaginary());
    }
}