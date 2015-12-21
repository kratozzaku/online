package krt;

import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	private static MobilePhone phone = new MobilePhone();

	public static void main(String[] args) {
		
		boolean quit = false;
		int choice = 0;
		
		displayMenu();
				
	while (!quit) {
		System.out.println("Enter your choice: ");
		choice = scanner.nextInt();
		scanner.nextLine();
		
		switch (choice) {
				case 0:
					displayMenu();
					break;
				case 1:
					phone.displayContacts();
					break;
				case 2:
					addContact();
					break;
				case 3:
					modifyContact();
					break;
				case 4:
					searchContact();
					break;
				case 5:
					removeContact();
					break;
				case 6:
					quit = true;
					break;
				default:
					displayMenu();
					break;
			}
		}	
	}



	private static void displayMenu() {
		System.out.println("****** Menu ******");
		System.out.println("\t 0. Display menu.");
		System.out.println("\t 1. Show phonebook items.");
		System.out.println("\t 2. Add new contact.");
		System.out.println("\t 3. Modify existing contact.");
		System.out.println("\t 4. Search list for a contact.");
		System.out.println("\t 5. Remove contact.");
		System.out.println("\t 6. Quit.");
	}
	
	private static void addContact() {
		System.out.println("Enter name: ");
		String name = scanner.nextLine();
		System.out.println("Enter phone number: ");
		String phoneNo = scanner.nextLine();
		phone.addContact(name, phoneNo);
	}
	
	private static void modifyContact() {
		System.out.println("Enter name to modify: ");
		String name = scanner.nextLine();
		System.out.println("Enter new name:");
		String newName = scanner.nextLine();
		System.out.println("Enter new phone number: ");
		String phoneNo = scanner.nextLine();
		phone.modifyContact(name, newName, phoneNo);
		
	}
	
	private static void searchContact() {
		System.out.println("Enter name to search: ");
		String name = scanner.nextLine();
		phone.searchContact(name);
	}
	
	private static void removeContact() {
		System.out.println("Enter name to delete: ");
		String name = scanner.nextLine();
		phone.removeContact(name);
	}
	


}
