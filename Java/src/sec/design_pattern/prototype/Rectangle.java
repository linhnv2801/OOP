/**
 * 
 */
package sec.design_pattern.prototype;

/**
 * @author sev_user
 * 
 */
public class Rectangle extends Shape {

	/*
	 * (non-Javadoc)
	 * 
	 * @see sec.design_pattern.prototype.Shape#draw()
	 */
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Rectangle::draw() medthod.");
	}

	/**
	 * 
	 */
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
		type = "Rectangle";
	}

}
