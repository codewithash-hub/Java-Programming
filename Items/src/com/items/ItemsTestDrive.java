package com.items;

public class ItemsTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Items phone = new Items();
		Items pie = new Items();
		
		phone.setName("iPhone");
		phone.setQuantity(40);
		System.out.println(phone.getName());
		System.out.println(phone.getQuantity());
		
		pie.setName("Cheese Burger pie");
		pie.setQuantity(14);
		System.out.println(pie.getName());
		System.out.println(pie.getQuantity());
		
	}

}
