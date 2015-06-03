package observer;
import java.util.ArrayList;
import java.util.List;

/**
 * Created a subject class which 
 * will contain the list of all observers so that the observing classes who inherit 
 * from the Subject are notified accordingly
 * @author David
 *
 */

public class Subject {
	
	 private List<Observer> observers = new ArrayList<Observer>();
/**
 * Observers are notified when attach is 
 * called
 * @param observer
 */
	   public void attach(Observer observer){
	      observers.add(observer);		
	   }
/**
 * Goes through all the observers list and calls the update 
 * function which is in the view
 */
	   public void notifyAllObservers(){
	      for (Observer observer : observers) {
	         observer.update();
	      }
	   } 

}
