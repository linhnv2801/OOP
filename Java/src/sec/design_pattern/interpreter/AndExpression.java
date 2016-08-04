/**
 * 
 */
package sec.design_pattern.interpreter;

/**
 * @author sev_user
 * 
 */
public class AndExpression implements Expression {
	private Expression expression1 = null, expression2 = null;

	/**
	 * @param expression1
	 * @param expression2
	 */
	public AndExpression(Expression expression1, Expression expression2) {
		super();
		this.expression1 = expression1;
		this.expression2 = expression2;
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
		return expression1.interpret(context) && expression2.interpret(context);
	}

}
