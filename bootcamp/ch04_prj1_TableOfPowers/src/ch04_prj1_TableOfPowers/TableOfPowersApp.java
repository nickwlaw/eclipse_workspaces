package ch04_prj1_TableOfPowers;

import java.util.Scanner;

public class TableOfPowersApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Squares and Cubes Table!\n");
		
		Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {

        	System.out.print("Enter an integer: ");
        	int integer = sc.nextInt();
        	
        	String table = "Number\tSquared\tCubed\n======\t=======\t=====\n";
        	
        	for (int i = 1; i <= integer; i++) {
        		String row = i + "\t" + i*i + "\t" + i*i*i + "\n";
        		table = table + row;
        	}
        	System.out.println(table);
        	
        	System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        	
        }
        System.out.println("Bye!");

	}

}