/**
 *
 */
package ch.bfh.btx8081.w2018.white.typer.diary;

import java.util.Date;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;

import ch.bfh.btx8081.w2018.white.typer.Observable;
import ch.bfh.btx8081.w2018.white.typer.util.TyperUtil;

/**
 * @author uhruv1
 *
 * View for an entry
 *
 */

@StyleSheet("../style.css")
@Route("diary/entry") 
public class EntryView extends Observable implements HasUrlParameter<Integer> {

	String descriptionText="Heute war ein super Tag. Ich habe mich sehr wohl gefühlt. Am Morgen habe ich den gesamten Tag TV geschaut. Es kam Herr der Ringe";

	/**
	 * generates a entryPresenter
	 */
	public EntryView() {
		EntryPresenter entryPresenter = new EntryPresenter(this);
	}

	/**
	 * this method gets called after the UI changed to this view.
	 * It generates all the vaadin element and fills it with content from the entry model based on the patient ID from the Argument parameter.
	 * @param parameter the entry ID
	 */

	@Override
	public void setParameter(BeforeEvent event, Integer parameter) {

		setId("background");	//setID für Verwendung im CSS. Wird verwendet für blauen Hintergrund

		VerticalLayout mainFrame = new VerticalLayout();


		mainFrame.setId("mainFrame");	//setID für Verwendung im CSS. Wird verwendet für grauen Block in der Mitte.
		mainFrame.setWidth("75%");


		VerticalLayout content = new VerticalLayout();		//setID für Verwendung im CSS. Wird verwendet für Hauptinhalt
		content.setId("contentFrame");
		HorizontalLayout layout_1 = new HorizontalLayout();
		Label lbl_title = new Label("Patient Nr: " + parameter.toString());
		lbl_title.setId("title");
		float status = 1;
		Icon icn_status;
		if(status<0.5)
			icn_status = new Icon(VaadinIcon.FROWN_O);
		else
			icn_status = new Icon(VaadinIcon.SMILEY_O);
		icn_status.setSize("50px");
		icn_status.getStyle().set("position", "absolute");
		icn_status.getStyle().set("right", "100px");
		layout_1.add(lbl_title); 
		layout_1.add(icn_status);
		content.add(layout_1);
		Label lbl_date = new Label("24.11.2018");
		lbl_date.setId("subTitle");
		content.add(lbl_date);

		for(int i=0; i<2; i++) {
			descriptionText=descriptionText+descriptionText; //Wird verwendet für langen Pseudotext
		}
		Label lbl_description = new Label(descriptionText);
		lbl_description.setId("text");
		content.add(lbl_description);
		Checkbox ckbx_discussWithDoctor = new Checkbox("Absprache mit Doktor", true);
		ckbx_discussWithDoctor.setReadOnly(true);
		content.add(ckbx_discussWithDoctor);


		VerticalLayout footer = new VerticalLayout(); 
		footer.setId("footer");		//setID für Verwendung im CSS. Wird verwendet für Button am Ende des Dokuments. 

		Button btn_back = new Button("Back", 
				clickEvent -> clickButton("Back")); 
		footer.add(btn_back);
		footer.setWidth("inherit");

		mainFrame.add(footer);
		mainFrame.add(content);
		add(mainFrame);

	}



}
