import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void whenAddTenToFiveThenResultFifteen() {
        double expected = 15;
        double result = calculator.add(10,5);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void when5addTo10AsStringThenResult15() {
        double expected = 15;
        double result = calculator.add("10","5");
        assertEquals(expected, result, 0.001);
    }

    @Test(expected = NumberFormatException.class)
    public void whenInputIncorrectValueToAddThenThrowException() {
            calculator.add("asd","5");
    }

    @Test
    public void whenAdd50To100ThenResult150() {
        double expected = 150;
        double result = calculator.add(100,50);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void whenAdd50To100AsStringThenResult150() {
        double expected = 150;
        double result = calculator.add("100","50");
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void whenDivide15By5ThenResult3() {
        double expected = 3;
        double result = calculator.divide(15,5);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void whenDivide10By500ThenResult0_02() {
        double expected = 0.02;
        double result = calculator.divide(10,500);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void whenDivide15By5AsStringThenResult3() {
        double expected = 3;
        double result = calculator.divide("15", "5");
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void whenDivide10By500AsStringThenResult0_02() {
        double expected = 0.02;
        double result = calculator.divide("10","500");
        assertEquals(expected, result, 0.001);
    }

    @Test(expected = NumberFormatException.class)
    public void whenInputIncorrectValueToDivideThenThrowException() {
        calculator.divide("asd","5");
    }

    @Test
    public void whenMultiple2By3ThenResult6() {
        double expected = 6;
        double result = calculator.multiple(2,3);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void whenMultiple10By0_05ThenResult0_5() {
        double expected = 0.5;
        double result = calculator.multiple(10,0.05);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void whenSquareOf10ThenResult100() {
        double expected = 100;
        double result = calculator.square(10);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void whenSquareOf0_5ThenResult0_25() {
        double expected = 0.25;
        double result = calculator.square(0.5);
        assertEquals(expected, result, 0.001);
    }

    @After
    public void close() {
        calculator = null;
    }
}