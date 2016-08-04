/**
 * 
 */
package sec.design_pattern.mediator;

/**
 * @author sev_user
 * 
 */
public class User {
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param name
	 */
	public User(String name) {
		super();
		this.name = name;
	}

	public void sendMessage(String message) {
		ChatRoom.showMessage(this, message);
	}
}
