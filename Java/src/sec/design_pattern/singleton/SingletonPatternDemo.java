/**
 * 
 */
package sec.design_pattern.singleton;

/**
 * @author sev_user
 * 
 */
public class SingletonPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// illegal construct
		// Compile Time Error: The constructor SingleObject() is not visible
		// SingleObject object = new SingleObject();
		SingleObject object = SingleObject.getInstance();
		object.showMessage();
	}

}
