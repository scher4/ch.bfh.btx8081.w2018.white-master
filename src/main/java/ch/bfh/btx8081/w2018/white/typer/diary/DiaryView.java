/**
 *
 */
package ch.bfh.btx8081.w2018.white.typer.diary;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.History;

import ch.bfh.btx8081.w2018.white.typer.Observable;

/**
 * The view for the Diary
 *
 * @author nowad1
 *
 */

public class DiaryView extends Observable {

	private History history = UI.getCurrent().getPage().getHistory();

	private VerticalLayout content;
	private VerticalLayout mainFrame;
	private HorizontalLayout footer;

	/**
	 * Constructor for DiaryView
	 */
	public DiaryView() {

		mainFrame = new VerticalLayout();
		content = new VerticalLayout();
		footer = new HorizontalLayout();

		setSizeFull();
		setId("background");

		mainFrame.setId("mainFrame");
		mainFrame.setAlignItems(Alignment.CENTER);
		mainFrame.setJustifyContentMode(JustifyContentMode.AROUND);
		
		mainFrame.add(titleLayout("Tagebuch"));

		content.setId("contentFrame");
		mainFrame.add(content);

		mainFrame.add(footerLayout());

		mainFrame.add(footer);
		add(mainFrame);
	}

	/**
	 * Creates the footerLayout
	 *
	 * @return the footerLayout
	 */
	private HorizontalLayout footerLayout() {
		footer.setSizeFull();
		footer.setId("footer");
		footer.setAlignItems(Alignment.CENTER);

		Button btn_back = new Button("Back");
		btn_back.addClickListener(e -> history.back());
		footer.add(btn_back);

		Button btn_newEntry = new Button("New Entry");
		btn_newEntry.setIcon(new Icon(VaadinIcon.PLUS_CIRCLE));
		btn_newEntry.getStyle().set("margin-left", "auto");
		btn_newEntry.addClickListener(e -> clickButton("newEntry"));
		footer.add(btn_newEntry);
		return footer;
	}

	/**
	 * Creates the title of the Page
	 *
	 * @return the Title Layout
	 */
	private H1 titleLayout(String title) {
		H1 header = new H1();
		header.setText(title);
		return header;
	}

	/**
	 * 
	 * Groups Date and Button for a Diary Entry
	 * 
	 * @param id     the ID of the Entry
	 * @param title  the title to display
	 * @param toDate the date to display
	 * @return
	 */
	private HorizontalLayout entryLayout(int id, String title, LocalDate toDate) {
		HorizontalLayout entryLayout = new HorizontalLayout();

		// Set some layout Options
		entryLayout.setDefaultVerticalComponentAlignment(Alignment.CENTER);
		entryLayout.setSizeFull();

		// Add DateLabel
		Label dateLabel = new Label(toDate.format(DateTimeFormatter.ofPattern("dd. MM. uuuu")));
		dateLabel.setWidth(null);
		entryLayout.add(dateLabel);

		// Add Title Label
		Label titleLabel = new Label(title);
		titleLabel.setWidth(null);
		entryLayout.add(titleLabel);

		// Add Button to show the Details of an Entry
		Button showDetailsButton = new Button(new Icon(VaadinIcon.ANGLE_RIGHT));
		showDetailsButton.getStyle().set("margin-left", "auto");
		showDetailsButton.addClickListener(e -> {
			showDetailsButton.getUI().ifPresent(ui -> ui.navigate("diary/entry/" + id));
		});
		entryLayout.add(showDetailsButton);

		return entryLayout;
	}

	/**
	 * 
	 * Adds an Entry to the View using the {@code entryLayout} in this DiaryView
	 * 
	 * @param id     the ID of the Entry
	 * @param title  the Title to display
	 * @param toDate the Date to display
	 */
	public void displayEntry(int id, String title, LocalDate toDate) {
		content.add(entryLayout(id, title, toDate));
	}
}
