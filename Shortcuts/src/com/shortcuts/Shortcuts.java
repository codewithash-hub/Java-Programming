package com.shortcuts;

public class Shortcuts {

	private String firstname;
	private String surname;
	private int age;

	public Shortcuts(String name, String surname, int age) {
		super();
		this.firstname = name;
		this.surname = surname;
		this.age = age;
	}

	public String getName() {
		return firstname;
	}

	public void setName(String name) {
		this.firstname = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
