import javax.swing.*;

public class JMyFrame extends JFrame{
	final int WIDTH = 300;
	final int HEIGHT = 120;
	
	public JMyFrame() {
		super("My frame");
		this.setSize(WIDTH, HEIGHT);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


}
