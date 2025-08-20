package mypackage;

import static org.junit.Assert.assertEquals;  // ✅ Add this line
import org.junit.Test;

public class MyCalculatorTest {

    MyCalculator calc = new MyCalculator();

    @Test
    public void test() {
        assertEquals(70, calc.sum(40, 30));
        assertEquals(10, calc.diff(40, 30));
        assertEquals(1200, calc.mult(40, 30));
    }
}
