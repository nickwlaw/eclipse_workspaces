package ch10_prj3_Roshambo;

public abstract class Player {
	private String name;
	private Roshambo choice;
	
	
	public Player(String name) {
		this.name = name;
	}

	public abstract Roshambo generateRoshambo ();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Roshambo getChoice() {
		return choice;
	}

	public void setChoice(Roshambo choice) {
		this.choice = choice;
	}
	
	
}
