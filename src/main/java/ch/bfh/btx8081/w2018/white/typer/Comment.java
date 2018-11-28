package ch.bfh.btx8081.w2018.white.typer;

import java.time.LocalDate;

public class Comment {
	
	private String text;
	private LocalDate date;
	
	/**
	 * COnstructor for a cmment
	 * @param text THe actual comment
	 */
	public Comment (String text) {
		this.text = text;
		this.date = LocalDate.now();
	}


	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}


	/**
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}
	

	

}
