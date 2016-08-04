/**
 * 
 */
package sec.design_pattern.command;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

;
/**
 * @author sev_user
 * 
 */
public class Broker {
	private List<Order> orderList = new ArrayList<Order>();

	public void takeOrder(Order order) {
		orderList.add(order);
	}

	public void placeOrders() {
		for (Order order : orderList) {
			order.execute();
		}
	}
}
