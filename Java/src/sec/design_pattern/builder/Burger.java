/**
 * 
 */
package sec.design_pattern.builder;

/**
 * @author sev_user
 *
 */
public abstract class Burger implements Item {

	/* (non-Javadoc)
	 * @see sec.design_pattern.builder.Item#packing()
	 */
	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

	/* (non-Javadoc)
	 * @see sec.design_pattern.builder.Item#price()
	 */
	@Override
	public abstract float price() ;

}
