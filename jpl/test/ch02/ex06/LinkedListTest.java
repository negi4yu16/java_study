package test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.junit.Test;

import src.LinkedList;
import src.Vehicle;

public class LinkedListTest {

	@Test
	public void testLinkedList() {
		Vehicle v = new Vehicle(10,20,"Yamda");
		LinkedList l = new LinkedList(v);

		try{
			Class c = l.getClass();
			Field fld = c.getDeclaredField("object");
			fld.setAccessible(true);

			Vehicle obj = (Vehicle)fld.get(l);
			assertSame(v, obj);

		} catch(Exception e){
			fail("Error");
		}

	}

	@Test
	public void testGetObject() {
		Vehicle v = new Vehicle(10,20,"Yamda");
		LinkedList l = new LinkedList(v);
		Vehicle result = (Vehicle)l.getObject();

		assertSame(v, result);


	}

	@Test
	public void testSetObject() {

		Vehicle v = new Vehicle(10,20,"Yamda");
		LinkedList l = new LinkedList(v);
		Vehicle v2 = new Vehicle(30,40,"Suzuki");
		l.setObject(v2);

		Vehicle result = (Vehicle)l.getObject();

		assertSame(v2, result);
	}

	@Test
	public void testGetNext() {

		LinkedList l1 = new LinkedList(new Vehicle(10,20,"Yamada"));
		LinkedList l2 = new LinkedList(new Vehicle(30,40,"Suzuki"));
		l1.setNext(l2);
		LinkedList result = l1.getNext();

		assertSame(l2, result);
	}

	@Test
	public void testSetNext() {

		LinkedList l1 = new LinkedList(new Vehicle(10,20,"Yamada"));
		LinkedList l2 = new LinkedList(new Vehicle(30,40,"Suzuki"));
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
	public void testMain() {

		LinkedList.main(new String[]{});

	}

}
