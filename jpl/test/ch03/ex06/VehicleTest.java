package test.ch03.ex06;

import org.junit.Test;

import src.ch03.ex06.Vehicle;
import test.ch03.common.MyDJUnitTestCase;

public class VehicleTest extends MyDJUnitTestCase {

	@Test
	public void testStart1() {
		Vehicle v = new Vehicle();
		boolean result = v.start();
		assertFalse(result);
	}
	@Test
	public void testStart2() {

		Vehicle v = new Vehicle();

		addReturnValue("GasTank","empty", true);
		addReturnValue("Battery","empty", false);

		boolean result = v.start();
		assertTrue(result);
	}

	@Test
	public void testStart3() {

		Vehicle v = new Vehicle();

		addReturnValue("GasTank","empty", false);
		addReturnValue("Battery","empty", true);

		boolean result = v.start();
		assertTrue(result);
	}

	@Test
	public void testStart4() {

		Vehicle v = new Vehicle();

		addReturnValue("GasTank","empty", true);
		addReturnValue("Battery","empty", true);

		boolean result = v.start();
		assertFalse(result);
	}

	@Test
	public void testVehicleTest() {
		Vehicle v = new Vehicle();
	}
	@Test
	public void testVehicleTest2() {
		Vehicle v = new Vehicle("Yamada");
	}

	@Test
	public void testGetSpeed() {
		Vehicle v = new Vehicle(10,20,"Negishi");
		int result = v.getSpeed();
		assertEquals(result, 10);
	}


	@Test
	public void testGetAngle() {
		Vehicle v = new Vehicle(10,20,"Negishi");
		int result = v.getAngle();
		assertEquals(result, 20);
	}

	@Test
	public void testSetAngle() {
		Vehicle v = new Vehicle(10,20,"Negishi");
		v.setAngle(30);
		int result = v.getAngle();
		assertEquals(result, 30);
	}

	@Test
	public void testGetOwner() {
		Vehicle v = new Vehicle(10,20,"Negishi");
		String result = v.getOwner();
		assertEquals(result, "Negishi");
	}

	@Test
	public void testSetOwner() {
		Vehicle v = new Vehicle(10,20,"Negishi");
		v.setOwner("Yamada");
		String result = v.getOwner();
		assertEquals(result, "Yamada");
	}

	@Test
	public void testGetIdNumber() {
		Vehicle v = new Vehicle(10,20,"Negishi");
		int result = v.getIdNumber();
		assertEquals(result, 123456);
	}

	@Test
	public void testSetIdNumber() {
		Vehicle v = new Vehicle(10,20,"Negishi");
		v.setIdNumber(123456789);
		int result = v.getIdNumber();
		assertEquals(result, 123456789);
	}

	@Test
	public void testgetMaxId() {
		Vehicle v = new Vehicle();
		Vehicle v2 = new Vehicle();
		v2.setIdNumber(654321);

		int result = Vehicle.getMaxId();
		assertEquals(result, 654321);

		v.setIdNumber(987654);
		result = Vehicle.getMaxId();
		assertEquals(result, 987654);

	}

	@Test
	public void testtoString() {
		Vehicle v = new Vehicle();
		String result = v.toString();
		String expected = "ID:" + "123456" + " Ownwer:null";
		assertEquals(result, expected);

	}

	@Test
	public void testChengeSpeed() {
		Vehicle v = new Vehicle();
		int expected = 50;
		v.changeSpeed(expected);
		int result = v.getSpeed();
		assertEquals(result, expected);
	}

	@Test
	public void testStop() {
		Vehicle v = new Vehicle();
		int expected = 0;
		v.changeSpeed(50);
		v.stop();
		int result = v.getSpeed();
		assertEquals(result, expected);
	}

	@Test
	public void testTrunInt() {
		Vehicle v = new Vehicle();
		int expected = 90;
		v.trun(90);
		int result = v.getAngle();
		assertEquals(result, expected);

		expected = 60;
		v.trun(-30);
		result = v.getAngle();
		assertEquals(result, expected);

	}

	@Test
	public void testTrunString() {
		Vehicle v = new Vehicle();
		int expected = 90;
		v.trun(Vehicle.TURN_LEFT);
		int result = v.getAngle();
		assertEquals(result, expected);

		expected = 0;
		v.trun(Vehicle.TURN_RIGHT);
		result = v.getAngle();
		assertEquals(result, expected);

	}



}
