import javax.swing.*;
import java.awt.FlowLayout;

public class JFrameWithComponets extends JFrame{
	JLabel label = new JLabel("Name?");
	JTextField field = new JTextField(12);
	JButton button = new JButton("OK");
	
	public JFrameWithComponets() {
		super("Frame with Components");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.add(label);
		this.add(field);
		this.add(button);
	}
}
