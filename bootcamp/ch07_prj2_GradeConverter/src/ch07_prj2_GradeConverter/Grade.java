package ch07_prj2_GradeConverter;

public class Grade {
	int number;
	String letter;

	public Grade() {
		this.number = 0;
		this.letter = "";
	}

	public Grade(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getLetter() {
		String letter = "A";
		if (this.number < 60) {
			letter = "F";
		} else if (this.number <= 67) {
			letter = "D";
		} else if (this.number <= 79) {
			letter = "C";
		} else if (this.number <= 87) {
			letter = "B";
		} else;
		return letter;
	}

}
