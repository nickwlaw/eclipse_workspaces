package ch05_prj1_DiceRoller;

import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {

		System.out.println("Dice Roller\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("Roll the Dice? (y/n): ");
		String choice = sc.next();
		System.out.println();
		while (choice.equalsIgnoreCase("y")) {

			int d1 = getDieRoll();
			System.out.print("Die 1: " + d1 + "\n");

			int d2 = getDieRoll();
			System.out.print("Die 2: " + d2 + "\n");

			int sum = d1 + d2;
			System.out.println("Total: " + sum + "\n");
			choice = askToContinue(sc);
			
		}

	}

	private static int getDieRoll() {
		int a = (int) (Math.random() * 6) + 1;
		return a;
	}

	public static String askToContinue(Scanner scan) {

		// see if the user wants to continue
		System.out.print("Roll again? (y/n): ");
		String choice = scan.next();
		scan.nextLine(); // discard any other data entered on the line
		System.out.println();
		return choice;

	}
}
