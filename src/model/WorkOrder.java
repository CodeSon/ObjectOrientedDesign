package model;
import java.util.LinkedList;
/**
 * wpork order class has 1) A vehicle
 * 						 2) check list
 * @author David
 *
 */
public class WorkOrder {
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
/**	
 * Method for printing the work order item's description and also
 * price for each item inspected
 */
public String toString(){
	String list = "";
	for(WorkOrderItem workOrderItem : checkList)
	{
		list = list + "- " + workOrderItem.getDescription() + " " + workOrderItem.getPrice() + "\n";
		}
		return  list;
	}

	private Vehicle vehicle;
	
	/**
	 * LinkedList declaration so as to be able to add a 
	 * new work order to the list or to get the next work order in line
	 */
	private LinkedList<WorkOrderItem> checkList = new LinkedList<WorkOrderItem> ();
	/**
	 * Returning the work order
	 * @param vehicle
	 */
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
	 * which is a checklist if items to be 
	 * inspected on the vehicle
	 */
	public LinkedList<WorkOrderItem> getChecklist() {
		return this.checkList;
	}
	/**
	 * 
	 * @param create Receipt object to be tested in Junit
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
	
	
	//Returning vehicle's registration number
	public String getRegistrationNumber(){
		return vehicle.getRegNummer();
		
	}

	 
	
	
	
	
	
	

}
