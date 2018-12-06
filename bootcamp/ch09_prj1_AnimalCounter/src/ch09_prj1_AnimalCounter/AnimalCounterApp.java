package ch09_prj1_AnimalCounter;

public class AnimalCounterApp {

	public static void main(String[] args) {
		System.out.println("Counting alligators...\n");
		Alligator A = new Alligator();
		count(A, 3);
		System.out.println("Counting sheep...\n");
		Sheep D = new Sheep("Dolly");
		count(D, 2);
		try {
			Sheep M = (Sheep) D.clone();
			M.setName("Molly");
			count(M, 3);
		} catch (CloneNotSupportedException e) {
			System.out.println("A cloning error occurred.");
		}
		count(D, 1);

	}

	public static void count(Countable c, int maxCount) {
		c.resetCount();
		for (int i = 1; i <= maxCount; i++) {
			c.incrementCount();
			System.out.println(c.getCountString());
		}
		System.out.println("");
	}

}
