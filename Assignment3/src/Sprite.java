import java.awt.Rectangle;

public class Sprite {
	
	protected int x,y,width,height;
	
	// Note: This should only set a single value, they can be done in a single statement 
	public int setX(int x) {
		return this.x = x;
	}
		// TODO  **Done 03/02/21
	public int setY(int y) {
		return this.y = y; 
		// TODO **Done 03/02/21
	}
	public void setWidth(int width) { 
		// TODO
		this.width = width;
	}
	public void setHeight(int height) { 
		// TODO
		this.height = height;
	}
	
	// Note: Change the "0" to the correct variable
	public int getX() { 
		return x;	// TODO: Return correct value ** DONE 04/02/21
	}
	public int getY() { 
		return y;	// TODO: Return correct value ** DONE 04/02/21
	}
	public int getWidth() { 
		return width;	// TODO: Return correct value ** DONE 04/02/21
	}
	public int getHeight() { 
		return height;	// TODO: Return correct value ** DONE 04/02/21
	}
	
	Rectangle getRectangle() {
		return new Rectangle(x, y, width, height);
	}
}
