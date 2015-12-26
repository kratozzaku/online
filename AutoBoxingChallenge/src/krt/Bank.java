package krt;

import java.util.ArrayList;



public class Bank {

	private ArrayList<Branch> myBranches = new ArrayList<Branch>();
	
	
	// PUBLIC METHODS

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
	

	public boolean querryBranch(String branchName) {
		if (isOnFile(branchName)) {
			return true;
		}
		return false;
	}

	public boolean deleteBranch(String branchName) {
		if (isOnFile(branchName)) {
			int position = searchBranch(branchName);
			myBranches.remove(position);
			return true;
		}
	return false;
		
	}
	
	
	public boolean addCustomer(Customer customer, String branchName) {
		if (isOnFile(branchName)) {
			
			int position = searchBranch(branchName);
			
			if (myBranches.get(position).addCustomerToBranch(customer) ){
				return true;
			}
		}

		return false;
	}
	
	
	public boolean queryCustomer (String customerName, String branchName){
		if (customerExists(customerName, branchName)){
			return true;
		}
		return false;
	}
	
	public void displayCustomersPerBranch (String branchName){
		int position = searchBranch(branchName);
		Branch branch = myBranches.get(position);
		for (int i = 0; i < branch.getCustomers().size(); i++) {
			System.out.println(i + ": " + branch.getCustomers().get(i).getName());
		}
	}
	
	public void displayCustomerTransactions(){
	
	}
	
	// PRIVATE METHODS
	
	
	// returns index
	private int searchBranch (Branch branch){
		return myBranches.indexOf(branch);
	}
	
	// Returns index
	private int searchBranch (String branchName){
		for (int i = 0; i < myBranches.size(); i++) {
			Branch branch = myBranches.get(i);
			if (branch.getName().equals(branchName)) {
				return i;
			}
		}
		return -1;
	}
	
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
