package ch.bfh.btx8081.w2018.white.typer.diary.newEntry;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

import ch.bfh.btx8081.w2018.white.typer.Observable;

@Route("NewEntry")
/**
 * GUI zum Erstellen eines neuen Entries
 * @author Marc Gauch
 */
public class NewEntryView extends Observable {
	private TextField txtTitle;
	private TextArea txtText;
	private Checkbox cbxDiscuss;

	public NewEntryView() {

		NewEntryPresenter presenter = new NewEntryPresenter(this);

//Title
		add(new Label("Eintrag erfassen"));

//Title
		txtTitle = new TextField();
		txtTitle.setPlaceholder("Titel eingeben");
		add(txtTitle);

// Body
		txtText = new TextArea();
		txtText.setPlaceholder("Text eingeben");
		add(txtText);

// mood
		//TODO: implement this. slider or buttons as radio group

// Will besprechen
		cbxDiscuss = new Checkbox("Will besprechen");
		add(cbxDiscuss);

// Buttons
		HorizontalLayout hlButtons = new HorizontalLayout();
		add(hlButtons);

		Button btnBack = new Button();
		btnBack.setText("Abbrechen");
		btnBack.addClickListener(event -> clickButton("back"));
		hlButtons.add(btnBack);

		Button btnSave = new Button();
		btnSave.setText("Speichern");
		btnSave.addClickListener(event -> clickButton("save"));
		hlButtons.add(btnSave);

	}
	
	
	public String getTitle() {
		return txtTitle.getValue();
	}
	public String getText() {
		return txtText.getValue();
	}
	public boolean wantsToDiscuss() {
		return cbxDiscuss.getValue();
	}
}
