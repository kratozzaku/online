package krt;

import java.util.ArrayList;

public class Bank {
	
	private String name;
	private ArrayList<Branch> branches = new ArrayList<Branch>();

	public Bank(String name) {
		super();
		this.name = name;
		
		
	}
	
	// TODO Add new branch
	// TODO Add customer to branch with initial transaction
	// TODO Add transaction to existing customer
	// TODO Show list of customers for a particular branch and optionally show their transactions
	// TODO add validation check if exists
}
