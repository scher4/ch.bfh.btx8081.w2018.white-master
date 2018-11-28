/**
 *
 */
package ch.bfh.btx8081.w2018.white.typer.diary;

import java.util.List;

import com.vaadin.flow.component.notification.Notification;

import ch.bfh.btx8081.w2018.white.typer.Diary;
import ch.bfh.btx8081.w2018.white.typer.Entry;
import ch.bfh.btx8081.w2018.white.typer.diary.newEntry.NewEntryView;
import ch.bfh.btx8081.w2018.white.typer.interfaces.Observer;

/**
 * Presenter for the Diary View
 *
 * @author nowad1
 *
 */
public class DiaryPresenter implements Observer {
	private Diary model;
	private DiaryView view;

	/**
	 * Constructs a new {@link DiaryPresenter} that connects the model and the view.
	 *
	 * @param model the {@link Diary} to connect
	 * @param view  the {@link DiaryView} to connect
	 */
	public DiaryPresenter(Diary model, DiaryView view) {
		this.model = model;
		this.view = view;
		view.add(this); // @NOWAK: da bruchts damet de presenter met de view rede cha
		this.displayEntries(model.getAll());
	}

	/**
	 * Calls the displayEntries method in the view.
	 *
	 * @param entries the List of Entries to display.
	 */
	private void displayEntries(List<Entry> entries) {
		for (Entry entry : entries) {
			view.displayEntry(entry.getId(), entry.getTitle(), entry.getToDate());
		}
	}

	@Override
	public void clickButton(String command) {
		switch (command) {
		case "newEntry":
			view.getUI().get().navigate(new NewEntryView().getClass());
			break;
		default:
			Notification.show("click: " + command);
		}
	}
}
