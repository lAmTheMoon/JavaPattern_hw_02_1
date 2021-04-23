package hw_02_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IntsCalculatorTest {

    @Test
    void sum() {
        Ints intsCalc = new IntsCalculator();
        int actual = intsCalc.sum(2, 2);
        int expected = 2 + 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void mult() {
        Ints intsCalc = new IntsCalculator();
        int actual = intsCalc.mult(8, 2);
        int expected = 8 * 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void pow() {
        Ints intsCalc = new IntsCalculator();
        int actual = intsCalc.pow(3, 2);
        int expected = (int) Math.pow(3, 2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void pow2() {
        Ints intsCalc = new IntsCalculator();
        int actual = intsCalc.pow(3, 0);
        int expected = (int) Math.pow(3, 0);
        Assertions.assertEquals(expected, actual);
    }
}