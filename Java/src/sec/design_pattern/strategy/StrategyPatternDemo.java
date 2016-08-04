/**
 * 
 */
package sec.design_pattern.strategy;

/**
 * @author sev_user
 *
 */
public class StrategyPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.excuteStratey(10, 5));
		
		context = new Context(new OperationMultiply());
		System.out.println("10 * 5 = " + context.excuteStratey(10, 5));
	}

}
