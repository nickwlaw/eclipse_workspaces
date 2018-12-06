package ch09_prj2_AccountBalanceCalculator;

public class SavingsAccount extends Account {
	
	private double interestRate;
	private double interestPayment;
	
	public SavingsAccount(double interestRate) {
		super();
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getInterestPayment() {
		return interestPayment;
	}

	public void setInterestPayment(double interestPayment) {
		this.interestPayment = interestPayment;
	}
	
	public void addInterestPaymentToBalance() {
		setInterestPayment(getBalance() * interestRate);
		setBalance(getBalance()+interestPayment);
	}
}
