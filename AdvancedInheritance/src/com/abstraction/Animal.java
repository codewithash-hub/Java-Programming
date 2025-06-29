package com.abstraction;

public abstract class Animal {
	private String name;
	
	// Abstract method declaration
	public abstract void speak();
	
	// concrete or non-abstract getter and setter methods
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
