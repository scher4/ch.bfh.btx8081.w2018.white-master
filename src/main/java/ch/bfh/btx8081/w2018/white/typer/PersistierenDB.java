
package ch.bfh.btx8081.w2018.white.typer;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * 
 * @author Fatma-Zahra
 *This class with the EntityManager is responsible for adding and deleting the data works
 *Connect the Database with JPA
 */


public class PersistierenDB  {


	private static final String PERSISTENCE_UNIT_NAME=  "ch.bfh.btx8081.w2018.white" ;
	private static final Entry Entry = null;
	private EntityManager em;
	private static PersistierenDB dp = null;
	/*
	 * class constructor
	 */
	public PersistierenDB() {
		 em = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
	}
	
	
//	
/*
	 * to retrieve the PersistierenDb object
	 */
	public static PersistierenDB getInstance(){
		if(dp == null) {
			dp = new PersistierenDB();
		}
		return dp;
	}
	
	/*
	 * make a new Object persistent
	 */

//	public void addEntry() {
	//    EntityTransaction entityTr = getEm().getTransaction();
	  //  entityTr.begin();
		//getEm().persist();
		//entityTr.commit();
	  // 
	//	em.close();
//	}

//	private EntityManager getEm() {
	//	return em;
//	}

	//  
	
	public void addEntry(Entry p) {		
		EntityTransaction tr = em.getTransaction();
	    tr.begin();
	    
	    try {
		    em.persist(p);
		    em.flush();
		    tr.commit();
	    } catch (Exception e){
	    	System.out.println("ERROR ON INSERT Entry: " + e.getMessage());
	    }
	    em.close();
	}
	
	public void updateEntry(Diary d) {		
		EntityTransaction tr = em.getTransaction();
	    Diary diary = em.find(Diary.class, d.getAll());
	    
	    tr.begin();
	    diary = d;
	    try {
		    em.merge(diary); 
		    em.flush();
		    tr.commit();
	    } catch (Exception e){
	    	System.out.println("ERROR ON UPDATE Entry: " + e.getMessage());
	    }
	    em.close();
	}
	
	// public static void main(String[] args) {
		//	    PersistierenDB app = new PersistierenDB();
			//    app.addEntry(Entry);
		
			    
			  //}

	
	
	
	

	
}