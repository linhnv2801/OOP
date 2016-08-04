/**
 * 
 */
package sec.design_pattern.prototype;

import java.util.Hashtable;

/**
 * @author sev_user
 * 
 */
public class ShapeCache {
	private static Hashtable<String, Shape> shHashtable = new Hashtable<String, Shape>();

	public static Shape getShape(String shapeId) {
		Shape cachedShape = shHashtable.get(shapeId);
		return (Shape) cachedShape.clone();
	}

	/**
	 * 
	 */
	public ShapeCache() {
		// TODO Auto-generated constructor stub
	}

	public static void loadCache() {
		Circle circle = new Circle();
		circle.setId("1");
		shHashtable.put(circle.getId(), circle);

		Square square = new Square();
		square.setId("2");
		shHashtable.put(square.getId(), square);

		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shHashtable.put(rectangle.getId(), rectangle);
	}

}
