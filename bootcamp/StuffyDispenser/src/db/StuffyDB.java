package db;

import java.util.ArrayList;

import business.Stuffy;

public class StuffyDB {

	/* Instance variables:
	 * ArrayList stuffies maintains an ArrayList of Stuffy objects as they are created, added, and removed from the dispenser.
	 * int usedIDs mimics the unique ID function of a database; every new stuffy is given an ID one greater than the previous max usedID.
	 */
	private ArrayList<Stuffy> stuffies = new ArrayList<>();
	private int usedIDs = 0;

	/* Constructor:
	 * When the application is run, a new StuffyDB is created with user input for the number of Stuffy objects.
	 * A for loop creates a new random Stuffy and adds it to ArrayList stuffies via an addStuffy function that also increments the usedIDs counter. 
	 */
	
	public StuffyDB(int n) {
		for (int i = 1; i <= n; i++) {
			Stuffy s = new Stuffy(i);
			addStuffy(s);
		}
	}

	// The grabStuffy method is used by the main application to check all of the Stuffy objects currently in the stuffies ArrayList and return the Stuffy object if found.
	public Stuffy grabStuffy(int id) {
		for (Stuffy stuffy : stuffies) {
			if (stuffy.getId() == id) {
				stuffies.remove(stuffy);
				return stuffy;
			}
		}
		return null;
	}
	
	// The checkForStuffy method is used by the main application to ensure that a Stuffy object exists before attempting to call the grabStuffy method on it.
	public boolean checkForStuffy(int id) {
		for (Stuffy stuffy : stuffies) {
			if (stuffy.doesStuffyExist(id) == true)
				return true;
		}
		return false;
	}

	// The checkEmpty method is used by the main application to ensure that there are Stuffy objects in the stuffies ArrayList before attempting to grab a Stuffy.
	public boolean checkEmpty() {
		if (stuffies.isEmpty())
			return true;
		return false;
	}
	
	// The addStuffy method takes a Stuffy object and adds it to the stuffies ArrayList.
	public void addStuffy(Stuffy stuffy) {
		stuffies.add(stuffy);
	}

	// The getNextID method is used by the Stuffy class to generate the next available ID for a new Stuffy object. 
	public int getNextID() {
		usedIDs++;
		return usedIDs;
	}

	// The getDBSize method is used by the main application to generate a random Stuffy ID within range of IDs that have been used.
	public int getDBSize() {
		return usedIDs;
	}

}
