package test.ch03.ex02;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.junit.Test;

import src.ch03.ex02.Y;

public class YTest {

	public Field getFieldFromClass(Class clazz, String fieldName) throws NoSuchFieldException {
		Field field = null;
		while(clazz != null){
			try {
				field = clazz.getDeclaredField(fieldName);
				break;
			}catch(NoSuchFieldException e){
				clazz = clazz.getSuperclass();
			}
		}

		if(field == null ){
			throw new NoSuchFieldException();
		}
		return field;
	}

	@Test
	public void testY() {
		Y y = new Y();

		try{
			Field fld = getFieldFromClass(y.getClass(), "fullMask");
			fld.setAccessible(true);
			int expected = 0xffff;
			System.out.printf("test:%04x%n", (int)(fld.get(y)));
			assertEquals(expected, (int)(fld.get(y)));

		}catch(Exception e){
			fail("result NG");
		}

	}

	@Test
	public void testMain() {
		Y y = new Y();
		y.main(new String[]{});
	}

}
