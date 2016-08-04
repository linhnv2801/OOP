/**
 * 
 */
package sec.design_pattern.decorator;

import sec.design_pattern.bridge.RedCircle;

/**
 * @author sev_user
 *
 */
public class DecoratorPatternDemo {

	/**
	 * 
	 */
	public DecoratorPatternDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle = new Circle();
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		Shape redCircle = new RedShapeDecorator(new Circle());
		
		System.out.println("Circle with normal border");
		circle.draw();
		
		System.out.println("\n circle of red border.");
		redCircle.draw();
		
		System.out.println("\n Rectangle of red border");
		redRectangle.draw();
	}

}
