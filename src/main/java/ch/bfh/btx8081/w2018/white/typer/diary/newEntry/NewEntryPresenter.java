package ch.bfh.btx8081.w2018.white.typer.diary.newEntry;

import com.vaadin.flow.component.notification.Notification;

import ch.bfh.btx8081.w2018.white.typer.Diary;
import ch.bfh.btx8081.w2018.white.typer.interfaces.Observer;
import ch.bfh.btx8081.w2018.white.typer.util.TyperUtil;

/**
 * 
 * @author Marc Gauch
 * Presenter zu <code>NewEntry</code>
 */
public class NewEntryPresenter implements Observer {
	private NewEntryView view;
	private Diary model;

	/**
	 * Construtor. Hängt View An
	 * @param view zugehörige View
	 */
	public NewEntryPresenter(NewEntryView view) {
		this.view = view;
		view.add(this);
		model = new Diary();

	}
	


	/**
	 * Click Handler
	 */
	@Override
	public void clickButton(String command) {
		switch (command) {
		case "back": // If the button "Back" was clicked then go a Site back
			//Notification.show("back");
			view.getUI().get().getPage().executeJavaScript("window.history.back()");
			break;
		case "save":
			String title = view.getTitle();
			String text = view.getText();
			boolean discuss = view.wantsToDiscuss();
			TyperUtil.showDialog("Title: " + title 
							+ " | Text: " + text
							+ " | discuss: " + discuss);
			//TODO: Match all fields
			int countBefore = model.getAll().size();
			this.model.createEntry(title, null, null, text, 0, discuss, null);
			int countAfter = model.getAll().size();
			TyperUtil.showDialog("count from: " + countBefore + " to " + countAfter);
			break;
		default:
			Notification.show(command);
		}


	}
}
