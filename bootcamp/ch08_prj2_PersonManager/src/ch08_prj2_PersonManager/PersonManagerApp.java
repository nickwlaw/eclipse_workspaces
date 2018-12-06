package ch08_prj2_PersonManager;

public class PersonManagerApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Person Manager\n");
		
		boolean cont = true;
		while (cont == true) {
			
			String choice = Console.getString("Create customer or employee? (c/e): ", "c","e");
			String firstName;
			String lastName;
			String customerNumber;
			String ssn;
			
			switch (choice) {
			case "c":
			case "C":
				firstName = Console.getString("First Name: ");
				lastName = Console.getString("Last Name: ");
				customerNumber = Console.getString("Customer Number: ");
				System.out.println();
				Customer cust1 = new Customer(firstName,lastName,customerNumber);
				cust1.setCustomerNumber(customerNumber);
				System.out.println("You entered a new customer.\n"+cust1.toString()+"\n");
				cont = Console.askToContinue();
				continue;
			case "e":
			case "E":
				firstName = Console.getString("First Name: ");
				lastName = Console.getString("Last Name: ");
				ssn = Console.getString("SSN: ");
				System.out.println();
				Employee emp1 = new Employee(firstName, lastName,ssn);
				emp1.setSsn(ssn);
				System.out.println("You entered a new employee.\n"+emp1.toString()+"\n");
				cont = Console.askToContinue();
				continue;
			}
			
		}
		
		System.out.println();
		System.out.println("Goodbye");

	}

}
