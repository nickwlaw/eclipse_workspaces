package ch03_prj3_InterestCalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import java.text.NumberFormat;

public class InterestCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Interest Calculator");
        System.out.println();
        
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter loan amount: ");
		BigDecimal loanAmt = sc.nextBigDecimal();
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		System.out.print("Enter interest rate: ");
		BigDecimal interestRate = sc.nextBigDecimal();
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		BigDecimal interestAmt = loanAmt.multiply(interestRate).setScale(2, RoundingMode.HALF_UP);
		
		String message =
				"Loan amount:       " + currency.format(loanAmt) + "\n" +
				"Interest rate:     " + percent.format(interestRate) + "\n" +
				"Interest:          " + currency.format(interestAmt) + "\n";
		System.out.println(message);


	}

}
