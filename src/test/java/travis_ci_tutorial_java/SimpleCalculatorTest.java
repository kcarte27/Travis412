package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
		assertEquals(calc.subtract(5, 3), 2);
		assertEquals(calc.multiply(4, 4), 16);
		assertEquals(calc.divide(2, 2), 1);
	}
}
