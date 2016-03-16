package test.ch03.ex02;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.junit.Test;

import src.ch03.ex02.X;

public class XTest {

	@Test
	public void testX() {
		X x = new X();

		try{
			Class c = x.getClass();
			Field fld = c.getDeclaredField("fullMask");
			fld.setAccessible(true);
			int expected = 0x00ff;

			assertEquals(expected, (int)(fld.get(x)));

		}catch(Exception e){
			fail("result NG");
		}
	}

	@Test
	public void testMask(){
		X x = new X();
		int orig = 0x1111;
		int expected = 0x0011;
		int result = x.mask(orig);

		assertEquals(result, expected);

	}

}
