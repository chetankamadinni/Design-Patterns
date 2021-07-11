package Strategy;

public class Context {

	private Strategy strategy;

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public int executeStartegy(int a, int b) {
		return this.strategy.doOperation(a, b);
	}
}
