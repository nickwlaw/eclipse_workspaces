package ch09_prj3_ConsoleTester;

public class UserIOTestApp {

	public static void main(String[] args) {
		
		ConsoleIO cio = new ConsoleIO();
		
		cio.println("Welcome to the Console Tester Application\n");
		
		cio.println("Int Test");
		cio.getInt("Enter an integer between -100 and 100: ", -100, 100);
		cio.println();
		
		cio.println("Double Test");
		cio.getDouble("Enter a double between -100 and 100: ", -100.0, 100.0);
		cio.println();
		
		cio.println("Required String Test");
		cio.getString("Enter your name: ");
		cio.println();
		
		cio.println("String Choice Test");
		cio.getString("Choose a letter (x/y): ", "x", "y");
		cio.println();
		
		cio.println("Congratulations, you passed all of the tests!");
		
	}

}
