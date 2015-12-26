package krt;

import java.util.Scanner;


public class MenuSystem {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void menuSystem() {
		boolean quit = false;
		int choice;
		
		displayMainMenu();
				
		while (!quit) {
			
				System.out.println("Enter your choice: (0-menu)");
				choice = scanner.nextInt();
			
			
			switch (choice) {
			case 0:
				displayMainMenu();
				break;
			
			// branches menu
			case 1:
				boolean exitBranches = false;
				displayBranchesMenu();	
				while (!exitBranches){
								
					System.out.println("Enter your choice: (0-menu)");
					choice = scanner.nextInt();
					
					// branches menu
					switch (choice){
						
						case 0:
							displayBranchesMenu();
							break;
						case 1:
							Main.displayBranches();
							break;
						case 2:
							Main.displayCustomersPerBranch();
							break;
						case 3:
							Main.addBranch();
							break;
						case 4:
							Main.searchBranch();
							break;
						case 6:
							Main.deleteBranch();
							break;
						case 7:
							displayMainMenu();
							exitBranches = true;
							break;
					}
				}
				
				break;
			
			// Customer menu
			case 2:
				boolean exitCustomers = false;
				displayCustomersMenu();	
	
				while (!exitCustomers){
								
					System.out.println("Enter your choice: (0-menu)");
					choice = scanner.nextInt();
					
					switch (choice){
						case 0:
							displayCustomersMenu();
							break;
						case 1:
							Main.displayCustomersPerBranch();
							break;
						case 3:
							Main.addCustomer();
							break;
						case 4:
							Main.searchCustomer();
							break;
						case 6:
							exitCustomers = true;
							displayMainMenu();
							break;
	
					}
				}
				break;
	
			case 3:
				//searchBranch();
				break;
			
			case 6:
				quit = true;
				break;
	
			default:
				break;
			}
		
		}
		
	}
	
	
	private static void displayMainMenu() {
		System.out.println("*** Main Menu ***\n"+
							"\t 0 - Main menu.\n"+
							"\t 1 - Branches menu.\n"+
							"\t 2 - Customers menu.\n"+
							"\t 6 - Quit.");
		
	}
	
	private static void displayBranchesMenu() {
		System.out.println("\t-- Branches");
		System.out.println("\t\t 0 - Display Menu");
		System.out.println("\t\t 1 - List of branches.");
		System.out.println("\t\t 2 - List of customers per branch.");
		System.out.println("\t\t 3 - Add new branch.");
		System.out.println("\t\t 4 - Search branch name.");
		System.out.println("\t\t xx - Modify branch name.");
		System.out.println("\t\t 6 - Delete existing empty branch.");
		System.out.println("\t\t 7 - to main Menu.");
	}
	
	private static void displayCustomersMenu() {
		System.out.println("\t-- Branches");
		System.out.println("\t\t 0 - Display Menu");
		System.out.println("\t\t 1 - List of customers per branch.");
		System.out.println("\t\t xx - List transactions of customer.");
		System.out.println("\t\t 3 - Add new customer.");
		System.out.println("\t\t 4 - Search customer per branch.");
		System.out.println("\t\t xx - Add new transaction to customer.");
		System.out.println("\t\t xx - Delete existing customer.");
		System.out.println("\t\t 6 - to main Menu.");
	}
	
}


