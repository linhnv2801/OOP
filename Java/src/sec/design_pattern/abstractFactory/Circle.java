/**
 * 
 */
package sec.design_pattern.abstractFactory;

import sec.design_pattern.factory.Shape;

/**
 * @author sev_user
 *
 */
public class Circle implements sec.design_pattern.abstractFactory.Shape {

	/* (non-Javadoc)
	 * @see sec.design_pattern.factory.Shape#draw()
	 */
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Circle::draw() method.");
	}

}
