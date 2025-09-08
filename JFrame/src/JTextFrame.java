import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.*;

public class JTextFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Text Field");
		
		frame.setSize(305, 250);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setResizable(false);
		
		JTextField response = new JTextField(10);
		response.setFont(new Font("Arial", Font.ITALIC, 24));
		
		JButton btn = new JButton("Click");
		
		frame.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Arial", Font.ITALIC, 24));
		
		frame.add(response);
		frame.add(btn);
		frame.add(label);
		
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				// action performed
//				JOptionPane.showMessageDialog(label, "Welcome " + response.getText(), "Greetings", JOptionPane.INFORMATION_MESSAGE);
				label.setText(response.getText());
				response.setText("");
			}
		});
	}

}
