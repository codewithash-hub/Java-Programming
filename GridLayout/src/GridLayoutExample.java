import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {

	public static void main(String[] args) {
		JFrame frame = new JFrame("GridLayout Example");
		
		frame.setLayout(new GridLayout(3, 2, 0, 3));
		
		frame.add(new JLabel("First Name:"));
		frame.add(new JTextField(10));
		
		frame.add(new JLabel("Last Name:"));
		frame.add(new TextField(10));
		
		frame.add(new JLabel("Click Button"));
		frame.add(new JButton("Submit"));
		
		frame.setSize(350, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
