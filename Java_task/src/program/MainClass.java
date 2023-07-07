package program;

import catalog.Catalog;
import utils.Questions;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		String answer = "";
		Catalog catalogue = new Catalog();
		int choice = 0;
		Scanner scan = new Scanner(System.in);
		catalogue.loadFromFile("C:\\Users\\pc\\Desktop\\input.txt");

		System.out.println("If you wish to add a new deal, please press 1.");
		System.out.println("If you wish to print the catalog, please press 2.");
		System.out.println("If you wish to print the catalog, sorted by Quality, please press 3.");
		System.out.println("If you wish to print a list of all purchased mushrooms by type, please press 4.");
		System.out.println("If you wish to exit the program, please press 5.");
		while (choice < 5) {
			catalogue.writeCatalogueToFile("C:\\Users\\pc\\Desktop\\output.txt");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				catalogue.addDeal(Questions.consoleToDeal());
				System.out.println("Would you like to add another deal? (y/n)");
				do {
				    answer = scan.next();
				    if (answer.equals("y")) {
				        catalogue.addDeal(Questions.consoleToDeal());
				        System.out.println("Deal, added, would you like to add another?");
				    }
				} while (!answer.equals("n"));
				if (answer.equals("n")) {
					System.out.println("Returning to main menu...");
				}
				catalogue.writeCatalogueToFile("C:\\Users\\pc\\Desktop\\output.txt");
				break;
			case 2:
				catalogue.printCatalog();
				break;
			case 3:
				catalogue.sortByQuality();
				break;
			case 4:
				catalogue.printList();
				break;
			case 5:
				System.out.println("Exiting program...");
				break;
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
				break;
			}
			if (choice < 5) {
				System.out.println("What else do you wish to do?");
			}
			if (choice > 5) {
				System.out.println("Invalid choice. Please enter a valid option.");
			}
		}
	}
}
