import javax.swing.*;
import java.awt.*;

public class JFrameWithManyComponents extends JFrame {
	final int WIDTH = 300;
	final int HEIGHT = 150;
	
	public JFrameWithManyComponents() {
		super("Demostrating many components");
		
		this.setSize(WIDTH, HEIGHT);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel heading = new JLabel("This frame has many components");
		heading.setFont(new Font("Arial", Font.BOLD, 16));
		
		JLabel namePrompt = new JLabel("Enter your name:");
		
		JTextField nameField = new JTextField(12);
		
		JButton button = new JButton("Click to continue");
		
		this.setLayout(new FlowLayout());
		this.add(heading);
		this.add(namePrompt);
		this.add(nameField);
		this.add(button);
	}
}
