package krt;

import java.util.ArrayList;

public class Branch {
	
	
	private String name;
	private ArrayList<Customer> customers = new ArrayList<Customer>();
	
	public Branch(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	public ArrayList<Customer> getCustomers() {
		return this.customers;
	}
	
	public boolean addCustomerToBranch (Customer customer){
		return customers.add(customer);
	}
	

	
}
