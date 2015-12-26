package krt;

import java.util.ArrayList;

public class Customer {
	private String name;
	private ArrayList<Double> transactions = new ArrayList<Double>();
	
	public Customer(String name, ArrayList<Double> transactions) {
		super();
		this.name = name;
		this.transactions = transactions;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Double> getTransactions() {
		return transactions;
	}
	
	
	
}
