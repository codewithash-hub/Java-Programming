package com.customer;

public class PreferedCustomer extends Customer{
	private double discountRate;
	
	public PreferedCustomer(int id, double balanceOwned, double discountRate) {
		super(id, balanceOwned);
		this.discountRate = discountRate;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Discount rate is " + discountRate);
	}
}
