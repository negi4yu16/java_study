package src.ch03.ex04;

public class Vehicle {
	private int speed;
	private int angle;
	private String owner;
	private static final int ID = 123456;
	private static int maxID;
	private int idNumber;
	public static final String TURN_LEFT = "left";
	public static final String TURN_RIGHT = "right";

	public Vehicle(){
		this.changeSpeed(0);
		this.setAngle(0);
		this.setIdNumber(ID);
	}
	public Vehicle(String owner){
		this.owner = owner;
	}

	public Vehicle(int speed, int angle, String owner){
		this.changeSpeed(speed);
		this.setAngle(angle);
		this.setOwner(owner);
		this.setIdNumber(ID);
	}

	final public int getSpeed() {
		return speed;
	}

	final public int getAngle() {
		return angle;
	}

	public void setAngle(int angle) {
		this.angle = angle;
	}

	final public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	final public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
		Vehicle.setMaxId(idNumber);
	}

	public static void setMaxId(int id){
		if(id > Vehicle.maxID){
			Vehicle.maxID = id;
		}

	}

	final public static int getMaxId(){
		return Vehicle.maxID;
	}

	public String toString(){
		String str = "ID:" + this.idNumber + " Ownwer:"+ this.owner;
		return  str;
	}

	public void changeSpeed(int speed){
		this.speed = speed;
	}
	public void stop(){
		this.speed = 0;
	}

	public void trun(int angle){
		this.setAngle(this.getAngle() + angle);
	}

	public void trun(String message){
		int angle = 90;
		if(message.equals(Vehicle.TURN_LEFT)){
			this.setAngle(this.getAngle() + angle);
		} else if(message.equals(Vehicle.TURN_RIGHT)){
			this.setAngle(this.getAngle() - angle);
		} else {

		}
	}

}
