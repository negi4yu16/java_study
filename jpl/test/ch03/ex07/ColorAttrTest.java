package test.ch03.ex07;

import org.junit.Test;

import src.ch03.ex07.ColorAttr;
import src.ch03.ex07.ScreenColor;

public class ColorAttrTest extends test.ch03.common.MyDJUnitTestCase {

	@Test
	public void testHashCode() {
		String name = "red";
		ColorAttr attr = new ColorAttr(name);
		int result = attr.hashCode();
		int expected = 1;
		assertEquals(result, expected);

	}

	@Test
	public void testSetValueObject() {
		String name = "red";
		Object oldValue = new Object();
		Object newValue = new Object();
		ColorAttr attr = new ColorAttr(name, oldValue);
		Object result = attr.setValue(newValue);

		assertEquals(result ,oldValue);

	}

	@Test
	public void testColorAttrStringObject() {
		String name = "red";
		Object obj = new Object();
		ColorAttr attr = new ColorAttr(name, obj);
	}

	@Test
	public void testColorAttrString() {
		String name = "red";
		ColorAttr attr = new ColorAttr(name);
	}

	@Test
	public void testColorAttrStringScreenColor() {
		String name = "red";
		ScreenColor obj = new ScreenColor();
		ColorAttr attr = new ColorAttr(name, obj);
	}

	@Test
	public void testSetValueScreenColor() {
		String name = "red";
//		Object oldValue = new Object();
		ScreenColor oldValue = new ScreenColor();
		ScreenColor newValue = new ScreenColor();
		ColorAttr attr = new ColorAttr(name, oldValue);
		Object result = attr.setValue(newValue);

		assertEquals(result ,oldValue);
	}

	@Test
	public void testGetColor() {
		String name = "red";
		ScreenColor newValue = new ScreenColor();
		ColorAttr attr = new ColorAttr(name, newValue);

		ScreenColor color = attr.getColor();

		assertEquals(color, newValue);

	}

	@Test
	public void testEqualsObject() {

		String name = "red";
		ScreenColor newValue = new ScreenColor();
		ColorAttr attr = new ColorAttr(name, newValue);
		boolean result = attr.equals(newValue);
		assertTrue(result);
	}

	@Test
	public void testEqualsObject2() {

		String name = "red";
		ScreenColor newValue = new ScreenColor();
		ColorAttr attr = new ColorAttr(name);
		boolean result = attr.equals(newValue);
		assertFalse(result);
	}

}
