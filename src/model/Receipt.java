package model;

import java.util.LinkedList;

public class Receipt {
	StringBuilder print = new StringBuilder();
	// a property to store the itemList
	LinkedList<WorkOrderItem> itemList;
	public String toString(){
		String list = "";
		for(WorkOrderItem workOrderItem : itemList)
		{
			list = list + "- " + workOrderItem.getDescription() + " " + workOrderItem.getPrice() + "\n";

		}
		list = list +"-----------------------------" + "\n";
		list =list + " Total:" + getTotal();
		return  list;
	}

	/**
	 * 
	 * @param checkList
	 *            is chosen as the type of the receipt since the receipt needs
	 *            to know what to tally up and then storing it in the checkList
	 *            variable
	 */

	public Receipt(LinkedList<WorkOrderItem> checkList) {

		itemList = checkList;
	}

	/**
	 * A for each loop that adds up items in the receipt and
	 * 
	 * @return the sum total
	 */

	public double getTotal() {
		double total = 0;

		for (WorkOrderItem item : itemList) {

			total = total + item.getPrice();

		}

		return total;
	}

	/**
	 * 
	 * @return the list of items
	 */
	public LinkedList<WorkOrderItem> getItems() {

		return itemList;
	}

	public StringBuilder printFormat(){
		print.append("\n");

		return null;

	}

}
