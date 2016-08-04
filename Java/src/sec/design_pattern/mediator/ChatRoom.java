/**
 * 
 */
package sec.design_pattern.mediator;

import java.util.Date;

/**
 * @author sev_user
 * 
 */
public class ChatRoom {
	public static void showMessage(User user, String message) {
		System.out.println(new Date().toString() + " [" + user.getName()
				+ "] : " + message);
	}
}
