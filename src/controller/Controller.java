package controller;
import model.Vehicle;
import model.WorkOrder;
import model.Queue;
import model.Garage;
import model.WorkOrderItem;
import view.View;

/**
 * In the controller is where all interactions with the data is
 * carried out
 * @author David
 * Inspection queue contains a queue of different sets of 
 *  inspections
 * all calls to the model passes here.
 */

public class Controller {
	
	InspectionQueue inspectionQueue;
	WorkOrderItem workItem = new WorkOrderItem("Check engine", 1000.0);
	Vehicle car1 = new Vehicle("ABD 345","VAN","brandNew",2015);
	Vehicle car2 = new Vehicle("AAA 456","CONVERTIBLE","RUSTY",1999);
	Queue q = new Queue();
	Garage g=new Garage(true, false);
	
	
	public Queue getQueue() {

		return this.q;
	}

	
	
	//constructor
	public Controller( ){
	}
	/*
	 * starts a new inspection. 
	 * opens garage door and closes it.what happens if one has many cars to be called???
	 */
	
	
	public int makeNewInspection(){
		return q.addVehicle(car1);
		
		
	}
	
	
	public int makeNewInspection2(){
		
		return q.addVehicle(car2);
		
	}
	public String getNextVehicle(){
		return q.getNextVehicle().toString();
	}
	
	
	
	public String enterLicense(){
	return null;
	
}

public String checkInspection(){
	return null;
	
}

public String customerCreditCardInfo(){
	return null;
	}

}
