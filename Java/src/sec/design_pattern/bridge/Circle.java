/**
 * 
 */
package sec.design_pattern.bridge;

/**
 * @author sev_user
 * 
 */
public class Circle extends Shape {
	private int x, y, radius;

	/**
	 * @param drawAPI
	 * @param x
	 * @param y
	 * @param radius
	 */
	public Circle(DrawAPI drawAPI, int x, int y, int radius) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sec.design_pattern.bridge.Shape#draw()
	 */
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		drawAPI.drawCircle(radius, x, y);
	}

}
