package Decorator;

public class DecoratorDemo {

	public static void main(String[] args) {
		Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
		String make = sandwich.make();
		System.out.println(make);

	}

}
