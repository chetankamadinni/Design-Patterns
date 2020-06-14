package Composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {

	List<Component> components = new ArrayList<>();
	
	public void addComponent(Component component) {
		throw new UnsupportedOperationException();
	}
	
	public void removeComponent(Component component) {
		throw new UnsupportedOperationException();
	}
	
	public abstract void showPrice();
}
