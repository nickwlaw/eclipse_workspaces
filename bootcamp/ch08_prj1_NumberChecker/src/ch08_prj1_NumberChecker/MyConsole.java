package ch08_prj1_NumberChecker;

public class MyConsole extends Console {

	public String getString(String prompt) {

		// prompt user for any string
		String s = "";
		System.out.print(prompt);
		if (sc.hasNext()) {
			s = sc.next();
		}
		sc.nextLine();
		return s;
	}
	
	public boolean testEven(int int1) {
		boolean isEven = false;
		if (int1%2==0) {
			isEven = true;
			return isEven;
		}
		return isEven;
	}
	
	public static boolean askToContinue() {

		// see if the user wants to continue

		boolean isValid = false;
		while (!isValid) {
			System.out.print("Continue? (y/n): ");
			
			String choice = sc.nextLine();
				
			if (choice.isEmpty()) {
				System.out.println("This entry is required. Please try again.");
				sc.nextLine();
			} else if (!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n")) {
				System.out.println("Please enter \"y\" to continue or \"n\" to quit.");

			} else if (choice.equalsIgnoreCase("y")) {
				isValid = true;
				sc.nextLine();
				System.out.println();

			} else {
				break;
			}
		}
		return isValid;
	}
}
