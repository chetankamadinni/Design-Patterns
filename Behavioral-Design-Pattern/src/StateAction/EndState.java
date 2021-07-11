package StateAction;

public class EndState implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("Player is at End State");
		context.setState(this);
	}

	@Override
	public String toString() {
		return "End state";
	}
}
