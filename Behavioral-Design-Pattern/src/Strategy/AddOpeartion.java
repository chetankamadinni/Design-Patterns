package Strategy;

public class AddOpeartion implements Strategy {

	@Override
	public int doOperation(int a, int b) {
		return a + b;
	}

}
