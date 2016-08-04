/**
 * 
 */
package sec.design_pattern.mediator;

/**
 * @author sev_user
 * 
 */
public class MediatorPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User robert = new User("Robert");
		User john = new User("John");

		robert.sendMessage("Hi! John!");
		john.sendMessage("Hello! Robert!");

	}

}
