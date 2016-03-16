package test.ch03.ex06;

import org.junit.Test;

import src.ch03.ex06.GasTank;
import test.ch03.common.MyDJUnitTestCase;

public class GasTankTest extends MyDJUnitTestCase {

	@Test
	public void testEmptyTrue() {
		GasTank g = new GasTank();
		boolean result = g.empty();

		assertTrue(result);
	}

	@Test
	public void testEmptyFalse() {
		GasTank g = new GasTank();
		g.supply(10);
		boolean result = g.empty();

		assertFalse(result);	}

	@Test
	public void testSupply() {
		GasTank g = new GasTank();
		g.supply(10);
		int result = (int)(getPrivateFieldValue(g, "amount"));
		int expected = 10;
		assertEquals(result, expected);

	}

}
