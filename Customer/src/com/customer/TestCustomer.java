package com.customer;

public class TestCustomer {

	public static void main(String[] args) {
		Customer oneCust = new Customer(124, 123.45);
		PreferedCustomer onePCust = new PreferedCustomer(125, 3456.78, 0.15);
		
		oneCust.display();
		onePCust.display();

	}

}
