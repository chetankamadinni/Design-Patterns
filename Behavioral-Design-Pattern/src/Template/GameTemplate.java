package Template;

public abstract class GameTemplate {

	public abstract void initialize();

	public abstract void startGame();

	public abstract void endGame();

	public final void play() {
		initialize();
		startGame();
		endGame();
	}
}
