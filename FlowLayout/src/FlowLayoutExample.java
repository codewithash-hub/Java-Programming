import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {

	public static void main(String[] args) {
		JFrame frame = new JFrame("FlowLayout Example");
		
		frame.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Enter your name:");
		JTextField textField = new JTextField(15);
		JButton button = new JButton("Submit");
		
		frame.add(label);
		frame.add(textField);
		frame.add(button);
		
		frame.setSize(300, 120);;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
