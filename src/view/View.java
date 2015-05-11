package view;
import model.Garage;
import model.Payment;
import model.Queue;
import model.Vehicle;
import model.WorkOrder;
import model.WorkOrderItem;
import controller.Controller;
import controller.InspectionQueue;


public class View {
	
	
	
	
	
public void makeNewInspection(){
		
		
}

	private Controller contr;
	
	/*
	 * instantiates a new View.
	 */
	public View(Controller contr){
		this.contr = contr;
		
	}
	/*
	 * calls all system operations and prints the results of the calls.
	 */
	public void run(){
		System.out.println("Car number " + contr.makeNewInspection() + " is next to be inspected");
		System.out.println();
		System.out.println("Car number " + contr.makeNewInspection2()+ " is next to be inspected");
	}
	
	/*
	 * starts a new inspection. 
	 * opens garage door and closes it.
	 */
	
	public String enterLicense(){
	return null;
	
	}
}