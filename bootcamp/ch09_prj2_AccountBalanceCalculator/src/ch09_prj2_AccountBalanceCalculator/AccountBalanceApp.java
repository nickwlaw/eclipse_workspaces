package ch09_prj2_AccountBalanceCalculator;

public class AccountBalanceApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Account Application\n");
		
		System.out.println("Starting Balances");
		CheckingAccount ca = new CheckingAccount(1.0);
		ca.setBalance(1000.0);
		SavingsAccount sa = new SavingsAccount(.01);
		sa.setBalance(1000.0);
		displayBalances(ca, sa);
		
		System.out.println("Enter the transactions for the month\n");
		
		boolean cont = true;
		while (cont == true) {
			
			String transType = Console.getString("Withdrawal or Deposit? (w/d): ");
			String acctType = Console.getString("Checking or Savings? (c/s): ");
			double amount = Console.getDouble("Amount?: ");
			
			
			//this is where you left off
			Account a = null;
			if (acctType.equalsIgnoreCase("c"))
				a = ca;
			else
				a = sa;
			if (acctType.equalsIgnoreCase("c"))
				ca.setBalance(amount);
			
			
			cont = Console.askToContinue();
			
			}
			
			
			
			
			
			
			
			
		}

	}

	private static void displayBalances(Balanceable b1, Balanceable b2) {
		System.out.println("Checking: "+b1.getBalance());
		System.out.println("Savings:  "+b2.getBalance());
	}
}
