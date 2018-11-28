/**
 * 
 */
package ch.bfh.btx8081.w2018.white.typer.diary;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import ch.bfh.btx8081.w2018.white.typer.Diary;
import ch.bfh.btx8081.w2018.white.typer.Entry;

/**
 * 
 * The Main view for the Diary
 * @author nowad1
 *
 */
@Route("Diary")

public class MainDiaryView extends VerticalLayout {
/**
 * Constructs a new MainDiaryView
 */
	public MainDiaryView() {
		// Create Model and Vaadin view Implementation
		
		Diary model = new Diary();
		DiaryView view = new DiaryView();
		
		//FIXME Switch to persistence, when finished
		// Generate List of Diary Entries
		List<Entry> diaryItems = model.getAll();
		// Populate the List
		LocalDate aDate = LocalDate.now();
		for (int i = 0; i < 10; i++) {
			aDate = aDate.minus(i, ChronoUnit.DAYS);
			diaryItems.add(new Entry("Title " + i, aDate, aDate, "The Description No" + i, 0f, (i/2==0)));
		}
				
		// Presenter connects the model and view
		new DiaryPresenter(model, view);
		
		// The view implementaion is a Vaadin component
		add(view);
	}

}
