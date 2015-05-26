package controller;
import model.InspectionPool;
import model.NoSuchVehicleException;
import model.Vehicle;
import model.WorkOrder;
import model.Queue;
import model.Garage;
import model.WorkOrderItem;
import model.NoVehicleInQueueException;
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
	
	InspectionPool inspectionPool = new InspectionPool();
	Queue q = new Queue();
	Garage g=new Garage(true, false);
	
	
	public Queue getQueue() {

		return this.q;
	}
/**
	 * 
	 */
	public Controller( ){
		Vehicle car1 = new Vehicle("ABD 345","VAN","brandNew",2015);
		Vehicle car2 = new Vehicle("AAA 456","FLAT","wornOut",1999);
		Vehicle car3 = new Vehicle("ABC 344","estate","fresh",1999);
		Vehicle car4 = new Vehicle("UNG 112","truck","RUSTY",1999);
		Vehicle car5 = new Vehicle("FFX 908","wagon","shiny",1999);
		
		WorkOrderItem workItem1 = new WorkOrderItem("Check engine", 1000.0);
		WorkOrderItem workItem2 = new WorkOrderItem("Check tyres", 500.0);
		WorkOrderItem workItem3 = new WorkOrderItem("Check oil", 250.0);
	
		//creating work orders and adding items
		WorkOrder work1m = new WorkOrder(car1);
		work1m.addItem(workItem1);
		work1m.addItem(workItem2);
		work1m.addItem(workItem3);
		
		WorkOrder work2m = new WorkOrder(car2);
		work2m.addItem(workItem2);
		
		WorkOrder work3m = new WorkOrder(car3);
		work3m.addItem(workItem3);
		work3m.addItem(workItem1);
		
		WorkOrder work4m = new WorkOrder(car4);
		work4m.addItem(workItem2);
		work4m.addItem(workItem1);
		work4m.addItem(workItem3);
		
		WorkOrder work5m = new WorkOrder(car5);
		work5m.addItem(workItem3);
		
		inspectionPool.addNewOrder(work1m);
		inspectionPool.addNewOrder(work4m);
		inspectionPool.addNewOrder(work3m);
		inspectionPool.addNewOrder(work2m);
		inspectionPool.addNewOrder(work5m);
		
		
		
		}
	/*
	 * starts a new inspection. 
	 * opens garage door and closes it.what happens if one has many cars to be called???
	 */
	
	
	public int makeNewInspection(){
		WorkOrder car1 = null;
		return q.addWorkOrder(car1);
		
		
	}
	
	
		

	public WorkOrder getNextWorkOrder() throws NoVehicleInQueueException, Exception{
		try {
			return q.getNextVehicle();
		} catch (NoVehicleInQueueException e) {
			throw new NoVehicleInQueueException();
		} catch (Exception e) {
			throw new Exception(e);
		}
		
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

/**
 * 
 * @return
 * @throws NoSuchVehicleException
 */
public int findVehicle(String regno) throws NoSuchVehicleException {
	try {
		WorkOrder workorder = this.inspectionPool.getWorkOrder(regno);
		
		int myq = this.q.addWorkOrder(workorder);
		return myq;
	} catch (NoSuchVehicleException e) {
		throw new NoSuchVehicleException();
	}
}

}
