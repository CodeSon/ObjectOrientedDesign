package model;
/**
 * THis class saves the vehicle and what position it has in the q
 * @author David
 *
 */
public class WorkOrderAndPosition {
	/**
	 * Implemented encapsulation by declaring a variable property of the type
	 * vehicle
	 */
	private WorkOrder workorder;
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
	public WorkOrder getWorkOrder() {

		return this.workorder;

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
	public WorkOrderAndPosition(WorkOrder workorder, int queueNumber) {

		this.workorder = workorder;
		this.queueNumber = queueNumber;

	}
	/**
	 * Returns vehicle currently in the queue
	 */
	public String toString(){

		return queueNumber +" " + workorder.getVehicle();
	}

}
