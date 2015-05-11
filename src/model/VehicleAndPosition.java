package model;
/**
 * THis class saves the vehicle and what position it has in the q
 * @author David
 *
 */
public class VehicleAndPosition {
	/**
	 * Implemented encapsulation by declaring a variable property of the type
	 * vehicle
	 */
	private Vehicle vehicle;
	private int queueNumber;

	/**
	 * Adding getters and setters so i can get the vehicle and queue numbers
	 * respectively
	 * 
	 * @return
	 */
	/*
	 * returns current vehicle 
	 */
	public Vehicle getVehicle() {

		return this.vehicle;

	}
	/*
	 * returns que number
	 */
	public int getQueueNumber() {

		return this.queueNumber;
	}
	/*
	 * returns position of vehicle and current que number
	 */
	public VehicleAndPosition(Vehicle vehicle, int queueNumber) {

		this.vehicle = vehicle;
		this.queueNumber = queueNumber;

	}
	
public String toString(){
		
		return queueNumber +" " + vehicle;
	}

}
