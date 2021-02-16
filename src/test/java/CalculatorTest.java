import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {
        Calculator calculator = new Calculator();
        double expected = 15;
        double result = calculator.add(10,5);
        assertEquals(expected, result, 0.001);
        double expected2 = 150;
        double result2 = calculator.add(100,50);
        assertEquals(expected2, result2, 0.001);
    }

    @Test
    public void divide() {
        Calculator calculator = new Calculator();
        double expexted = 3;
        double result = calculator.divide(15,5);
        assertEquals(expexted, result, 0.001);
        double expexted2 = 0.02;
        double result2 = calculator.divide(10,500);
        assertEquals(expexted2, result2, 0.001);
    }

    @Test
    public void multiple() {
        Calculator calculator = new Calculator();
        double expexted = 6;
        double result = calculator.multiple(2,3);
        assertEquals(expexted, result, 0.001);
        double expexted2 = 0.5;
        double result2 = calculator.multiple(10,0.05);
        assertEquals(expexted2, result2, 0.001);
    }

    @Test
    public void square() {
        Calculator calculator = new Calculator();
        double expexted = 100;
        double result = calculator.square(10);
        assertEquals(expexted, result, 0.001);
        double expexted2 = 0.25;
        double result2 = calculator.square(0.5);
        assertEquals(expexted2, result2, 0.001);
    }
}