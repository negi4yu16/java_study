package test.ch03.ex08;

import org.junit.Test;

import src.ch03.ex08.PassengerVehicle;

public class PassengerVehicleTest {

	@Test
	public void testClone() {
		PassengerVehicle v1 = new PassengerVehicle();
		try{
			PassengerVehicle v2 = v1.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
	}

}
