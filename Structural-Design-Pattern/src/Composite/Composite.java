package Composite;

public class Composite extends Component {

	String name;

	public Composite(String name) {
		this.name = name;
	}
	
	@Override
	public void showPrice() {
		System.out.println(name);
		for(Component comp : components) {
			comp.showPrice();
		}
	}
	
	@Override
	public void addComponent(Component component) {
		components.add(component);
	}

	@Override
	public void removeComponent(Component component) {
		components.remove(component);
	}
}
