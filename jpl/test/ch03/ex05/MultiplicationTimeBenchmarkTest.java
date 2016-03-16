package test.ch03.ex05;

import org.junit.Test;

import src.ch03.ex05.MultiplicationTimeBenchmark;
import test.ch03.common.MyDJUnitTestCase;

public class MultiplicationTimeBenchmarkTest extends MyDJUnitTestCase {


	@Test
	public void testMultiplicationTimeBenchmark() {

		int expected = 10;
		MultiplicationTimeBenchmark m = new MultiplicationTimeBenchmark(expected);
		int result = (int)(getPrivateFieldValue(m, "loop"));
		assertEquals(expected, result);
	}

	@Test
	public void testRepeat() {
		MultiplicationTimeBenchmark m = new MultiplicationTimeBenchmark(10);
		addReturnValue("System","nanoTime", (long)10);
		addReturnValue("System","nanoTime", (long)20);

		long result = m.repeat(10);

		long expected = 10;

		assertEquals(result, expected);
	}

}
