import javax.swing.*;
import java.awt.*;

public class PanelExample {

	public static void main(String[] args) {
		JFrame frame = new JFrame("JPanel Example");
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setBackground(Color.LIGHT_GRAY);
		
		JLabel label = new JLabel("Username");
		JTextField textField = new JTextField(15);
		
		JLabel label2 = new JLabel("Password");
		JTextField textField2 = new JTextField(15);
		
		JButton button = new JButton("Login");
		
		// I add all the components to the panel, 
		panel.add(label);
		panel.add(textField);
		panel.add(label2);
		panel.add(textField2);
		panel.add(button);
		
		frame.add(panel); // and add the panel to the frame
		
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		

	}

}
