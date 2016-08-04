/**
 * 
 */
package sec.design_pattern.builder;

/**
 * @author sev_user
 *
 */
public class ChickenBurger extends Burger {

	/* (non-Javadoc)
	 * @see sec.design_pattern.builder.Item#name()
	 */
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Chicken burger";
	}

	/* (non-Javadoc)
	 * @see sec.design_pattern.builder.Burger#price()
	 */
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 50.5f;
	}

}
