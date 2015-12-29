package krt;

import java.util.ArrayList;



public class Bank {

	private ArrayList<Branch> myBranches = new ArrayList<Branch>();
	
	
	////////////////// PUBLIC METHODS //////////////////

	//// BRANCHES 
	public boolean createBranch (Branch branch) {
		if (isOnFile(branch.getName())) {
			return false;
		}
	myBranches.add(branch);
	return true;
	
	}
	
	public boolean createBranch (String branchName) {
		if (isOnFile(branchName)) {
			return false;
		}
	Branch branch = new Branch(branchName);
	myBranches.add(branch);
	return true;
	
	}
	
	
	public boolean displayBranches() {
		if (myBranches.isEmpty()) {
			return false;
		}
		else {
			for (int i = 0; i < myBranches.size(); i++) {
				System.out.println(i+1 + ". " + myBranches.get(i).getName());
			}
			
			return true;
		}	
	}
	
	// find branch
	public boolean querryBranch(String branchName) {
		if (isOnFile(branchName)) {
			return true;
		}
		return false;
	}
	
	// find and delete branch
	public boolean deleteBranch(String branchName) {
		if (isOnFile(branchName)) {
			int position = searchBranch(branchName);
			myBranches.remove(position);
			return true;
		}
	return false;
		
	}
	
	
	//// CUSTOMERS
	
	// Adds customer to an existing branch, returns false if branch does not exist or customer already there.
	
	public boolean addCustomer(Customer customer, String branchName) {
		if (isOnFile(branchName)) {
			
			int position = searchBranch(branchName);
			
			if (myBranches.get(position).addCustomerToBranch(customer) ){
				return true;
			}
		}

		return false;
	}
	
	// Returns true if customer found in branch
	public boolean queryCustomer (String customerName, String branchName){
		if (customerExists(customerName, branchName)){
			return true;
		}
		return false;
	}
	
	// Display a list of customers by branch - supplied branch name
	public void displayCustomersPerBranch (String branchName){
		int position = searchBranch(branchName);
		Branch branch = myBranches.get(position);
		for (int i = 0; i < branch.getCustomers().size(); i++) {
			System.out.println(i + 1 + ": " + branch.getCustomers().get(i).getName());
		}
	}
	
	// Display a list of all customers grouped by branches 
	public void displayCustomersWithBranch(){
		System.out.println("----------- Customers on Branches -----------");
		for (int i = 0; i < myBranches.size(); i++) { // iterate over branches arrayList
			Branch branch = myBranches.get(i);
			System.out.println("** " + branch.getName() + " **");
			for (int j = 0; j < branch.getCustomers().size(); j++) { // iterate over customers arrayList
				Customer customer = branch.getCustomers().get(j);
				System.out.println("\t"+(j+1)+". "+ customer.getName());
			}
		}
	}
	
	// false if branch and customer not on file
	public boolean addCustomerTransaction( String branchName, String customerName, Double transaction){
		if (isOnFile(branchName)) {
			if (customerExists(customerName, branchName)) {
				int branchPosition = searchBranch(branchName);
				int customerPosition = searchCustomer(customerName, branchName);
				ArrayList<Double> transactions = myBranches.get(branchPosition).getCustomers().get(customerPosition).getTransactions();
				if (transactions.add(transaction)) {
					return true;
				}
			}
		}
		return false;
	}

	
	public boolean displayCustomerTransactions(String branchName, String customerName){
		if (customerExists(customerName, branchName)) {

			System.out.println("----------- Customer: "+ customerName + " Transactions -----------");
			int branchPosition = searchBranch(branchName);
			int customerPosition = searchCustomer(customerName, branchName);
			ArrayList<Double> transactions = myBranches.get(branchPosition).getCustomers().get(customerPosition).getTransactions();
			for (int i = 0; i < transactions.size(); i++) {
				System.out.println((i+1) +": " + transactions.get(i).doubleValue());
			}
			return true;
		}else{
			return false;
		}
	
	}
	
	////////////////// PRIVATE METHODS //////////////////
	
	//// returns index
	private int searchBranch (Branch branch){
		return myBranches.indexOf(branch);
	}
	
	//// Returns index
	private int searchBranch (String branchName){
		for (int i = 0; i < myBranches.size(); i++) {
			Branch branch = myBranches.get(i);
			if (branch.getName().equals(branchName)) {
				return i;
			}
		}
		return -1;
	}
	
	//// returns index - returns -1 if false
	private int searchCustomer (String customerName, String branchName){
		int position = searchBranch(branchName);
		ArrayList<Customer> customer = myBranches.get(position).getCustomers();
		for (int i = 0; i < customer.size(); i++) {
			if (customer.get(i).getName().contains(customerName)) {
				return i;
			}
		}
		return -1;
	}
	
	
	
	private boolean customerExists (String customerName, String branchName){
		if (searchCustomer(customerName, branchName) >=0 ){
			return true;
		}
		return false;
	}
	
	private boolean isOnFile (String branchName){
		if (searchBranch(branchName) >= 0 ){
			return true;
		}
		
		return false;
	}
	
	private boolean isOnFile (Branch branch){
		if (searchBranch(branch) >= 0 ){
			return true;
		}
		
		return false;
	}


	

}
