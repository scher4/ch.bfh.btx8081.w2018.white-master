/**
 * 
 */
package ch.bfh.btx8081.w2018.white.typer.diary;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.Page;

import ch.bfh.btx8081.w2018.white.typer.interfaces.Observer;

/**
 * @author uhruv1
 *
 * Presenter for the entry
 *
 */
public class EntryPresenter implements Observer {
	
	EntryView view = null;
	
	/**
	 * Presenter add himself as an observer to the view
	 * @param aView the view
	 */
	public EntryPresenter(EntryView aView) {
		view=aView;
		view.add(this); 
	} 
	
	
	/**
	 * @see ch.bfh.btx8081.w2018.white.typer.interfaces.Observer#clickButton(java.lang.String)
	 */
	@Override
	public void clickButton(String command) {
		switch(command) {
		case "Back": //If the button "Back" was clicked then go a Site back
			view.getUI().get().getPage().executeJavaScript("window.history.back()");
			break;
		}

	} 
	
	

}
