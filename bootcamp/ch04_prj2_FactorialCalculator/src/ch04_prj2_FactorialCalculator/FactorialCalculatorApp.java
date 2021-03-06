package ch04_prj2_FactorialCalculator;

import java.util.Scanner;

public class FactorialCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Factorial Calculator\n");
		
		Scanner sc = new Scanner(System.in);
        String choice = "y";
        
        while (choice.equalsIgnoreCase("y")) {
        	
        	long factorial = 1L;
        	
        	System.out.print("Enter an integer that is greater than 0 and less than 12: ");
        	int integer = sc.nextInt();
        	
        	if (integer > 11 || integer < 1) {
        		System.out.println("Integer invalid; try again.");
        		continue;
        	}
        	
        	for (int i = 1; i <= integer; i++) {
        		factorial *= i;
        	}
        	System.out.printf("The factorial of %d is %d\n", integer, factorial);
        	
        	System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        System.out.println("Goodbye!");
	}

}
