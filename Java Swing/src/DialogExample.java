import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DialogExample extends JFrame {
    public DialogExample() {
        // Set frame properties
        setTitle("Dialog & OptionPane Demo");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create buttons
        JButton msgButton = new JButton("Show Message");
        JButton inputButton = new JButton("Ask for Input");
        JButton confirmButton = new JButton("Show Confirm");
        JButton optionButton = new JButton("Show Options");

        // Add action listeners
        msgButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello! This is a Message Dialog.");
            }
        });

        inputButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog(null, "Enter your name:");
                if (name != null) {
                    JOptionPane.showMessageDialog(null, "Welcome, " + name + "!");
                }
            }
        });

        confirmButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int choice = JOptionPane.showConfirmDialog(null, "Do you want to continue?");
                if (choice == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "You chose YES.");
                } else if (choice == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "You chose NO.");
                } else {
                    JOptionPane.showMessageDialog(null, "You cancelled.");
                }
            }
        });

        optionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] options = {"Add", "Subtract", "Exit"};
                int choice = JOptionPane.showOptionDialog(
                        null,
                        "Choose an operation:",
                        "Math Options",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        options,
                        options[0]
                );

                if (choice >= 0) {
                    JOptionPane.showMessageDialog(null, "You selected: " + options[choice]);
                }
            }
        });

        // Add buttons to frame
        add(msgButton);
        add(inputButton);
        add(confirmButton);
        add(optionButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        new DialogExample();
    }
}
