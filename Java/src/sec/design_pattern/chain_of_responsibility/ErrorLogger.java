/**
 * 
 */
package sec.design_pattern.chain_of_responsibility;

/**
 * @author sev_user
 * 
 */
public class ErrorLogger extends AbstractLogger {

	/**
	 * 
	 */
	public ErrorLogger(int level) {
		// TODO Auto-generated constructor stub
		this.level = level;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * sec.design_pattern.chain_of_responsibility.AbstractLogger#write(java.
	 * lang.String)
	 */
	@Override
	protected void write(String message) {
		// TODO Auto-generated method stub
		System.out.println("Error Console::Logger " + message);
	}

}
