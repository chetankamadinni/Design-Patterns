package Strategy;

public class MultiplyOpeartion implements Strategy {

	@Override
	public int doOperation(int a, int b) {
		return a * b;
	}

}
