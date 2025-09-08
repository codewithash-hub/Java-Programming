import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Calculator");
		JLabel answer = new JLabel("");
		JLabel num1 = new JLabel("Num 1");
		JLabel num2 = new JLabel("Num 2");
		JButton btnCalc = new JButton("Calculate");
		JTextField txt1 = new JTextField(10);
		JTextField txt2 = new JTextField(10);
		
		frame.setSize(350, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLayout(new FlowLayout());
		
		frame.add(num1);
		frame.add(txt1);
		frame.add(num2);
		frame.add(txt2);
		frame.add(answer);
		frame.add(btnCalc);
		
		btnCalc.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String number1 = txt1.getText();
				String number2 = txt2.getText();
				
				String ans = number1 + " " + number2;
				
				answer.setText(ans);
				
				txt1.setText("");
				txt2.setText("");
			}
			
		});
	}

}
