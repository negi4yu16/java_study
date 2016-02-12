package test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import src.Lookup;
import src.SimpleLookup;

public class SimpleLookupTest {

	SimpleLookup test;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFind1() {
		Lookup s = new SimpleLookup();
		s.add("test1", "value1");
		s.add("test2", "value2");

		Object result = s.find("test1");
		assertEquals(result, "value1");
	}

	@Test
	public void testFind2() {
		Lookup s = new SimpleLookup();
		s.add("test1", "value1");
		s.add("test2", "value2");

		Object result = s.find("test3");
		assertNull(result);
	}

	@Test
	public void testAdd1() {
		Lookup s = new SimpleLookup();
		s.add("test1", "value1");
		s.add("test2", "value2");
		try{
		Class c = s.getClass();
		Field fld_names = c.getDeclaredField("names");
		fld_names.setAccessible(true);
		Field fld_values = c.getDeclaredField("values");
		fld_values.setAccessible(true);

		String[] array_name = (String[]) fld_names.get(s);
		String[] array_value = (String[]) fld_values.get(s);
		for(int i = 0 ; i < array_name.length ; i++){
			System.out.println(array_name[i]);
		}
		assertSame("test1", array_name[0]);
		assertSame("value1", array_value[0]);

		}catch (Exception e){

		}
	}
	@Test
	public void testAdd2() {
		Lookup s = new SimpleLookup();
		s.add("test1", "value1");
		s.add("test2", "value2");
		try{
		Class c = s.getClass();
		Field fld_names = c.getDeclaredField("names");
		fld_names.setAccessible(true);
		Field fld_values = c.getDeclaredField("values");
		fld_values.setAccessible(true);

		String[] array_name = (String[]) fld_names.get(s);
		String[] array_value = (String[]) fld_values.get(s);
		for(int i = 0 ; i < array_name.length ; i++){
			System.out.println(array_name[i]);
		}
		assertSame("test2", array_name[1]);
		assertSame("value2", array_value[1]);

		}catch (Exception e){

		}
	}

	@Test
	public void testRemove() {
		Lookup s = new SimpleLookup();
		s.add("test1", "value1");
		s.add("test2", "value2");
		s.remove("test1");

		try{
		Class c = s.getClass();
		Field fld_names = c.getDeclaredField("names");
		fld_names.setAccessible(true);
		Field fld_values = c.getDeclaredField("values");
		fld_values.setAccessible(true);

		String[] array_name = (String[]) fld_names.get(s);
		String[] array_value = (String[]) fld_values.get(s);
		for(int i = 0 ; i < array_name.length ; i++){
			System.out.println(array_name[i]);
		}
		assertSame("test2", array_name[0]);
		assertSame("value2", array_value[0]);

		}catch (Exception e){

		}
	}

}
