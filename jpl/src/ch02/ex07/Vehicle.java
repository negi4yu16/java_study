package src;

public class Vehicle {
	private int speed;
	private int angle;
	private String owner;
	private static int idNumber = 0;

	public Vehicle(){
		idNumber++;
	}
	public Vehicle(String owner){
		this.owner = owner;
		idNumber++;
	}

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


	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		v1.setSpeed(10);
		v1.setAngle(20);
		v1.setOwner("Yamada");

		System.out.println("v1:Speed:"+v1.getSpeed());
		System.out.println("v1:Angle:"+v1.getAngle());
		System.out.println("v1:Owner:"+v1.getOwner());
		System.out.println("v1:idNumber:"+v1.getIdNumber());

		Vehicle v2 = new Vehicle("Suzuki");
		v2.setSpeed(30);
		v2.setAngle(40);

		System.out.println("v2:Speed:"+v2.getSpeed());
		System.out.println("v2:Angle:"+v2.getAngle());
		System.out.println("v2:Owner:"+v2.getOwner());
		System.out.println("v2:idNumber:"+v2.getIdNumber());

	}

}