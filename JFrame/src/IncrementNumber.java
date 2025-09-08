import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IncrementNumber {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Increment");
		
		frame.setSize(350, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("0");
		label.setFont(new Font("Arial", Font.BOLD, 16));
		
		JButton btn = new JButton("Increment");
		
		frame.add(label);
		frame.add(btn);
		
		frame.setVisible(true);
		
		// counter stored in an array so it can be modified inside the listener
		final int[] num = {0};
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				num[0]++; // increment counter
				label.setText(String.valueOf(num[0])); // update label
			}
			
		});
		
	}

}
