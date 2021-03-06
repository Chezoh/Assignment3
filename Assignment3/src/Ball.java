import java.awt.Graphics;

public class Ball extends Sprite {

	private int xVelocity = 1, yVelocity = -1;

	// Constructor
	public Ball() {
		// TODO: Set width to Settings.BALL_WIDTH ** DONE 28/01
		setWidth(Settings.BALL_WIDTH);
		// TODO: Set width to Settings.BALL_HEIGHT  ** DONE 28/01
		setHeight(Settings.BALL_HEIGHT);
		// TODO: Call resetPosition ** DONE 28/01
		resetPosition();
	}
	/**
	 * Resets the ball to the initial position
	 * Uses Settings.INITIAL_BALL_X/Y to set the position of the ball
	 */
	public void resetPosition() {
		x = Settings.INITIAL_BALL_X;
		// TODO: Set the balls y by using the INITIAL_BALL_Y (see above) ** DONE 28/01
		y = Settings.INITIAL_BALL_Y;
	}
	public void update() {
		x += xVelocity;
		// TODO: Increase the y variable by yVelocity (see above) ** DONE 28/01
		y += yVelocity;

		// Bounce off left side of screen
		if(x <= 0) {
			// TODO: Set x to 0 so it does not leave the screen **DONE 28/01
			x = 0;
			// TODO: Change the x velocity to make the ball go right **DONE 28/01
			setXVelocity(1);
		}
		// Bounce off right side of screen
		if(x >= Settings.WINDOW_WIDTH - Settings.BALL_WIDTH) {
			// TODO: Set x to the right edge of the screen (see the above if condition) **DONE 28/01
			setX(Settings.WINDOW_WIDTH - Settings.BALL_WIDTH);
			// TODO: Change the x velocity to make the ball go left ** DONE 02/02/21
			setXVelocity(-1);
		}
		// Bounce off top of screen
		if(y <= 0) {
			// TODO: Set y to 0 so it does not leave the screen **DONE 28/01
			y = 0;
			// TODO: Change the y velocity to make the ball go downward **DONE 28/01
			setYVelocity(1);
		}
	}
	public void setXVelocity(int x) {
		// TODO: Set the x velocity  **DONE 31/01/21
		xVelocity = x;
	}
	public void setYVelocity(int y) {
		// TODO: Set the y velocity ** Done 31/01/21
		yVelocity = y;
	}
	public int getXVelocity() {
		return xVelocity;	// TODO: Return the x velocity  **Done 01/02/21
	}
	public int getYVelocity() {
		return yVelocity;	// TODO: Return the y velocity  **DONE 01/02/21
	}
	public void paint(Graphics g) {
		g.fillOval(x, y, Settings.BALL_WIDTH, Settings.BALL_HEIGHT);
	}
}
