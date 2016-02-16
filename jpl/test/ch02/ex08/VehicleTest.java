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
		Vehicle v1 = new Vehicle(10,20,"Yamada");
		int expected = v1.getIdNumber() + 1;

		Vehicle v = new Vehicle(10,20,"Yamada");
		int result = v.getIdNumber();
		System.out.println(result);
		assertEquals(result, expected);
	}

	@Test
	public void testMain() {
		Vehicle.main(new String[]{});
	}

}
