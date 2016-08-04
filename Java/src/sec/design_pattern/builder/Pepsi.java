/**
 * 
 */
package sec.design_pattern.builder;

/**
 * @author sev_user
 *
 */
public class Pepsi extends ColdDrink {

	/* (non-Javadoc)
	 * @see sec.design_pattern.builder.Item#name()
	 */
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Pepsi";
	}

	/* (non-Javadoc)
	 * @see sec.design_pattern.builder.ColdDrink#price()
	 */
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 35.0f;
	}

}
