package com.Vehicle;

public abstract class Vehicle {
	
	private String powerSource;
	private int wheels;
	protected double price;
	
	public Vehicle(String powerSource, int wheels) {
		setPowerSource(powerSource);
		setWheels(wheels);
		setPrice();
	}
	
	public String getPowerSorce() {
		return powerSource;
	}
	
	public int getWheels() {
		return wheels;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPowerSource(String powerSource) {
		this.powerSource = powerSource;
	}
	
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	public abstract void setPrice();
}
