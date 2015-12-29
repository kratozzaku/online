package krt;

import java.util.ArrayList;

public class Customer{
	
	
	private String name;
	private ArrayList<Double> transactions = new ArrayList<Double>();
	
	
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
	
//	public boolean addTransaction(double transaction){
//		if(transactions.add(transaction)){
//			return true;
//		}
//	return false;
//	}
//	
	
	
	
}
