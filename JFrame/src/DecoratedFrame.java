import javax.swing.*;

public class DecoratedFrame {

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame aFrame = new JFrame("Decoarated Frame");
		
		aFrame.setSize(300, 350);
		aFrame.setVisible(true);
		aFrame.setResizable(false);
		
		aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
