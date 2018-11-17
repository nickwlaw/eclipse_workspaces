package ch05_prj1_DiceRoller;

import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		
		System.out.println("Dice Roller\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("Roll the Dice? (y/n): ");
		String choice = sc.next();
        while (choice.equalsIgnoreCase("y")) {
        	double d1 = getDieRoll();
        	double d2 = getDieRoll();
        }
		
		
		
	}

	
	private static double getDieRoll() {
		double a = (int)(Math.random() * 6) + 1;
		return a;
	}
}
