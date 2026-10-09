package math;

import br.com.yago.math.SimpleMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleMathSquareTest {

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
}
