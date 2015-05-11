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

	public Queue(){

	}
	/**
	 * LinkedList declaration so as to be able to add a 
	 * new vehicle to the queue or to get the next  in line
	 */
	int nextAvailableQueueNumber = 0;
	LinkedList<VehicleAndPosition> queue= new LinkedList<VehicleAndPosition>();

	/*
	 * gets next vehicle in que and having a check to catch an empty queue
	 */

	public Vehicle getNextVehicle(){


		try{
			VehicleAndPosition vp = queue.removeFirst();

			if (vp==null){
				return null;
			}
			Vehicle vehicle =vp.getVehicle();



			return vehicle;
		}catch(NoSuchElementException e)
		{
			return null;
		}


	}
	/*
	 * adds a new vehicle to the queue.
	 */

	public int addVehicle(Vehicle vehicle){



		queue.add(new VehicleAndPosition(vehicle,nextAvailableQueueNumber)); 

		return this.nextAvailableQueueNumber++;

	}














}



