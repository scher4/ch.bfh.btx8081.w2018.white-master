/**
 *
 */
package ch.bfh.btx8081.w2018.white.typer;

import ch.bfh.btx8081.w2018.white.typer.diary.EntryView;
import ch.bfh.btx8081.w2018.white.typer.diary.MainDiaryView;
import ch.bfh.btx8081.w2018.white.typer.interfaces.Observer;
import ch.bfh.btx8081.w2018.white.typer.util.TyperUtil;

/**
 * @author uhruv1
 * the presenter of the mainview
 */
public class MainPresenter implements Observer {


	MainView view=null;

	/**
	 * set the mainview as view and add itself as observer
	 * @param aView the mainview
	 */
	public MainPresenter(MainView aView) {
		view = aView;
		view.add(this);
	}


	/**
	 * @see ch.bfh.btx8081.w2018.white.typer.interfaces.Observer#clickButton(java.lang.String)
	 */
	@Override
	public void clickButton(String command) { 
		switch(command) {
		case "Entry": //If the button "Entry" was clicked then set the entryView as mainframe 
			view.getUI().get().<Integer,EntryView>navigate(new EntryView().getClass(), new Integer(1));
			break;
		case "Diary":
			view.getUI().get().navigate(new MainDiaryView().getClass());
			break;
		}

	}

}
