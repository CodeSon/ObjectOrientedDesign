package tests;

import static org.junit.Assert.*;
import model.Receipt;
import model.Vehicle;
import model.WorkOrder;
import model.WorkOrderItem;

import org.junit.Test;


public class testWorkOrder {

	@Test
	public void testWorkOrder() {
		WorkOrder workTest = new WorkOrder(new Vehicle("TJP 986","PersonBil","Citroen c4",2007));
		
		Vehicle myCar = workTest.getVehicle();
		
		assertEquals("unexpected regNummer", "TJP 986", myCar.getRegNummer());
		
	}
/**
 * created a workOrder but needed
 * to add something to the checklist.
 * so 2 items created in the check list
 */
	@Test
	public void testAddItem() {
		WorkOrder workTest = new WorkOrder(new Vehicle("TJP 986","PersonBil","Citroen c4",2007));
		
		workTest.addItem(new WorkOrderItem("Check brakes", 2134));
		workTest.addItem(new WorkOrderItem("check tires", 2345));
		
		assertEquals(workTest.getChecklist().size(), 2);
	}
/**
 * create a work order and create receipt for that work order a work order
 */
	@Test
	public void testCreateReciept() {
		WorkOrder workTest = new WorkOrder(new Vehicle("TJP 986","PersonBil","Citroen c4",2007));
		
		workTest.addItem(new WorkOrderItem("Check brakes", 2134));
		workTest.addItem(new WorkOrderItem("check tires", 2345));
		
		Receipt receipt = workTest.createReciept();
	
		assertEquals(receipt.getTotal(), 2134+2345, 0.1);
		assertEquals(2, receipt.getItems().size());
	}

}