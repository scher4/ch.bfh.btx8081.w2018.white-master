/**
 * 
 */
package ch.bfh.btx8081.w2018.white.typer.diary;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.router.Route;

/**
 * @author nowad1
 * Shows Details of a DiaryEntry
 */

@Route("Diary/ViewDetailDiaryEntry")
public class ViewDetailDiaryEntry extends FlexLayout {

	public ViewDetailDiaryEntry() {
		add(new Label("Detailled View"));

	}

}
