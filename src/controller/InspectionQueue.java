package controller;

import java.util.LinkedList;

import model.WorkOrder;
/**
 * Need a linked List to be able to add and remove workOrders
 * @author David
 *
 */
public class InspectionQueue {
	
	/**
	 * LinkedList declaration so as to be able to add a 
	 * new work order to the list or to get the next work order in line
	 */
	private LinkedList<WorkOrder> queue = new LinkedList<WorkOrder> ();
	
	
public void addNewOrder(WorkOrder workOrder){
	
	queue.add(workOrder);
	
	
	
}

public void getNextOrder(){
	
}
	
	
	
	

}
