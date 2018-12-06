package ch09_prj1_AnimalCounter;

public class Sheep extends Animal implements Cloneable {

	private String name;

	public Sheep(String name) {
		super();
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getCountString() {
		return count + " " + name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
