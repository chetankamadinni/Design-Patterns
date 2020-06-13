package Factory;

public class ShapeFactory {

	public Shape drawFactory(DrawType drawType) {
		switch (drawType) {
		case TRIANGLE:
			return new Triangle();
		case SQUARE:
			return new Square();
		default:
			return null;
		}
	}
}
