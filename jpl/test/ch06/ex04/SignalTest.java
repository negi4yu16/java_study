package test.ch06.ex04;

import org.junit.Test;

import src.ch06.ex04.Color;
import src.ch06.ex04.Signal;

public class SignalTest extends test.ch06.common.MyDJUnitTestCase {

	@Test
	public void testGetColor() {
		Color color1 = Signal.BLUE.getColor();
		System.out.println(color1.toString());
		assertEquals(color1.toString(), "BLUE");
		Color color2 = Signal.YELLOW.getColor();
		assertEquals(color2.toString(), "YELLOW");
		Color color3 = Signal.RED.getColor();
		assertEquals(color3.toString(), "RED");

	}

}
