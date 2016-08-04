/**
 * 
 */
package sec.design_pattern.strategy;

/**
 * @author sev_user
 * 
 */
public class OperationMultiply implements Strategy {

	/*
	 * (non-Javadoc)
	 * 
	 * @see sec.design_pattern.strategy.Strategy#doOperation(int, int)
	 */
	@Override
	public int doOperation(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

}
