package ch05_prj3_GuessingGame;

import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Guess the Number Game!\n" + "+++++++++++++++++++++++++++++++++++++++");

		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			int theNumber = generateRandomNumber();
			System.out.println("I'm thinking of a number from 1 to 100.\n"
							 + "Try to guess it.\n");
			int guess = 0;
			int count = 0;
			while (guess != theNumber) {
				guess = getIntWithinRange(sc, prompt, val1, val2)
			}
			
		}

	}

	private static String askToContinue(Scanner scan, String prompt, String val1, String val2) {

		String choice = "";
		boolean isValid = false;

		while (!isValid) {
			System.out.println(prompt);
			choice = scan.next();
			if (choice.equalsIgnoreCase(val1) || choice.equalsIgnoreCase(val2)) {
				isValid = true;
			} else {
				System.out.println("Invalid entry. Try again.");
			}
		}
		scan.nextLine();
		System.out.println();
		return choice;
	}
	
	private static String getCorrectMessage(int count) {
		
		String str = "";
		
		if (count <= 3)
			str = "You're a mathematical wizard!";
		else if (count <= 7)
			str = "Not too bad!  You have potential.";
		else if (count > 7)
			str = "What took you so long? Maybe you should take some lessons.";
		
		
		return str;
		
		
	}
	
	private static String getMissMessage(int guess, int number) {
		
		String str = "";
		
		int diff = guess - number;
		
		if (diff > 10)
			str = "Way too high!";
		else if (diff > 0)
			str = "Too high.";
		else if (diff < -10)
			str = "Way too low!";
		else if (diff <0)
			str = "Too low.";
		
		return str;
	}

	private static int getIntWithinRange(Scanner scan, String prompt, int val1, int val2) {

		int n = 0;
		boolean isValid = false;

		while (!isValid) {
			System.out.println(prompt);
			if (scan.hasNextInt()) {
				n = scan.nextInt();
				if (n < val1) {
					System.out.println("Number must be greater than or equal to 0");
				} else {
					if (n > val2) {
						System.out.println("Number must be less than or equal to 100");
					} else {
						isValid = true;
					}
				}
			}
		}
		scan.nextLine();
		System.out.println();
		return n;
	}
	
	private static int generateRandomNumber() {
		int i = 0;
				
				
		return i;
	}

}
