/**
 * 
 */
package sec.design_pattern.factory;

/**
 * @author sev_user
 * 
 */
public class FactoryPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shFactory = new ShapeFactory();

		Shape shape1 = shFactory.getShape("CiRcle");
		shape1.draw();

		Shape shape2 = shFactory.getShape("Rectangle");
		if (shape2 != null) {
			shape2.draw();
		}

		Shape shape3 = shFactory.getShape("Square");
		shape3.draw();
	}

}
