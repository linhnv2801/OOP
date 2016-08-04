package sec.design_pattern.strategy;

public class Context {
	private Strategy strategy;

	/**
	 * @param strategy
	 */
	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public int excuteStratey(int num1, int num2){
		return strategy.doOperation(num1, num2);
	}
}
