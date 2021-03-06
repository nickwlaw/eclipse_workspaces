package ch02_prj3_RectangleCalculator;

import java.util.Scanner;

public class RectangleCalculatorApp {

	public static void main(String[] args) {
		// create welcome statement
		System.out.println("Welcome to the Area and Perimeter Calculator \n");
		
		Scanner sc = new Scanner(System.in);
		
		//get values for length and width
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter length: ");
			double length = sc.nextDouble();
			
			System.out.print("Enter width:  ");
			double width = sc.nextDouble();
			
			// display values for area and perimeter
			System.out.println("Area:       " + length*width);
			System.out.println("Perimeter:  " + (length*2 + width*2));
			
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
		// create goodbye statement
		System.out.println("Goodbye!");
	}

}
