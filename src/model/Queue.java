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
	/**
	 * LinkedList declaration so as to be able to add a 
	 * new vehicle to the queue or to get the next  in line
	 */
	int nextAvailableQueueNumber = 0;
	LinkedList<WorkOrderAndPosition> queue= new LinkedList<WorkOrderAndPosition>();


	/**Method which gets next vehicle in queue
	 *  and having a check to catch an empty queue
	 * 
	 * @return vehicle
	 * @throws NoVehicleInQueueException if the queue is found to 
	 * be empty
	 */
	public WorkOrder getNextVehicle() throws NoVehicleInQueueException{
		try{
			WorkOrderAndPosition vp = queue.removeFirst();

			if (vp==null){
				throw new NoVehicleInQueueException();
			}
			WorkOrder vehicle =vp.getWorkOrder();
			return vehicle;
		}catch(NoSuchElementException e)
		{
			throw new NoVehicleInQueueException();
		}
	}
	/*
	 * Adds a new vehicle to the inspection queue.
	 */

	public int addWorkOrder(WorkOrder workorder){
		queue.add(new WorkOrderAndPosition(workorder,nextAvailableQueueNumber)); 
		return this.nextAvailableQueueNumber++;

	}
}



