package ch.bfh.btx8081.w2018.white.typer;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import ch.bfh.btx8081.w2018.white.typer.interfaces.TimeLineObject;

/**
 * 
 * @author Rebecca
 *
 */
@Entity
public class Entry implements TimeLineObject  {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int ID;

	private String title = "";
	private LocalDate toDate =null;
	private LocalDate fromDate= null;
	private String description="";
	private float status= 0;
	private boolean discussWithDoctor = true;

	 @ManyToOne
	private Diary diary;
	
	private List<Comment> comments = null;
	
public Entry() {
	
}

	
	/**
	 * bbbbbb 
	 * @param title hhhh
	 * @param toDate2
	 * @param fromDate2
	 * @param description
	 * @param status
	 * @param discussWithDoctor
	 */
	
	public Entry(String title, LocalDate toDate2, LocalDate fromDate2, String description, float status, boolean discussWithDoctor) {
		this.title= title;
		this.toDate= toDate2;
		this.fromDate=fromDate2;
		this.description=description;
		this.status=status;
		this.discussWithDoctor=discussWithDoctor;
		comments = new LinkedList<Comment>();
	}
	
	
	//adds one or more comments to the entry
	public void addComment(String text) {
		comments.add(new Comment(text));
		
	}
	
	
	//returns the description, i.e. the actual diary entry
	public String getDescription() {
		return description;
	}
	
	//returns the patient's mood
	public float getStatus() {
		return status;
	}
	
	//returns the title of the entry
	public String getTitle() {
		return title;
	}
	
	//returns whether the patient wants to discuss the entry with doctor or not
	public boolean getDiscussWithDoctor() {
		return discussWithDoctor;
	}
	
	//returns the diary toDate 
	public LocalDate getToDate() {
		return toDate;
	}
	
	//returns the diary fromDate 
	public LocalDate getFromDate () {
		return fromDate;
	}
	

	 
	//
		public int getId() {
			return this.ID;
		}


		public void setTitle(String title) {
			this.title = title;
			
		}


		public void setFromDate(LocalDate fromDate) {
		     this.fromDate = fromDate;
			
		}
		
		
		public void setToDate(LocalDate toDate) {
		     this.toDate = toDate;
			
		}
		
		
		public void setDescription(String description) {
		     this.description = description;
			
		}
		
		public void setStatus(int i) {
		     this.status = i;
			
		}


		public void setDiary(Diary entries) {
			// TODO Auto-generated method stub
			
		}




		
		
	}
	
	
	
	
	
