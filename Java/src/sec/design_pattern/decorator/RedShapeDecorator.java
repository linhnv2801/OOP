/**
 * 
 */
package sec.design_pattern.decorator;

/**
 * @author sev_user
 * 
 */
public class RedShapeDecorator extends ShapeDecorator {

	/**
	 * @param decoratedShape
	 */
	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}

	private void setRedBorder(Shape decoratedShape) {
		System.out.println("Border Color : Red");
	}
}
