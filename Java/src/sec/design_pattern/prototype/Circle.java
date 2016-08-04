/**
 * 
 */
package sec.design_pattern.prototype;

/**
 * @author sev_user
 * 
 */
public class Circle extends Shape {

	/**
	 * 
	 */
	public Circle() {
		// TODO Auto-generated constructor stub
		type = "Circle";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sec.design_pattern.prototype.Shape#draw()
	 */
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Circle::draw() method.");
	}

}
