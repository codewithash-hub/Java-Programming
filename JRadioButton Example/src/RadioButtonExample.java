import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("RadioButton Example");
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Choose Gender:");
        JRadioButton rb1 = new JRadioButton("Male");
        JRadioButton rb2 = new JRadioButton("Female");
        JRadioButton rb3 = new JRadioButton("Other");
        JButton button = new JButton("Submit");
        JLabel result = new JLabel("");

        // Group radio buttons (only one can be selected)
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (rb1.isSelected()) result.setText("You selected: Male");
                else if (rb2.isSelected()) result.setText("You selected: Female");
                else if (rb3.isSelected()) result.setText("You selected: Other");
                else result.setText("No option selected");
            }
        });

        frame.add(label);
        frame.add(rb1);
        frame.add(rb2);
        frame.add(rb3);
        frame.add(button);
        frame.add(result);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
