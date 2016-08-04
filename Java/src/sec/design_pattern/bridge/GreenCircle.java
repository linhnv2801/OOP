/**
 * 
 */
package sec.design_pattern.bridge;

/**
 * @author sev_user
 * 
 */
public class GreenCircle implements DrawAPI {

	/*
	 * (non-Javadoc)
	 * 
	 * @see sec.design_pattern.bridge.DrawAPI#drawCircle(int, int, int)
	 */
	@Override
	public void drawCircle(int radius, int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Drawing Circle[ color : green, radius : " + radius
				+ " , x : " + x + " , y :  " + y);
	}

}
