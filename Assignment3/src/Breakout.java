import java.awt.Color;

import javax.swing.JFrame;

public class Breakout extends JFrame{
	
	static final long serialVersionUID = 1L;
	
	private BreakoutPanel panel;
	
	public Breakout() {
		// TODO: Set the size of the screen (use Settings.WINDOW_WIDTH/HEIGHT)DONE 28/01
		setSize(Settings.WINDOW_WIDTH,Settings.WINDOW_HEIGHT);
		// TODO: Set the title DONE 28/01
		setTitle(Settings.WINDOW_NAME);
		// TODO: Set the background colour to white DONE 28/01
		setBackground(Color.WHITE);
		// TODO: Set resizable to false DONE 28/01
		setResizable(false);
		// TODO: Set visible to true DONE 28/01
		//setVisible(true); moved to after add(panel)
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new BreakoutPanel(this);
        add(panel);
        setVisible(true);
	}
	public static void main(String[] args) {
		new Breakout();	
	}
}
