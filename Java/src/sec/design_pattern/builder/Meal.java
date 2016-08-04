/**
 * 
 */
package sec.design_pattern.builder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author sev_user
 * 
 */
public class Meal {
	private List<Item> items = new ArrayList<Item>();

	public void addItem(Item item) {
		items.add(item);
	}

	public void removeItem(Item item) {
		for (Item tmp : items) {
			if (tmp == item) {
				items.remove(item);
				break;
			}
		}
	}

	public void showItems() {
		for (Item item : items) {
			System.out.print("Item : " + item.name());
			System.out.print(", Packing : " + item.packing().pack());
			System.out.println(", Price : " + item.price());
		}
	}

	public float getCost() {
		float cost = 0.0f;
		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}
}
