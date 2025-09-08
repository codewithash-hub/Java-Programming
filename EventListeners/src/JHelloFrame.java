import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JHelloFrame extends JFrame implements ActionListener{
	JLabel question = new JLabel("What is your name?");
	Font bigFont = new Font("Arial", Font.BOLD, 16);
	JTextField answer = new JTextField(10);
	JButton pressMe = new JButton("Press Me");
	JLabel greeting = new JLabel("");
	
	final int WIDTH = 275;
	final int HEIGHT = 225;
	
	public JHelloFrame() {
		super("Hello Frame");
		this.setSize(WIDTH, HEIGHT);
		this.setLayout(new FlowLayout());
		
		question.setFont(bigFont);
		greeting.setFont(bigFont);
		
		this.add(question);
		this.add(answer);
		this.add(pressMe);
		this.add(greeting);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pressMe.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = answer.getText();
		String greet = "Hello, " + name;
		greeting.setText(greet);
		answer.setText("");
	}
}
