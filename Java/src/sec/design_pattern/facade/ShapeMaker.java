/**
 * 
 */
package sec.design_pattern.facade;

/**
 * @author sev_user
 * 
 */
public class ShapeMaker {
	private Shape circle, rectange, square;

	/**
	 * 
	 */
	public ShapeMaker() {
		super();
		circle = new Circle();
		rectange = new Rectangle();
		square = new Square();
	}

	public void drawCircle() {
		circle.draw();
	}

	public void drawRectangle() {
		rectange.draw();
	}

	public void drawSquare() {
		square.draw();
	}

}
