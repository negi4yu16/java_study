package test;

import static org.junit.Assert.*;

import org.junit.Test;

import src.Vehicle;

public class VehicleTest {

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
	public void testSetSpeed() {
		Vehicle v = new Vehicle(10,20,"Negishi");
		v.setSpeed(20);
		int result = v.getSpeed();
		assertEquals(result, 20);
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
		String expected = "Vehicle";
		assertEquals(result, expected);

	}

	@Test
	public void testMain() {
		Vehicle.main(new String[]{});
	}

}
