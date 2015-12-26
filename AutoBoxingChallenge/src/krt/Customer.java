package krt;

import java.util.ArrayList;

public class Customer{
	
	
	private String name;
	private ArrayList<Double> transactions = new ArrayList<Double>();
	private static String noBranch = "No Branch";
	
	public Customer(String name) {
		this.name = name;
	}
	
	public Customer(String name, Double transaction) {
		this.name = name;
		transactions.add(transaction);
	}
	
	
	public String getName() {
		return name;
	}

	public ArrayList<Double> getTransactions() {
		return transactions;
	}
	
	
	
	
	
}
