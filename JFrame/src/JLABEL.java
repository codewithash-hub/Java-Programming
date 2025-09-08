import java.awt.Font;
import java.awt.*;
import javax.swing.*;

public class JLABEL {

	public static void main(String[] args) {
		final int FRAME_WIDTH = 250;
		final int FRAME_HEIGHT = 100;
		
		// instantiate the objects
		Font headlineFont = new Font("Arial", Font.BOLD, 36);
		JFrame aFrame = new JFrame("Third Frame");
		JLabel greeting = new JLabel("Good day.");
		
		// set frame properties
		aFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		aFrame.setVisible(true);
		aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// set the font to a label "greeting"
		greeting.setFont(headlineFont);
		
		// change a text from a label greeting
		greeting.setText("Howdy");
		
		// Add a label to a frame
		aFrame.add(greeting);

	}

}
