package test.ch03.ex06;

import org.junit.Test;

import src.ch03.ex06.Battery;
import test.ch03.common.MyDJUnitTestCase;

public class BatteryTest extends MyDJUnitTestCase {

	@Test
	public void testEmptyTrue() {
		Battery b = new Battery();
		boolean result = b.empty();
		assertTrue(result);
	}

	@Test
	public void testEmptyFalse() {
		Battery b = new Battery();
		b.charge();
		boolean result = b.empty();
		assertFalse(result);

	}

	@Test
	public void testCharge() {
		Battery b = new Battery();
		b.charge();

		int result = (int)(getPrivateFieldValue(b, "remain"));

		int expected = 1;
		assertEquals(result ,expected);
	}

}
