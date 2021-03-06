import java.awt.Graphics;

public class Paddle extends Sprite {

	private int xVelocity;
	
	public Paddle() {
		// TODO: Set width to Settings.PADDLE_WIDTH *** DONE 01/02/21
		setWidth(Settings.PADDLE_WIDTH);
		// TODO: Set width to Settings.PADDLE_HEIGHT *** DONE 01/02/21
		setHeight(Settings.PADDLE_HEIGHT); 
		// TODO: Call resetPosition *** DONE 01/02/21
		resetPosition();
	}
	public void resetPosition() {
		// TODO: Set initial position x and y (use INITIAL_PADDLE_X/Y)  **DONE 31/01/21
		x = Settings.INITIAL_PADDLE_X;
		y = Settings.INITIAL_PADDLE_Y;
	}
	public void update() {
		x += xVelocity;
		
		// TODO: Prevent the paddle from moving outside of the screen   **DONE 08/02/21
		// This can be done using two if statements (one for the left side of the screen and one for the right)
		if(x <=0) {
			setX(0);
		}
		if(x >= Settings.WINDOW_WIDTH - Settings.PADDLE_WIDTH) {
	 	setX(Settings.WINDOW_WIDTH - Settings.PADDLE_WIDTH);
	 	}
	}
	public void paint(Graphics g) {
		g.fillRect(x, y, Settings.PADDLE_WIDTH, Settings.PADDLE_HEIGHT);
	}
	public void setXVelocity(int vel) {
		// TODO: Set x velocity  **DONE 08/02/21 
		xVelocity = vel;
	}
}
