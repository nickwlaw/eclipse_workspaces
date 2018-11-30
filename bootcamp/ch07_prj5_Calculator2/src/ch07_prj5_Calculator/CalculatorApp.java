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
												 + "<> "
												 ,1,5);
			switch (choice) {
			case 1:
				int int1 = Console.getInt("Enter first integer: ");
				int int2 = Console.getInt("Enter second integer: ");
				System.out.println("The sum of these two integers is " + Calculator.getIntSum(int1,int2)+"\n");
				cont = Console.askToContinue();
				continue;
			case 2:
				int int3 = Console.getInt("Enter first integer: ");
				int int4 = Console.getInt("Enter second integer: ");
				int int5 = Console.getInt("Enter third integer: ");
				System.out.println("The sum of these three integers is " + Calculator.getIntSum(int3,int4,int5)+"\n");
				cont = Console.askToContinue();
				continue;
			case 3:
				double dbl1 = Console.getDouble("Enter first double: ");
				double dbl2 = Console.getDouble("Enter second double: ");
				System.out.println("The sum of these two doubles is " + Calculator.getDblSum(dbl1,dbl2)+"\n");
				cont = Console.askToContinue();
				continue;
			case 4:
				double dbl3 = Console.getDouble("Enter first double: ");
				double dbl4 = Console.getDouble("Enter second double: ");
				double dbl5 = Console.getDouble("Enter third double: ");
				System.out.println("The sum of these three doubles is " + Calculator.getDblSum(dbl3,dbl4,dbl5)+"\n");
				cont = Console.askToContinue();
				continue;
			case 5:
				cont = false;
				break;
			}
		}
		System.out.println("Goodbye");
		
	}

}
