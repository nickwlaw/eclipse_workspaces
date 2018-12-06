package ch09_prj2_AccountBalanceCalculator;

import java.text.Format;

public class CheckingAccount extends Account {

	double monthlyFee;

	public CheckingAccount(double monthlyFee) {
		super();
		this.monthlyFee = monthlyFee;
	}

	public double getMonthlyFee() {
		return monthlyFee;
	}

	public void setMonthlyFee(double monthlyFee) {
		this.monthlyFee = monthlyFee;
	}
	
	public void subtractMonthlyFeeFromBalance() {
		setBalance(getBalance()+monthlyFee);
	}

}
