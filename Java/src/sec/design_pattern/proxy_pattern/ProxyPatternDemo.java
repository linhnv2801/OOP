/**
 * 
 */
package sec.design_pattern.proxy_pattern;

/**
 * @author sev_user
 * 
 */
public class ProxyPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Image image = new ProxyImage("test.jpg");

		image.display();
		
		image.display();
	}

}
