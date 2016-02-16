package src;

public class Vehicle {
	private int speed;
	private int angle;
	private String owner;
	private static int idNumber = 0;

	public Vehicle(int speed, int angle, String owner){
		this.speed = speed;
		this.angle = angle;
		this.owner = owner;
		idNumber++;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAngle() {
		return angle;
	}

	public void setAngle(int angle) {
		this.angle = angle;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getIdNumber() {
		return idNumber;
	}


}
