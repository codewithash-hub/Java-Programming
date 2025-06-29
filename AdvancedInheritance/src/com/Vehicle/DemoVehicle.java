package com.Vehicle;

import javax.swing.*;

public class DemoVehicle {

	public static void main(String[] args) {
		Sailboat aBoat = new Sailboat();
		Bicycle aBike = new Bicycle();
		
		JOptionPane.showMessageDialog(null, "\nVehicle description:\n" + aBoat.toString() + "\n" + aBike.toString());

	}

}
