package view;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

import model.Payment;
import model.Queue;
import model.Vehicle;
import model.VehicleAndPosition;
import model.WorkOrder;
import model.WorkOrderItem;
import controller.Controller;


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

		addDebugVehiclesToQ();
		createFakeWorkOrderList();

		while (true){
			printWelcomeScreen();
			System.out.println();
			int input = readUserInput();
			switch(input){
			case 1 :
				showQ();
				break;
			case 2:
				addVehicleToQ();
				break;
			case 3:
				VehicleAndPosition nextVehicle= getNextVehicle();
			case 0:
				System.exit(0);
			default: System.out.println("Valid Values 1,2 or 3");

			}
		}






	}

	/**
	 * faking work order list temp.
	 */

	private void createFakeWorkOrderList() {
		
		WorkOrder[] workOrders= {
				new WorkOrder(new Vehicle("TJP 986","PersonBil","Citroen c4",2007)),
				new WorkOrder(new Vehicle("WEP 111","PersonBil","BMW",2010)),
				new WorkOrder(new Vehicle("PRK 455","Vagn","Volvo",1999))};
		
		
		
		
	}
	private void addDebugVehiclesToQ() {
		// TODO this whole method must be changed, Only debug now.1
		Vehicle car1 = new Vehicle("ABD 345","VAN","brandNew",2015);
		Vehicle car2 = new Vehicle("AAA 456","CONVERTIBLE","RUSTY",1999);

		this.contr.getQueue().addVehicle(car1);
		this.contr.getQueue().addVehicle(car2);

	}
	private VehicleAndPosition getNextVehicle() {
		// TODO Auto-generated method stub
		return null;
	}
	private void addVehicleToQ() {
		


	}
	private void showQ() {
		System.out.println("Inspection Queue");
		System.out.println("----------------");
		LinkedList<VehicleAndPosition> inspectionQ = this.contr.getQueue().getQ();
		for (VehicleAndPosition vehiclepos :inspectionQ ){
			System.out.println(vehiclepos);
		}

		System.out.println("------------------");
		System.out.println("Click 0 to go back");

		while(readUserInput()!= 0){

			System.out.println("Please select 0 to go back");	

		}
		return;

	}
	private int  readUserInput() {


		/**
		 * Exceptions  to: 1) handle if input is not an Integer expression or is out of range
		 * 			       2) handle exhausted input
		 * 				   3) handle a closed scanner
		 */
		int choice = -1;
		boolean invalidInput = true;
		while (invalidInput){
			java.util.Scanner in = new Scanner(System.in);
			in.useLocale(java.util.Locale.US);
			try {
				return in.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("input mismatch or input is out of range exception"
						+ "The input must be a number:)");
			}//TODO: Implement 2 more try catches and one try catch for the EXEPTION CLASS

			catch(NoSuchElementException e)
			{
				System.out.println("");
			}
			catch (IllegalStateException e)
			{

			}

		}
		return choice;



	}
	private Object Scanner() {
		// TODO Auto-generated method stub
		return null;
	}
	private void printWelcomeScreen() {


		System.out.println("Welcome");
		System.out.println("-------");
		System.out.println();
		System.out.println("Choose a number");
		System.out.println();
		System.out.println("1. Show queue");
		System.out.println();
		System.out.println("2. Add Vehicle to the queue");
		System.out.println();
		System.out.println("3. Get next Vehicle from the queue");
		System.out.println();
		System.out.println("0. Exit App");
	}
	public String enterLicense(){
		return null;

	}
}