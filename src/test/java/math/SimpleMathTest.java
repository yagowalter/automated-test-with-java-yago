package math;

import br.com.yago.math.SimpleMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleMathTest {

    @Test
    void testSum() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;

        Double actual = math.sum(firstNumber, secondNumber);
        double expected = 8.2D;

        assertEquals(expected, actual, () -> firstNumber + " + " + secondNumber + " did not produce " + expected);
        assertNotEquals(9.2, actual);
        assertNotNull(actual);
    }

    @Test
    void subTest(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;

        Double actual = math.subtraction(firstNumber, secondNumber);
        double expected = 4.2D;

        assertEquals(expected, actual, () -> firstNumber + " - " + secondNumber + " did not produce " + expected);
        assertNotEquals(9.2, actual);
        assertNotNull(actual);
    }

    @Test
    void squareTest() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;

        Double actual = math.squareRoot(firstNumber);
        double expected = 2.48D;

        assertEquals(expected, actual, 0.01D, () -> "SquareRoot of "+ firstNumber + " did not produce " + expected);
        assertNotEquals(9.2, actual);
        assertNotNull(actual);
    }

    @Test
    void multTest(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;

        Double actual = math.multiplication(firstNumber, secondNumber);
        double expected = 12.4D;

        assertEquals(expected, actual, () -> firstNumber + " * " + secondNumber + " did not produce " + expected);
        assertNotEquals(9.2, actual);
        assertNotNull(actual);
    }

    @Test
    void medTest() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;

        Double actual = math.mean(firstNumber, secondNumber);
        double expected = 4.1D;

        assertEquals(expected, actual, () -> "The mean of " + firstNumber + " and " + secondNumber + " did not produce " + expected);
        assertNotEquals(9.2, actual);
        assertNotNull(actual);
    }

    @Test
    void divTest() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;

        Double actual = math.division(firstNumber, secondNumber);
        double expected = 3.1D;

        assertEquals(expected, actual, () -> firstNumber + " / " + secondNumber + " did not produce " + expected);
        assertNotEquals(9.2, actual);
        assertNotNull(actual);
    }
}
