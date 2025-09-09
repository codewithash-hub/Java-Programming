import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setLayout(new GridLayout(6, 2, 5, 5));

        JLabel label1 = new JLabel("First Number:");
        JTextField text1 = new JTextField();

        JLabel label2 = new JLabel("Second Number:");
        JTextField text2 = new JTextField();

        JLabel resultLabel = new JLabel("Result: ");
        JTextField resultField = new JTextField();
        resultField.setEditable(false); // user can't type here

        JButton addBtn = new JButton("+");
        JButton subBtn = new JButton("-");
        JButton mulBtn = new JButton("×");
        JButton divBtn = new JButton("÷");
        JButton clearBtn = new JButton("Clear");

        // Event Handling
        ActionListener calcListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(text1.getText());
                    double num2 = Double.parseDouble(text2.getText());
                    double result = 0;

                    if (e.getSource() == addBtn) result = num1 + num2;
                    else if (e.getSource() == subBtn) result = num1 - num2;
                    else if (e.getSource() == mulBtn) result = num1 * num2;
                    else if (e.getSource() == divBtn) {
                        if (num2 != 0) result = num1 / num2;
                        else {
                            JOptionPane.showMessageDialog(frame, "Cannot divide by zero!");
                            return;
                        }
                    }

                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers!");
                }
            }
        };

        // Attach listeners
        addBtn.addActionListener(calcListener);
        subBtn.addActionListener(calcListener);
        mulBtn.addActionListener(calcListener);
        divBtn.addActionListener(calcListener);

        clearBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1.setText("");
                text2.setText("");
                resultField.setText("");
            }
        });

        // Add components
        frame.add(label1);
        frame.add(text1);
        frame.add(label2);
        frame.add(text2);

        frame.add(addBtn);
        frame.add(subBtn);
        frame.add(mulBtn);
        frame.add(divBtn);

        frame.add(resultLabel);
        frame.add(resultField);

        frame.add(clearBtn);

        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
