package view;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

import model.Garage;
import model.Payment;
import model.Queue;
import model.Vehicle;
import model.VehicleAndPosition;
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
		printWelcomeScreen();
		System.out.println();
		int input = readUserInput();
		System.err.println(input);
		addVehiclesToQ();
		showQ();		
	}

	/*
	 * show the q screen
	 */

	private void addVehiclesToQ() {
		// TODO this whole method must be changed, Only debug now.1
		Vehicle car1 = new Vehicle("ABD 345","VAN","brandNew",2015);
		Vehicle car2 = new Vehicle("AAA 456","CONVERTIBLE","RUSTY",1999);

		this.contr.getQueue().addVehicle(car1);
		this.contr.getQueue().addVehicle(car2);

	}
	private void showQ() {
		System.out.println("Inspection Queue");
		System.out.println("----------------");
		LinkedList<VehicleAndPosition> inspectionQ = this.contr.getQueue().getQ();
		for (VehicleAndPosition vehiclepos :inspectionQ ){
			System.out.println(vehiclepos);
		}

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
	}
	public String enterLicense(){
		return null;

	}
}