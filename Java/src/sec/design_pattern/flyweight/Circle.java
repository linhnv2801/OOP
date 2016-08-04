/**
 * 
 */
package sec.design_pattern.flyweight;

/**
 * @author sev_user
 * 
 */
public class Circle implements Shape {
	private String color;
	private int x, y, radius;

	/**
	 * @param color
	 */
	public Circle(String color) {
		super();
		this.color = color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sec.design_pattern.flyweight.Shape#draw()
	 */
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle: Draw() [Color : " + color + " , x : " + x
				+ " , y : " + y + " , radius : " + radius);
	}

}
