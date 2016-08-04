/**
 * 
 */
package sec.design_pattern.bridge;

/**
 * @author sev_user
 * 
 */
public abstract class Shape {
	protected DrawAPI drawAPI;

	protected Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}

	public abstract void draw();
}
