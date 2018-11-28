
package ch.bfh.btx8081.w2018.white.typer;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import ch.bfh.btx8081.w2018.white.typer.interfaces.Observer; 

/**
 * @author uhruv1
 *
 * A Class which includes all the tools for the Observer Pattern.
 * 
 */
public class Observable extends VerticalLayout { 

	ArrayList<Observer> observers = null; // All observer which are notified
	
	
	public Observable() {
		observers = new ArrayList<Observer>();
	}
	
	/**
	 * add a observer
	 * @param observer A observer which want to be notified about events.
	 */
	public void add(Observer observer) {
		observers.add(observer);
	}
	
	/**
	 * remove a observer
	 * @param observer A observer which don't want to be notified about events anymore.
	 */
	public void remove(Observer observer) {
		observers.remove(observer);
	}
	
	/**
	 * notify every observer about a clicked button
	 * @param command which button was clicked
	 */
	public void clickButton(String command) {
		for (Observer observer : observers) {
			observer.clickButton(command);
		}
	}


}
