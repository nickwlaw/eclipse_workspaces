package ui;

import business.Customer;
import db.CustomerDB;
import db.NoSuchCustomerException;
import util.Console;

public class CustomerViewerApp {

	public static void main(String[] args) {

		System.out.println("Customer Viewer\n");
		boolean cont = true;
		while (cont) {
			int number = Console.getIntWithinRange("Enter a customer number: ", 1000, 9999);
			try {
				Customer c = CustomerDB.getCustomer(number);
				System.out.println("\n" + c.getNameAndAddress());
			} catch (NoSuchCustomerException e) {
				System.out.println("\n" + e.getMessage());
			}
			cont = Console.askToContinue("\nDisplay another customer? (y/n): ");
		}
		System.out.println("Goodbye");
	}

}
