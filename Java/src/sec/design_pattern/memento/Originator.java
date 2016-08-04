/**
 * 
 */
package sec.design_pattern.memento;

/**
 * @author sev_user
 * 
 */
public class Originator {
	private String state;

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	public Memento saveStateToMemento() {
		return new Memento(state);
	}

	public void getStateFromMemento(Memento memento) {
		state = memento.getState();
	}

}
