package cypds.actividad2.factorial;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void testMultiplyPositive() {
        assertEquals(12L, Factorial.multiply(3, 4));
        assertEquals(12L, Factorial.multiply(4, 3));
    }

    @Test
    void testMultiplyZero() {
        assertEquals(0L, Factorial.multiply(0, 5));
        assertEquals(0L, Factorial.multiply(5, 0));
    }

    @Test
    void testMultiplyNegative() {
        assertEquals(-12L, Factorial.multiply(-3, 4));
        assertEquals(-12L, Factorial.multiply(3, -4));
        assertEquals(12L, Factorial.multiply(-3, -4));
    }

    @Test
    void testFactorialSmall() {
        assertEquals(1L, Factorial.factorial(0));
        assertEquals(1L, Factorial.factorial(1));
        assertEquals(2L, Factorial.factorial(2));
        assertEquals(6L, Factorial.factorial(3));
        assertEquals(24L, Factorial.factorial(4));
        assertEquals(120L, Factorial.factorial(5));
    }

    @Test
    void testFactorial20() {
        assertEquals(2432902008176640000L, Factorial.factorial(20));
    }

    @Test
    void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
    }
}
