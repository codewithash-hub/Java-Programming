import javax.swing.*;
import java.awt.*;

public class ScrollableTextAreaExample {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Scrollable Text Area Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a text area
        JTextArea textArea = new JTextArea(10, 30);
        textArea.setLineWrap(true);        // wrap text at end of line
        textArea.setWrapStyleWord(true);   // wrap at word boundaries

        // Put text area inside scroll pane
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        // Add scroll pane to frame
        frame.add(scrollPane, BorderLayout.CENTER);

        // Make frame visible
        frame.setVisible(true);
    }
}
