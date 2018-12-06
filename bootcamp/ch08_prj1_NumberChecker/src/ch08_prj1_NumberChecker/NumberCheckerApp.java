package ch08_prj1_NumberChecker;

public class NumberCheckerApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Odd/Even Checker\n");
		
		MyConsole mc = new MyConsole();
		boolean cont = true;
		
		while (cont == true) {
			
			int int1 = mc.getInt("Enter an integer: ");
			if (mc.testEven(int1)==true) {
				System.out.println("The number "+int1+" is even.");
			} else {
				System.out.println("The number "+int1+" is odd.");
			}
			
			cont = MyConsole.askToContinue();
		}
		System.out.println("Goodbye");
	}

}
