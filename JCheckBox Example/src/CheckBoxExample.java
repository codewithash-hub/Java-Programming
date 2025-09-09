import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxExample {

	public static void main(String[] args) {
		JFrame frame = new JFrame("CheckBox Example");
		frame.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Select Languages");
		JCheckBox chk1 = new JCheckBox("Java");
		JCheckBox chk2 = new JCheckBox("Python");
		JCheckBox chk3 = new JCheckBox("C++");
		JButton button = new JButton("Submit");
		JLabel result = new JLabel("");
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				StringBuilder sb = new StringBuilder("You selected: ");
				if (chk1.isSelected())
					sb.append(chk1.getText());
				if (chk2.isSelected())
					sb.append(chk2.getText() + " ");
				if (chk3.isSelected())
					sb.append(chk3.getText() + " ");
				
				result.setText(sb.toString());
			}
		});
		
		frame.add(label);
		frame.add(chk1);
		frame.add(chk2);
		frame.add(chk3);
		frame.add(button);
		frame.add(result);
		
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
