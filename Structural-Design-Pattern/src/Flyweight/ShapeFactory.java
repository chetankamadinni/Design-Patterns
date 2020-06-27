package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

	private static final Map<String, Shape> circles = new HashMap<>();

	public static Shape getCircle(String color) {
		if (circles.containsKey(color)) {
			return circles.get(color);
		}
		System.out.println("Creating new Circle with color : " + color);
		Circle circle = new Circle(color);
		circles.put(color, circle);
		return circle;
	}
}
