import javax.swing.*;
import javax.swing.text.DefaultCaret;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A simple Swing application that:
 * - uses GridLayout and FlowLayout
 * - collects user input (name, age, membership checkbox, gender radio)
 * - has buttons with ActionListeners to "Add" and "Clear"
 * - displays entries in a scrollable JTextArea
 */
public class SwingDataEntryDemo {

    private JFrame frame;
    private JTextField nameField;
    private JTextField ageField;
    private JCheckBox memberCheck;
    private JRadioButton maleRb, femaleRb, otherRb;
    private JTextArea outputArea;

    public SwingDataEntryDemo() {
        createAndShowGui();
    }

    private void createAndShowGui() {
        frame = new JFrame("Swing Data Entry Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);

        // Top panel: input fields laid out in a grid
        JPanel inputPanel = new JPanel(new GridLayout(4, 2, 6, 6));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Age:"));
        ageField = new JTextField();
        inputPanel.add(ageField);

        inputPanel.add(new JLabel("Member:"));
        memberCheck = new JCheckBox("Is a member?");
        inputPanel.add(memberCheck);

        inputPanel.add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        maleRb = new JRadioButton("Male");
        femaleRb = new JRadioButton("Female");
        otherRb = new JRadioButton("Other");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRb);
        genderGroup.add(femaleRb);
        genderGroup.add(otherRb);
        genderPanel.add(maleRb);
        genderPanel.add(femaleRb);
        genderPanel.add(otherRb);
        inputPanel.add(genderPanel);

        // Buttons panel
        JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        JButton addButton = new JButton("Add Entry");
        JButton clearButton = new JButton("Clear Form");
        JButton exportButton = new JButton("Clear Output");
        buttonsPanel.add(addButton);
        buttonsPanel.add(clearButton);
        buttonsPanel.add(exportButton);

        // Output area within a scroll pane
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        outputArea.setLineWrap(true);
        outputArea.setWrapStyleWord(true);

        // auto-scroll to bottom on append
        DefaultCaret caret = (DefaultCaret) outputArea.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);

        JScrollPane scrollPane = new JScrollPane(outputArea,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Entries"));

        // Add action listeners
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addEntry();
            }
        });

        clearButton.addActionListener(e -> clearForm());

        exportButton.addActionListener(e -> outputArea.setText(""));

        // Layout the frame
        frame.setLayout(new BorderLayout(8, 8));
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(buttonsPanel, BorderLayout.CENTER);
        frame.add(scrollPane, BorderLayout.SOUTH);

        // Make the output area taller by setting a preferred size for the scroll pane
        scrollPane.setPreferredSize(new Dimension(580, 180));

        frame.pack();
        frame.setVisible(true);
    }

    private void addEntry() {
        String name = nameField.getText().trim();
        String ageText = ageField.getText().trim();

        // Basic validation + friendly error message in a dialog
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please enter a name.", "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int age = -1;
        if (!ageText.isEmpty()) {
            try {
                age = Integer.parseInt(ageText);
                if (age < 0) throw new NumberFormatException();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid non-negative integer for age.", "Validation", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }

        String gender = "Unspecified";
        if (maleRb.isSelected()) gender = "Male";
        else if (femaleRb.isSelected()) gender = "Female";
        else if (otherRb.isSelected()) gender = "Other";

        boolean isMember = memberCheck.isSelected();

        // Format and append to the output area
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name)
          .append(" | Age: ").append(age >= 0 ? age : "N/A")
          .append(" | Gender: ").append(gender)
          .append(" | Member: ").append(isMember ? "Yes" : "No")
          .append("\n");

        outputArea.append(sb.toString());

        // Optional: reset the form after adding
        clearFormFieldsOnly();
    }

    private void clearForm() {
        clearFormFieldsOnly();
        outputArea.setText("");
    }

    private void clearFormFieldsOnly() {
        nameField.setText("");
        ageField.setText("");
        memberCheck.setSelected(false);
        maleRb.setSelected(false);
        femaleRb.setSelected(false);
        otherRb.setSelected(false);
    }

    public static void main(String[] args) {
        // Ensure UI is created on Event Dispatch Thread
        SwingUtilities.invokeLater(SwingDataEntryDemo::new);
    }
}
