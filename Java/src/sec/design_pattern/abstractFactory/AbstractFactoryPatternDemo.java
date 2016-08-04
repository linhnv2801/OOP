/**
 * 
 */
package sec.design_pattern.abstractFactory;

/**
 * @author sev_user
 * 
 */
public class AbstractFactoryPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory shFactory = FactoryProducer.getFactory("shape");
		Shape shape1 = shFactory.getShape("circle");
		shape1.draw();
		AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
		Color color1 = colorFactory.getColor("green");
		if (color1 != null) {
			color1.fill();
		}else {
			System.out.println("color1 is null");
		}
		
	}

}
