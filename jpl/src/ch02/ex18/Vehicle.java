package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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
		this.setSpeed(0);
		this.setAngle(0);
		this.setIdNumber(ID);
	}
	public Vehicle(String owner){
		this.owner = owner;
	}

	public Vehicle(int speed, int angle, String owner){
		this.setSpeed(speed);
		this.setAngle(angle);
		this.setOwner(owner);
		this.setIdNumber(ID);
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

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
		Vehicle.setMaxId(idNumber);
	}

	public static void setMaxId(int id){
		if(id > Vehicle.maxID){
			Vehicle.maxID = id;
		}

	}

	public static int getMaxId(){
		return Vehicle.maxID;
	}

	public String toString(){
		String rt = "Vehicle";
		return rt;
	}

	public void changeSpeed(int speed){
		setSpeed(speed);
	}
	public void stop(){
		setSpeed(0);
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
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
        String owner;

        System.out.print("input Vehicle Owner: ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
                owner = br.readLine();
                v1.setOwner(owner);
                System.out.println("Vehicle Owner = " + v1.getOwner());
        }catch(Exception e){
        }

	}

}
