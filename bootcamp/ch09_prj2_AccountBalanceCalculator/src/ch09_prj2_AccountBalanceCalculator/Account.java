package ch09_prj2_AccountBalanceCalculator;

public abstract class Account implements Balanceable, Depositable, Withdrawable {

	private double balance;

	public Account() {
		balance = 0.0;
	}

	@Override
	public void withdrawal(double amount) {
		balance -= amount;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void setBalance(double amount) {
		balance = amount;
	}

}
