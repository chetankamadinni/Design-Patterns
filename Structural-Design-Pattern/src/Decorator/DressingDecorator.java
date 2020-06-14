package Decorator;

public class DressingDecorator extends SandwichDecorator {

	public DressingDecorator(Sandwich customSandwich) {
		super(customSandwich);
	}
	
	@Override
	public String make() {
		return customSandwich.make() + addDessing();
	}

	private String addDessing() {
		return " + Mayo";
	}

}
