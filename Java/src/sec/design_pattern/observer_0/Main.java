/**
 * 
 */
package sec.design_pattern.observer_0;

/**
 * @author sev_user
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cus1 = new Customer("Linh", 24);
		Customer cus2 = new Customer("Tan", 22);
		Customer cus3 = new Customer("Trang", 22);
		Product pro1 = new Product("Phone");
		pro1.attachObserver(cus1);
		pro1.attachObserver(cus2);
		pro1.attachObserver(cus3);
		pro1.notifyObserver();
	}

}
