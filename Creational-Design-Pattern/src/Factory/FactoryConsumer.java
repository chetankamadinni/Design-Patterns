package Factory;

public class FactoryConsumer {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape square = shapeFactory.drawFactory(DrawType.SQUARE);
		square.draw();

		Shape triangle = shapeFactory.drawFactory(DrawType.TRIANGLE);
		triangle.draw();

	}
}
