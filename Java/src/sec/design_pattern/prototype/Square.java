/**
 * 
 */
package sec.design_pattern.prototype;

/**
 * @author sev_user
 * 
 */
public class Square extends Shape {

	/**
	 * 
	 */
	public Square() {
		super();
		// TODO Auto-generated constructor stub
		type = "Square";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sec.design_pattern.prototype.Shape#draw()
	 */
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Square::draw() method.");
	}

}
