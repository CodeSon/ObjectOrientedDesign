package observer;
/**
 * Created an observer(abstract) class with the method which will be 
 * called during receipt printing
 * 
 * @author David
 *
 */
public abstract class Observer {
	
	 protected Subject subject;
	 public abstract void update();
	
	
}
