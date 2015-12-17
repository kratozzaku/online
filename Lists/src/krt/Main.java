package krt;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();
	
	
	public static void main(String[] args) {
		
		boolean quit = false;
		int choice = 0;
		
		printInstructions();
		
		while (!quit) {
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				groceryList.printGroceryList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchItem();
				break;
			case 6:
				quit = true;
				break;
			default:
				System.out.println("Enter number from menu.");
				printInstructions();
			}
			
		}
		

		
	}
	





	public static void printInstructions(){
		System.out.println("******* Choice Menu *******");
		System.out.println("\nPress key to:");
		System.out.println("\t 0: Print choice options.");
		System.out.println("\t 1: Print list of groceries");
		System.out.println("\t 2: Add new item.");
		System.out.println("\t 3: Modify existing item.");
		System.out.println("\t 4: Remove an item");
		System.out.println("\t 5: Search for an item.");
		System.out.println("\t 6: Quit");
	}
	
	public static void addItem(){
		System.out.println("Enter the new item: ");
		groceryList.addGroceryItem(scanner.nextLine());
	}
	
	public static void modifyItem(){
		System.out.println("Enter item number to be modified: ");
		int itemNo = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter new item: ");
		String newItem = scanner.nextLine();
		groceryList.modifyGroceryItem(itemNo - 1, newItem);
		
	}

	public static void removeItem(){
		System.out.println("Enter item number to remove");
		int itemNo = scanner.nextInt();
		scanner.nextLine();
		groceryList.removeGroceryItem(itemNo - 1);
		
	}
	
	private static void searchItem() {
		System.out.println("Enter item to search: ");
		String searchItem = scanner.next();
		if (groceryList.findItem(searchItem) != null) {
			System.out.println("Found " + searchItem + ".");
		} else {
			System.out.println(searchItem + " was not found.");

		}
		
	}

	
}
