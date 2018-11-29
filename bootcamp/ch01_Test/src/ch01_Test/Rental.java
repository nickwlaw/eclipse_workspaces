package ch01_Test;

public class Rental {
	
	private int numOfPersons;
	
	public int getNumOfPersons() {
		return numOfPersons;
	}
	
	public void setNumOfPersons(int numOfPersons) {
		this.numOfPersons = numOfPersons;
	}
	
	public void addPerson(Rental rental) {
		rental.numOfPersons++;
	}
}