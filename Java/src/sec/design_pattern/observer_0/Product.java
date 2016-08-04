/**
 * 
 */
package sec.design_pattern.observer_0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author sev_user
 *
 */
public class Product implements Subject {
	private List<Observer> obs = new ArrayList<Observer>();
	private String nameProduct;

	public Product(String nameProduct) {
		super();
		this.nameProduct = nameProduct;
	}

	/* (non-Javadoc)
	 * @see sec.observer.Subject#attachObserver(sec.observer.Observer)
	 */
	@Override
	public void attachObserver(Observer observer) {
		// TODO Auto-generated method stub
		obs.add(observer);
	}

	/* (non-Javadoc)
	 * @see sec.observer.Subject#detachObserver(sec.observer.Observer)
	 */
	@Override
	public void detachObserver(Observer observer) {
		// TODO Auto-generated method stub
		obs.remove(observer);
	}

	/* (non-Javadoc)
	 * @see sec.observer.Subject#notifyObserver()
	 */
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Observer ob : obs){
			ob.update(nameProduct);
		}
	}

}
