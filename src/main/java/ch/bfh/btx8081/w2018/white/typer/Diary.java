package ch.bfh.btx8081.w2018.white.typer;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * 
 * @author Rebecca
 *
 */
@Entity 
public class Diary {
	
	@Id
	 @OneToMany(mappedBy = "diary")
	private List<Entry> entries;
	

	public Diary () {
		entries = new LinkedList<Entry>();
	}

	//create an Entry
	public void createEntry(String title, LocalDate toDate, LocalDate fromDate, String description, float status, boolean discussWithDoctor, 
			List<Comment> comments) {
		entries.add(new Entry(title, toDate, fromDate, description, status, discussWithDoctor));
		
		PersistierenDB db = PersistierenDB.getInstance();

}
	
	//returns the list of entries
	public List<Entry> getAll(){
		

		return entries;
		
		
	}

	
}
