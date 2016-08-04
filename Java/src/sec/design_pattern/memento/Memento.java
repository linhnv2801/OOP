/**
 * 
 */
package sec.design_pattern.memento;

/**
 * @author sev_user
 * 
 */
public class Memento {
	private String state;

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 */
	public Memento(String state) {
		super();
		this.state = state;
	}

}
