package observer;
import java.util.ArrayList;
import java.util.List;

/**
 * Created a subject class which 
 * will contain the list of all observers
 * @author David
 *
 */

public class Subject {
	
	 private List<Observer> observers = new ArrayList<Observer>();

	   public void attach(Observer observer){
	      observers.add(observer);		
	   }

	   public void notifyAllObservers(){
	      for (Observer observer : observers) {
	         observer.update();
	      }
	   } 

}
