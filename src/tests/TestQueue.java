package tests;

import static org.junit.Assert.*;
import model.NoVehicleInQueueException;
import model.Queue;
import model.Vehicle;
import model.WorkOrder;
import model.WorkOrderItem;

import org.junit.Before;
import org.junit.Test;
/**
 * This class tests the queue
 * @author David
 *
 */
public class TestQueue {
	private WorkOrder workorder1;
	private WorkOrder specialWorkorder;
	//creating vehicles
	@Before
	public void setUp() throws Exception {
		Vehicle myCar = new Vehicle("SKE","Kombi","Okay", 2013);
		this.workorder1 = new WorkOrder(myCar);
		Vehicle specialVehicle = new Vehicle("XYZ 987", "Van", "Nice", 2015);
		this.specialWorkorder= new WorkOrder(specialVehicle);
	}
	// testing if the production of queue numbers work effectively
	@Test
	public void testAddVehicle() {
		Queue q = new Queue();
		int qNo = 1233445;
		
		qNo = q.addWorkOrder(workorder1);
		
		assertEquals("First Queue Number doesn't match", 0, qNo);
		
		qNo = q.addWorkOrder(workorder1);
		
		assertEquals("Second Queue Number doesn't match", 1, qNo);
		
		qNo = q.addWorkOrder(workorder1);
		
		assertEquals("Third Queue Number doesn't match", 2, qNo);
	}
	
	//testing the getnextvehicle method
	@Test
	public void testGetNextVehicle() {
		WorkOrderItem work = new WorkOrderItem("Check engine", 1000.0);
		Queue q = new Queue();
		//adding three vehicles to the queue and adding one of them twice
		q.addWorkOrder(specialWorkorder);
		q.addWorkOrder(workorder1);
		q.addWorkOrder(workorder1);
		
		boolean good = false;
		
		try {
			assertEquals("Special Vehicles don't match", specialWorkorder, q.getNextVehicle());
			assertEquals("Vehicles don't match", workorder1, q.getNextVehicle());
			assertEquals("Vehicles don't match", workorder1, q.getNextVehicle());
			assertEquals("Vehicles don't match", null, q.getNextVehicle());
		} catch (NoVehicleInQueueException e) {
			good = true;
			// The last vehicle is not supposed to exist, failure is expected
		}
		assertEquals("Last vehicle not supposed to be there", true, good );
		//added a null to test for an empty queue
		
	}

}
