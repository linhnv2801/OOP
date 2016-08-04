/**
 * 
 */
package sec.design_pattern.observer_0;

/**
 * @author sev_user
 *
 */
public interface Subject {
	public void attachObserver(Observer observer);
	public void detachObserver(Observer observer);
	public void notifyObserver();
}
