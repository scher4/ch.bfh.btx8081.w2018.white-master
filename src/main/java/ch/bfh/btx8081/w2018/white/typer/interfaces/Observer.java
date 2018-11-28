/**
 * 
 */
package ch.bfh.btx8081.w2018.white.typer.interfaces;

/**
 * @author uhruv1
 *
 * the interface for all the presenter, which want to observe. 
 *
 */
public interface Observer {

	/**
	 * the method which will be called by the view when a button was clicked
	 * @param command which button was clicked
	 */
	public void clickButton(String command);
	 
	
}
