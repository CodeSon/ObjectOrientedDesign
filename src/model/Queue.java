package model;

import java.util.LinkedList;
import java.util.NoSuchElementException;


/**
 * This is the class which manages the queue of cars,
 * it has an ordered lists of vehicle (knows which is first and last)
 * because it adds to the back of the queue and retrieves from the
 * front of the queue.
 * It also keeps track of the vehicle's queue number in order to implement this effectively .
 * @author David
 *
 */
public class Queue {
	
	public LinkedList<WorkOrderAndPosition> getQ(){
		
		
		return this.queue;
	}

	public Queue(){

	}
	/**
	 * LinkedList declaration so as to be able to add a 
	 * new vehicle to the queue or to get the next  in line
	 */
	int nextAvailableQueueNumber = 0;
	LinkedList<WorkOrderAndPosition> queue= new LinkedList<WorkOrderAndPosition>();

	/*
	 * gets next vehicle in que and having a check to catch an empty queue
	 */

	public WorkOrder getNextVehicle(){


		try{
			WorkOrderAndPosition vp = queue.removeFirst();

			if (vp==null){
				return null;
			}
			WorkOrder vehicle =vp.getWorkOrder();



			return vehicle;
		}catch(NoSuchElementException e)
		{
			return null;
		}


	}
	/*
	 * adds a new vehicle to the queue.
	 */

	public int addWorkOrder(WorkOrder workorder){



		queue.add(new WorkOrderAndPosition(workorder,nextAvailableQueueNumber)); 

		return this.nextAvailableQueueNumber++;

	}














}



