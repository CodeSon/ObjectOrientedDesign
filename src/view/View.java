package view;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

import model.NoSuchVehicleException;
import model.Receipt;
import model.WorkOrder;
import model.WorkOrderAndPosition;
import model.NoVehicleInQueueException;
import controller.Controller;
import observer.Observer;

/**Contains all user inputs and 
 * print outs
 * Instances of the controller are also used here
 * 
 * @author David
 *
 */
public class View extends Observer{
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
				getNextVehicle();
				break;
			case 0:
				System.exit(0);
			default: System.out.println("Valid Values 1,2 or 3");

			}
		}

	}
	/**
	 * Asking the controller to get the next vehicle to be
	 *  inspected(vehicle with lowest queue number)
	 * and its list of items to be inspected
	 * @return
	 */
	private WorkOrder getNextVehicle() {
		
		try{
				WorkOrder newWorkOrder = contr.getNextWorkOrder();
				this.subject = newWorkOrder;
				this.subject.attach(this);
			System.out.println(newWorkOrder.getVehicle());
			System.out.println();
			System.out.println("-------------------------------------------");
			System.out.println(newWorkOrder);
			System.out.println("select 0 to return to main menu or 1 to print");
			int choose = readUserInput();
			switch(choose){
			
			case 0:
				break;
			case 1:
				printReceipt(newWorkOrder);
			}
			
			return newWorkOrder;
			
			} catch (NoVehicleInQueueException e) {
			System.out.println("No vehicle in queue");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
}
	
	private void printReceipt(WorkOrder workOrder) {
		System.out.println("Vehicle Inpsection receipt");
		System.out.println("--------------------------");
		Receipt totalCost = contr.createReceipt(workOrder);
		System.out.println(totalCost);
		System.out.println("press any number to go back");
		readUserInput();
				}
	/**
	 * AddVehicleToQ method which adds vehicle to the queue
	 */
	private void addVehicleToQ() {
		boolean invalidInput = true;
		while(invalidInput){
			System.out.println("Enter in coming vehicle's registration number");
			System.out.println("-------------------------------------------");
			System.out.println();
			String input = "";
			java.util.Scanner in = new Scanner(System.in);
			in.useLocale(java.util.Locale.US);
			try{
				input = in.nextLine();
				// asking the controller to find vehicle in the pool and give that vehicle
				// a queue number to be shown to the customer
				int qno = contr.findVehicle(input);
				System.out.println("Vehicle " + input + " has queue number: " + qno  );
				System.out.println();
				System.out.println("press any number to go back");
				readUserInput();

				invalidInput = false;
			} 
			catch(NoSuchElementException e) {
				System.out.println("Line not found");
			}
			catch(IllegalStateException e){
				System.out.println("Sanner is closed");
			} catch (NoSuchVehicleException e) {
				System.out.println("Sorry, there's no vehicle with this registration number. Please try again");
			}	
		}
	}

	private void showQ() {
		System.out.println("Inspection Queue");
		System.out.println("----------------");
		LinkedList<WorkOrderAndPosition> inspectionQ = this.contr.getQueue().getQ();
		for (WorkOrderAndPosition vehiclepos :inspectionQ ){
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
				choice = in.nextInt();
				return choice;

			} catch (InputMismatchException e) {
				System.out.println("input mismatch exception: The input must be a number :)");
			}
			catch(NoSuchElementException e)
			{
				System.out.println("You have to write something");
			}
			catch (IllegalStateException e)
			{
				System.out.println("Scanner not closed");
			}

		}
		return choice;
	}

	private void printWelcomeScreen() {
		System.out.println("Welcome");
		System.out.println("-------");
		System.out.println();
		System.out.println("Choose options 1, 2 or 3. Then 0 to return to main ");
		System.out.println();
		System.out.println("1. Show inspection queue");
		System.out.println();
		System.out.println("2. Add Vehicle to the queue");
		System.out.println();
		System.out.println("3. Get next Vehicle from the queue");
		System.out.println();
		System.out.println("0. Exit App");
	}
	@Override
	public void update() {
		System.out.println("WorkOrder has been changed: \n" + subject);
		
	}
	
}