package ch02_prj1_StudentRegistration;

import java.util.Scanner;

public class StudentRegistrationApp {

	public static void main(String[] args) {
		System.out.println("Student Registration Form");
		System.out.println();
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Name: ");
		String firstName = sc.next();
		
		System.out.print("Enter Last Name: ");
		String lastName = sc.next();
		
		System.out.print("Enter Year of Birth: ");
		int birthYear = sc.nextInt();
		
		System.out.println();
		System.out.println("Welcome " + firstName + " " + lastName + "!");
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is: " + firstName + "*" + birthYear);
	}
}
