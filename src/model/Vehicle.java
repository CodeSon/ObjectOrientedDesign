package model;
import java.util.LinkedList;
/*
 * Vehicle, creates a new vehicle object which will 
 * be inspected by the program
 */
public class Vehicle {
	private String regNummer;
	private String type;
	private String model;
	private int year;
	/**
	 * method returning the 
	 * parameters of the vehicle
	 */
	public String toString(){
		return regNummer+ " " + type + " " + model + " " + year;
	}
	/*
	 * constructor takes license number, type , model and year
	 * of the newly created vehicle object.
	 */
	public Vehicle(String regNummer, String type, String model, int year) {
		this.regNummer = regNummer;
		this.type = type;
		this.model = model;
		this.year = year;
		}

	/*
	 * returns license plate number
	 */
	public String getRegNummer() {
		return regNummer;
	}
	/*
	 * returns type
	 * of vehicle
	 */
	public String getType() {
		return type;
	}
	/*
	 * returns vehicle model
	 */
	public String getModel() {
		return model;
	}
	/*
	 * returns year model
	 */
	public int getYear() {
		return year;
	}
}
