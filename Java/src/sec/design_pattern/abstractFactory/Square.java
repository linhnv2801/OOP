/**
 * 
 */
package sec.design_pattern.abstractFactory;

import sec.design_pattern.factory.Shape;

/**
 * @author sev_user
 *
 */
public class Square implements Shape {

	/* (non-Javadoc)
	 * @see sec.design_pattern.factory.Shape#draw()
	 */
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Square::draw() method.");
	}

}
