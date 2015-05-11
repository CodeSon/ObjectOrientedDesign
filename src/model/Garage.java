package model;

public class Garage {
	private Boolean doorOpen;
	private Boolean doorClosed;
	
	public boolean openGarageDoor(){
		if(doorOpen == true){
		
			System.out.println("Garage door is open: ");
		return false;
		}return true;
		
	}
	
	public boolean closeGarageDoor(Boolean doorClosed){
		if(doorClosed = true){
		System.out.println("Garage door is closed: ");
		return true;
		}
		return false;
		
	}
	
	
	
	public Garage(Boolean doorOpen, Boolean doorClosed){
		this.doorClosed = doorClosed;
		this.doorOpen = doorOpen;
	}

}
