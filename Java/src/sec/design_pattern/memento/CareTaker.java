/**
 * 
 */
package sec.design_pattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sev_user
 * 
 */
public class CareTaker {
	private List<Memento> memontoList = new ArrayList<Memento>();

	public void add(Memento state) {
		memontoList.add(state);
	}

	public Memento get(int index) {
		return memontoList.get(index);
	}
}
