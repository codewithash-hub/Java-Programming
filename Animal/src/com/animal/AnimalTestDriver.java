package com.animal;

public class AnimalTestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cat = new Animal("Andy", 4, "Cat");
		Animal dog = new Animal("Snoopy", 8, "Dog");
		
		System.out.println(cat.name);
		System.out.println(cat.age);
		System.out.println(cat.type);
		cat.makeSound();
		
		System.out.println(dog.name);
		System.out.println(dog.age);
		dog.makeSound();
		
		
	}

}
