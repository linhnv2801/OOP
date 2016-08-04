/**
 * 
 */
package sec.design_pattern.interpreter;

/**
 * @author sev_user
 * 
 */
public class TerminalExpression implements Expression {
	private String data;

	/**
	 * @param data
	 */
	public TerminalExpression(String data) {
		super();
		this.data = data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * sec.design_pattern.interpreter.Expression#interpret(java.lang.String)
	 */
	@Override
	public boolean interpret(String context) {
		// TODO Auto-generated method stub
		if (context.contains(data)) {
			return true;
		}
		return false;
	}

}
