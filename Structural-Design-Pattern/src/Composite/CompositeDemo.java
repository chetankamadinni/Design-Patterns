package Composite;

public class CompositeDemo {

	public static void main(String[] args) {
		Component mouse = new Leaf("Mouse", 500);
		Component keyboard = new Leaf("keyboard", 700);
		
		Component pheripheral = new Composite("Pheripheral");
		pheripheral.addComponent(mouse);
		pheripheral.addComponent(keyboard);
		
		Component ram = new Leaf("RAM", 3000);
		Component cpu = new Leaf("CPU", 9000);

		Component motherboard = new Composite("MB");
		motherboard.addComponent(ram);
		motherboard.addComponent(cpu);
		
		Leaf harddisk = new Leaf("HDD", 5000);
		
		Component cabinet = new Composite("Cabinet");
		cabinet.addComponent(harddisk);
		cabinet.addComponent(motherboard);
		
		Component computer = new Composite("Computer");
		computer.addComponent(pheripheral);
		computer.addComponent(cabinet);
		
		computer.showPrice();
		

	}

}
