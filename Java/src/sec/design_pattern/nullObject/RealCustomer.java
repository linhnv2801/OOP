/**
 * 
 */
package sec.design_pattern.nullObject;

/**
 * @author sev_user
 *
 */
public class RealCustomer extends AbstractCustomer {

	public RealCustomer(String name) {
		this.name = name;
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see sec.design_pattern.nullObject.AbstractCustomer#isNil()
	 */
	@Override
	public boolean isNil() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see sec.design_pattern.nullObject.AbstractCustomer#getname()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
