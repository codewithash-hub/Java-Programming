package com.customer;

public class Customer {
	private int id;
	private double balanceOwned;
	
	public Customer(int id, double balanceOwned) {
		this.id = id;
		this.balanceOwned = balanceOwned;
	}
	
	public void display() {
		System.out.println("Customer #" + id + " balance $" + balanceOwned);
	}
}
