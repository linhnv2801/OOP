/**
 * 
 */
package sec.design_pattern.builder;

/**
 * @author sev_user
 *
 */
public class Coke extends ColdDrink {

	/* (non-Javadoc)
	 * @see sec.design_pattern.builder.Item#name()
	 */
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Coke";
	}

	/* (non-Javadoc)
	 * @see sec.design_pattern.builder.ColdDrink#price()
	 */
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 30.3f;
	}

}
