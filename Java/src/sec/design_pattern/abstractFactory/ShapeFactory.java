/**
 * 
 */
package sec.design_pattern.abstractFactory;

/**
 * @author sev_user
 *
 */
public class ShapeFactory extends AbstractFactory {

	/* (non-Javadoc)
	 * @see sec.design_pattern.abstractFactory.AbstractFactory#getColor(java.lang.String)
	 */
	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see sec.design_pattern.abstractFactory.AbstractFactory#getShape(java.lang.String)
	 */
	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		if (shape == null) {
			return null;
		}
		if (shape.equalsIgnoreCase("Circle")) {
			return new Circle();
		}
		if (shape.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}
		return null;
	}

}
