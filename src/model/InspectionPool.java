package model;

import java.util.HashMap;
import java.util.LinkedList;

import javax.xml.soap.Node;

import model.WorkOrder;
/**
 * Need a linked List to be able to add and remove workOrders
 * @author David
 *
 */
public class InspectionPool {
	
	/**
	 * HashMap declaration so as to be able to add a 
	 * new work order to the list 
	 */
	private HashMap<String, WorkOrder> pool = new HashMap<String,WorkOrder> ();
	
public void addNewOrder(WorkOrder workOrder){
	
	pool.put(workOrder.getRegistrationNumber(), workOrder);
	
	
	
}

//public workOrder getOrderFor(String regnummer){
	//queue.getFirst();
}

	
	
	
	


