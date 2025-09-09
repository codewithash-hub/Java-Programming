import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonEventExample {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Button Event Example");
		frame.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Rnter Name:");
		JTextField textField = new JTextField(15);
		JButton button = new JButton("Click Me");
		JLabel result = new JLabel("");
		
		// Event handling for button
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				result.setText("Hello, " + name + "!");
			}
		});
		
		frame.add(label);
		frame.add(textField);
		frame.add(button);
		frame.add(result);
		
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
