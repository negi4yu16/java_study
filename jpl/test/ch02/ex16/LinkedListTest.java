package test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.junit.Test;

import src.LinkedList;

public class LinkedListTest {

	@Test
	public void testLinkedList() {
		Object v = new Object();
		LinkedList l = new LinkedList(v);

		try{
			Class c = l.getClass();
			Field fld = c.getDeclaredField("object");
			fld.setAccessible(true);

			Object obj = (Object)fld.get(l);
			assertSame(v, obj);

		} catch(Exception e){
			fail("Error");
		}

	}
	@Test
	public void testLinkedList2() {
		Object v = new Object();
		LinkedList l = new LinkedList();

	}

	@Test
	public void testLinkedList3() {
		Object v = new Object();
		LinkedList l2 = new LinkedList();

		LinkedList l1 = new LinkedList(v, l2);

		try{
			Class c = l1.getClass();
			Field fld_o = c.getDeclaredField("object");
			Field fld_n = c.getDeclaredField("next");
			fld_o.setAccessible(true);
			fld_n.setAccessible(true);

			Object obj = (Object)fld_o.get(l1);
			assertSame(v, obj);

			LinkedList result = (LinkedList)fld_n.get(l1);
			assertSame(l2, result);

		} catch(Exception e){
			fail("Error");
		}

	}

	@Test
	public void testGetObject() {
		Object v = new Object();
		LinkedList l = new LinkedList(v);
		Object result = l.getObject();

		assertSame(v, result);


	}

	@Test
	public void testSetObject() {

		LinkedList l = new LinkedList(new Object());
		Object v1 = new Object();
		l.setObject(v1);

		Object result = l.getObject();

		assertSame(v1, result);
	}

	@Test
	public void testGetNext() {

		LinkedList l1 = new LinkedList(new Object());
		LinkedList l2 = new LinkedList(new Object());
		l1.setNext(l2);
		LinkedList result = l1.getNext();

		assertSame(l2, result);
	}

	@Test
	public void testSetNext() {

		LinkedList l1 = new LinkedList(new Object());
		LinkedList l2 = new LinkedList(new Object());
		l1.setNext(l2);

		try{
			Class c = l1.getClass();
			Field fld = c.getDeclaredField("next");
			fld.setAccessible(true);

			LinkedList result = (LinkedList)fld.get(l1);
			assertSame(l2, result);

		} catch(Exception e){
			fail("Error");
		}
	}

	@Test
	public void testToString() {
		LinkedList l = new LinkedList();
		String result = l.toString();
		String expected = "LinkedList Object";
		assertEquals(result, expected);
	}

	@Test
	public void testSize1() {
		LinkedList l = new LinkedList();
		int result = l.size();
		int expected = 1;
		assertEquals(result, expected);

		LinkedList l2 = new LinkedList();
		LinkedList l3 = new LinkedList();
		LinkedList l4 = new LinkedList();
		l3.setNext(l4);
		l2.setNext(l3);
		l.setNext(l2);

		result = l.size();
		expected = 4;
		assertEquals(result, expected);

	}

}
