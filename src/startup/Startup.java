
package startup;


import view.View;
import controller.Controller;
/*
 * The start up class is where initialization begins for the
 * program. Contains the main method. 
 * @author David
 *
 */
public class Startup {

	public static void main(String[] args) {
		Controller contr = new Controller();
		new View(contr).run();
	}

}
