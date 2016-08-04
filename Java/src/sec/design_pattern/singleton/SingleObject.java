/**
 * 
 */
package sec.design_pattern.singleton;

/**
 * @author sev_user
 *
 */
public class SingleObject {
	private static SingleObject instance = new SingleObject();
	
	private SingleObject(){}
	
	public static SingleObject getInstance(){
		return instance;
	}
	
	public void showMessage(){
		System.out.println("Hello, I'm from singleton design pattern!");
	}
}
