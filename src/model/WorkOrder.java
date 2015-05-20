package model;
import java.util.LinkedList;
/**
 * a
 * @author David
 *
 */
public class WorkOrder {
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	private Vehicle vehicle;
	
	/**
	 * LinkedList declaration so as to be able to add a 
	 * new work order to the list or to get the next work order in line
	 */
	private LinkedList<WorkOrderItem> checkList = new LinkedList<WorkOrderItem> ();
	
	
	public WorkOrder(Vehicle vehicle){
		this.setVehicle(vehicle);
		} 
	/**
	 * 
	 * @param addItem to be tested in Junit
	 */
	public void addItem(WorkOrderItem item){
		
		this.checkList.add(item);
	}
	/*
	 * returns the linkedlist
	 */
	public LinkedList<WorkOrderItem> getChecklist() {
		return this.checkList;
	}
	
	
	/**
	 * 
	 * @param createReceipt to be tested in Junit
	 */
	/*
	 * creates a receipt object 
	 */
	public Receipt createReciept(){
		Receipt receipt = new Receipt(checkList);
		
		return receipt;
		 
		}
	
	/*
	 * returns vehicle
	 */

	public Vehicle getVehicle() {
		return vehicle;
	}

	 
	
	
	
	
	
	

}
