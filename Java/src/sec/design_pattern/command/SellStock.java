/**
 * 
 */
package sec.design_pattern.command;

/**
 * @author sev_user
 * 
 */
public class SellStock implements Order {
	private Stock abcStock;

	/*
	 * (non-Javadoc)
	 * 
	 * @see sec.design_pattern.command.Order#execute()
	 */

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		abcStock.sell();
	}

	/**
	 * @param abcStock
	 */
	public SellStock(Stock abcStock) {
		super();
		this.abcStock = abcStock;
	}

}
