package Flyweight;

public class FlyweightDemo {

	static String[] colors = { "Red", "Green", "Yellow", "Blue" };

	public static void main(String[] args) {

		for (int i = 0; i < 20; i++) {
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
			circle.draw();
		}

	}

	private static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

}
