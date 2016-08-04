/**
 * 
 */
package sec.design_pattern.nullObject;

/**
 * @author sev_user
 *
 */
public class NullCustomer extends AbstractCustomer {

	/* (non-Javadoc)
	 * @see sec.design_pattern.nullObject.AbstractCustomer#isNil()
	 */
	@Override
	public boolean isNil() {
		// TODO Auto-generated method stub
		return true;
	}

	/* (non-Javadoc)
	 * @see sec.design_pattern.nullObject.AbstractCustomer#getname()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Not available in Customer Database.";
	}

}
