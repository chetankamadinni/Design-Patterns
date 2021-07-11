package Strategy;

public class SubtractOpeartion implements Strategy {

	@Override
	public int doOperation(int a, int b) {
		return a - b;
	}

}
