package ch.bfh.btx8081.w2018.white.typer.util;

import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Label;

/**
 * 
 * @author uhruv1
 *
 * a util class with tools
 *
 */

public abstract class TyperUtil {

	/**
	 * show a dialog
	 * @param label dialogtext
	 */
	public static void showDialog(String label) {
		Dialog dialog = new Dialog();
		dialog.add(new Label(label));
		dialog.open();
	}

}
