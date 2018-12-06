package ch09_prj1_AnimalCounter;

public abstract class Animal implements Countable {

	protected int count;

	public Animal() {
		this.count = 0;
	}

	@Override
	public void incrementCount() {
		count += 1;
	}

	@Override
	public void resetCount() {
		count = 0;
	}

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public String getCountString() {
		return null;
	}

}
