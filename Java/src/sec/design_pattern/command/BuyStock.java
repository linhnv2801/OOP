/**
 * 
 */
package sec.design_pattern.command;

/**
 * @author sev_user
 * 
 */
public class BuyStock implements Order {
	private Stock abcStock;

	/**
	 * 
	 */
	public BuyStock() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param abcStock
	 */
	public BuyStock(Stock abcStock) {
		super();
		this.abcStock = abcStock;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		abcStock.buy();
	}

}
