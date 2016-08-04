/**
 * 
 */
package sec.design_pattern.builder;

/**
 * @author sev_user
 *
 */
public class VegBurger extends Burger {

	/* (non-Javadoc)
	 * @see sec.design_pattern.builder.Item#name()
	 */
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Veg burger";
	}

	/* (non-Javadoc)
	 * @see sec.design_pattern.builder.Burger#price()
	 */
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 25.0f;
	}

}
