package model;
/*
 * describes the item of the work order
 * and the price of it.
 */
public class WorkOrderItem {
	private String description;
	private double price;

	/**
	 * 
	 * @param description
	 *            describes the kind of inspection to be performed
	 * @param price
	 *            is also shown at the end of the description
	 *            
	 */
	/*
	 * constructor takes description and price
	 */
	public WorkOrderItem(String description, double price) {

		this.description = description;
		this.price = price;
	}


	/*
	 * returns descriptions
	 */
	public String getDescription() {
		return description;
	}
	/*
	 * return price
	 */
	public double getPrice() {
		return price;
	}
	/*
	 * Creating the format of the 
	 * receipt  
	 */
	public String printFormat(){
		StringBuilder itemFormat = new StringBuilder();
		itemFormat.append(getDescription());
		itemFormat.append(", ");
		itemFormat.append(getPrice());
		itemFormat.append(" per price total: ");
		return itemFormat.toString();
	}
}
