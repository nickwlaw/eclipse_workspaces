package ch07_prj5_Calculator;

public class CalculatorApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Chapter 7 Calculator\n");
		
		boolean cont = true;
		while (cont == true) {
			
			int choice = Console.getIntWithinRange("Would you like to:\n"
									  + "1) add two integers?\n"
									  + "2) add three integers?\n"
									  + "3) add two doubles?\n"
									  + "4) add three doubles?\n"
									  + "5) quit?\n"
									  ,1,5);
			if (choice == 1) {
				int int1 = Console.getInt("Enter first integer: ");
				int int2 = Console.getInt("Enter second integer: ");
				Calculator intSum = new Calculator(int1, int2);
				System.out.println("The sum of these two integers is " + intSum.getIntSum()+"\n");
				cont = Console.askToContinue();
			} else if (choice == 2) {
				int int1 = Console.getInt("Enter first integer: ");
				int int2 = Console.getInt("Enter second integer: ");
				int int3 = Console.getInt("Enter third integer: ");
				Calculator intSum = new Calculator(int1, int2, int3);
				System.out.println("The sum of these three integers is " + intSum.getIntSum()+"\n");
				cont = Console.askToContinue();
			} else if (choice == 3) {
				double dbl1 = Console.getDouble("Enter first double: ");
				double dbl2 = Console.getDouble("Enter second double: ");
				Calculator intDbl = new Calculator(dbl1, dbl2);
				System.out.println("The sum of these two doubles is " + intDbl.getDblSum()+"\n");
				cont = Console.askToContinue();
			} else if (choice == 4) {
				double dbl1 = Console.getDouble("Enter first double: ");
				double dbl2 = Console.getDouble("Enter second double: ");
				double dbl3 = Console.getDouble("Enter third double: ");
				Calculator intDbl = new Calculator(dbl1, dbl2, dbl3);
				System.out.println("The sum of these three doubles is " + intDbl.getDblSum()+"\n");
				cont = Console.askToContinue();
			} else if (choice == 5) {
				break;
			}
		}
		System.out.println("Goodbye");
		
	}

}
