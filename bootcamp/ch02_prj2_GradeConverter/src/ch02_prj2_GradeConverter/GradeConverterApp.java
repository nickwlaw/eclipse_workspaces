package ch02_prj2_GradeConverter;

import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Letter Grade Converter");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter numerical grade: ");
			int numericalGrade = sc.nextInt();
			
			String letterGrade = "";
			if (numericalGrade >= 88) {
				letterGrade = "A";
			} else if (numericalGrade >= 80) {
				letterGrade = "B";
			} else if (numericalGrade >= 67) {
				letterGrade = "C";
			} else if (numericalGrade >= 60) {
				letterGrade = "D";
			} else if (numericalGrade < 60) {
				letterGrade = "F";
			}
			System.out.println("Letter Grade: " + letterGrade);
			System.out.println();
			
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
		System.out.println("Goodbye!");
	}
}
