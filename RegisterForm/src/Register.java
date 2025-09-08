import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowEvent;



public class Register {

	public static void main(String[] args) {
		JFrame myFirstFrame = new JFrame("Register");
		myFirstFrame.setSize(600, 300);
		
		myFirstFrame.setVisible(true);
		myFirstFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout gl = new GridLayout(2, 0);
		myFirstFrame.setLayout(gl);
		
		JLabel firstLabel = new JLabel("Name");
		JTextField myName = new JTextField(20);
		JButton btnSignin = new JButton("Sign In");
		
		JPanel panelOne = new JPanel();
		panelOne.add(firstLabel);
		panelOne.add(myName);
		
		JPanel paneltwo = new JPanel();
		paneltwo.add(btnSignin);
		
		myFirstFrame.add(panelOne, 0);
		myFirstFrame.add(paneltwo, 1);
		
		// handle the button event
//		btnSignin.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent ae) {
//				// action performed
//				JOptionPane.showMessageDialog(myFirstFrame, "Welcome " + myName.getText(), "Greetings", JOptionPane.INFORMATION_MESSAGE);
//			}
//		});
		
		btnSignin.addActionListener(e -> {
			JOptionPane.showMessageDialog(myFirstFrame, "Welcome " + myName.getText(), "Greetings", JOptionPane.INFORMATION_MESSAGE);
		});
		
	}

}