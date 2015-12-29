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
						case 5:
							Main.deleteBranch();
							break;
						case 6:
							displayMainMenu();
							exitBranches = true;
							break;
						default:
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
						case 2:
							Main.displayCustomersWithBranch();
							break;
						case 3:
							Main.displayCustomerTransactions();
							break;
						case 4:
							Main.addCustomer();
							break;
						case 5:
							Main.addCustomerTransaction();
							break;
						case 6:
							Main.searchCustomer();
							break;
						case 7:
							exitCustomers = true;
							displayMainMenu();
							break;
						default:
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
		System.out.println("\t-- Branches\n"+
							"\t\t 0 - Display Menu\n"+
							"\t\t 1 - List of branches.\n"+
							"\t\t 2 - List of customers per branch.\n"+
							"\t\t 3 - Add new branch.\n"+
							"\t\t 4 - Search branch name.\n"+
							"\t\t 5 - Delete existing empty branch.\n"+
							"\t\t 6 - to main Menu.");
	}
	
	private static void displayCustomersMenu() {
		System.out.println("\t-- Branches\n"+
							"\t\t 0 - Display Menu\n"+
							"\t\t 1 - List of customers per branch.\n"+
							"\t\t 2 - List of all customers.\n"+
							"\t\t 3 - List transactions of customer.\n"+
							"\t\t 4 - Add new customer.\n"+
							"\t\t 5 - Add new transaction to customer.\n"+
							"\t\t 6 - Search customer per branch.\n"+
							"\t\t xx - Delete existing customer.\n"+
							"\t\t 7 - to main Menu.\n");
	}
	
		
	
	
}


