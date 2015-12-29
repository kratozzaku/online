package krt;

import java.util.Scanner;

public class Main {
	

	private static Scanner scanner = new Scanner(System.in);
	private static Scanner scannerDouble = new Scanner(System.in);
	private static Bank bank = new Bank();
	
	
	public static void main(String[] args) {
		
		MenuSystem.menuSystem();

	}
	
	public static void addBranch() {
		System.out.println("Enter new branch name: ");
		String name = scanner.nextLine();
		Branch newBranch =  new Branch(name);
		if (bank.createBranch(newBranch)) {
			System.out.println("Branch: " + name + " added.");
		} else{
			System.out.println("Branch failed to be added.");
		}	

	}
	
	public static void displayBranches() {
		System.out.println("--- List of Bank branches: --- ");
		if (!bank.displayBranches()) {
			System.out.println("No items in the list.\n");
		}
		System.out.println("------------------------------\n");
	}
	
	public static void searchBranch() {
		System.out.println("Enter branch to search: ");
		String branchName = scanner.nextLine();
		if (bank.querryBranch(branchName)) {
			System.out.println("Branch found");
		}
		else{
			System.out.println("Branch not on file.");
		}
		
	}
		
	public static void deleteBranch() {
		System.out.println("Enter branch to delete: ");
		String branchName = scanner.nextLine();
		if (bank.deleteBranch(branchName)) {
			System.out.println("Branch " + branchName + " deleted.");
		}
		else{
			System.out.println("Branch was not found. Failed to delete.");
		}
		
	}

	public static void addCustomer() {
		System.out.println("Enter customer branch: ");
		String branchName = scanner.nextLine();
		
		System.out.println("Enter new customer name: ");
		String name = scanner.nextLine();
		System.out.println("Enter transaction: ");
		Double transaction = scannerDouble.nextDouble();

		Customer customer = new Customer(name, transaction);	
		
		if (bank.addCustomer(customer, branchName)){
			System.out.println("Customer " + name + " was added to branch.");
		}
		else{
			System.out.println("Customer not added. Chek if branch exists.");
		}
  
	}
		
	public static void displayCustomersPerBranch() {
		System.out.println("Enter branch name: ");
		String branchName = scanner.nextLine();
		
		bank.displayCustomersPerBranch(branchName);
	}
	
	public static void displayCustomersWithBranch(){
		bank.displayCustomersWithBranch();
	}
	

	public static void searchCustomer(){
		System.out.println("Enter customer branch: ");
		String branchName = scanner.nextLine();
		System.out.println("Enter customer name: ");
		String name = scanner.nextLine();
		if (bank.queryCustomer(name, branchName)){
			System.out.println("Customer exists. ");
		}
		else {
			System.out.println("Customer not found.");
		}
	}
	
	public static void displayCustomerTransactions() {
		System.out.println("Enter customer branch: ");
		String branchName = scanner.nextLine();
		System.out.println("Enter customer name: ");
		String name = scanner.nextLine();
		if(!bank.displayCustomerTransactions(branchName, name)){
			System.out.println("Error.");
		}
	}
	
	public static void addCustomerTransaction(){
		System.out.println("Enter customer branch: ");
		String branchName = scanner.nextLine();
		System.out.println("Enter new customer name: ");
		String name = scanner.nextLine();
		System.out.println("Enter transaction: ");
		Double transaction = scannerDouble.nextDouble();
		if (bank.addCustomerTransaction(branchName, name, transaction)) {
			System.out.println("Transaction added");
		}
		else{
			System.out.println("Adding transaction failed. Check if Branch and Customer exist.");
		}
	}
	
}
