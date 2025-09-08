package com.frame;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {

		// JFrame = a GUI window to add components to.
		JFrame frame = new JFrame(); // creates a frame
		frame.setTitle("JFrame title goes here"); // sets title of a frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of the application
		frame.setResizable(false); // prevent frame from being resized
		frame.setSize(420, 420);
		frame.setVisible(true); // make frame visible
		
	}

}
