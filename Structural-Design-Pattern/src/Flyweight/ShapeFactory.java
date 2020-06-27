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
		circles.put(color, new Circle(color));
		return circles.get(color);
	}
}
