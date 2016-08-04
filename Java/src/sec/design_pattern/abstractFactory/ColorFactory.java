/**
 * 
 */
package sec.design_pattern.abstractFactory;

/**
 * @author sev_user
 * 
 */
public class ColorFactory extends AbstractFactory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * sec.design_pattern.abstractFactory.AbstractFactory#getColor(java.lang
	 * .String)
	 */
	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("red")) {
			return new Red();
		}
		if (color.equalsIgnoreCase("green")) {
			return new Green();
		}
		if (color.equalsIgnoreCase("blue")) {
			return new Blue();
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * sec.design_pattern.abstractFactory.AbstractFactory#getShape(java.lang
	 * .String)
	 */
	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
