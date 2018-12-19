package ui;

import business.Stuffy;
import db.StuffyDB;
import util.Console;

public class StuffyDispenserApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Stuffy Dispenser Application!\n");
		StuffyDB sdb = new StuffyDB(Console.getIntWithinRange("How many stuffies would you like to have in your Stuffy Dispenser? (1-25): ", 1, 25));
		boolean cont = true;
		while (cont == true) {
			System.out.println();
			System.out.println("Menu:");
			System.out.println("1) Grab a stuffy");
			System.out.println("2) Add a stuffy");
			System.out.println("3) Exit");
			int choice = Console.getIntWithinRange("<> ", 1, 3);
			if (choice == 1) {
				if (sdb.checkEmpty() == true)
					System.out.println("There are no stuffies in the dispenser.");
				else {
					boolean isStuffy = false;
					while (!isStuffy) {
						int stuffyID = ((int) (Math.random() * sdb.getDBSize()) + 1);
						if (sdb.checkForStuffy(stuffyID) == true) {
							Stuffy s = new Stuffy();
							s = sdb.grabStuffy(stuffyID);
							System.out.println("You got a " + s + "!");
							isStuffy = true;
						}
					}
				}
			} else if (choice == 2) {
				String type = Console.getString("Type?: ");
				String size = Console.getString("Size?: ");
				String color = Console.getString("Color?: ");
				Stuffy s = new Stuffy(sdb, type, size, color);
				sdb.addStuffy(s);
				System.out.println("You added a " + s + " to the Stuffy Dispenser.");
			} else if (choice == 3) {
				cont = false;
			}
		}
		
		System.out.println("Goodbye");
	}

}
