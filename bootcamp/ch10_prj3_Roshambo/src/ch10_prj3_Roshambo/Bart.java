package ch10_prj3_Roshambo;

public class Bart extends Player {

	
	public Bart() {
		super("Bart");
	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}

}
