package com.animal;

public class Animal {
	String name;
	int age;
	String type;
	
	public Animal(String name, int age, String type) {
		this.name = name;
		this.age = age;
		this.type = type;
	}
	
	public void makeSound() {
		System.out.println(name + " is making a sound!!!");
	}
}
