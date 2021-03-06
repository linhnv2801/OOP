/**
 * 
 */
package sec.design_pattern.memento;

/**
 * @author sev_user
 * 
 */
public class MementoPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();

		originator.setState("State #1");
		originator.setState("State #2");
		careTaker.add(originator.saveStateToMemento());

		originator.setState("State #3");
		careTaker.add(originator.saveStateToMemento());

		originator.setState("State #4");
		System.out.println("Current state : " + originator.getState());

		originator.getStateFromMemento(careTaker.get(0));
		System.out.println("First saved state : " + originator.getState());

		originator.getStateFromMemento(careTaker.get(1));
		System.out.println("Second saved state : " + originator.getState());
	}

}
