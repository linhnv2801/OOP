/**
 * 
 */
package sec.design_pattern.decorator;

/**
 * @author sev_user
 * 
 */
public abstract class ShapeDecorator implements Shape {
	protected Shape decoratedShape;

	/**
	 * @param decoratedShape
	 */
	public ShapeDecorator(Shape decoratedShape) {
		super();
		this.decoratedShape = decoratedShape;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sec.design_pattern.decorator.Shape#draw()
	 */
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		decoratedShape.draw();
	}

}
