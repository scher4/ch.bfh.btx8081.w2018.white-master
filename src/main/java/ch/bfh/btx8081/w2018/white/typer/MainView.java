package ch.bfh.btx8081.w2018.white.typer;

import com.vaadin.flow.component.button.Button; 
import com.vaadin.flow.component.orderedlayout.HorizontalLayout; 
import com.vaadin.flow.router.Route;

/**
 * @author uhruv1
 * The main view with a navigation
 */
@Route("")
public class MainView extends Observable {


	
	/**
	 * generates the mainPresenter and a navigation
	 */
    public MainView() {
    	MainPresenter mainPresenter = new MainPresenter(this); //TODO: Darf/soll ich das?
    	HorizontalLayout navigation = new HorizontalLayout();  
    	navigation.add(new Button("Entry",
                event -> clickButton("Entry"))); 
    	navigation.add(new Button("Diary", 
    			event -> clickButton("Diary")));
    	add(navigation);
    }

}
