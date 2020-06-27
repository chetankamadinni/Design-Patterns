package Facade;

public class FacadeDemo {

	public static void main(String[] args) {
		PhoneFacade phoneFacade = new PhoneFacade();
		System.out.println(phoneFacade.buildAndroidPhone());
		System.out.println(phoneFacade.buildIPhone());
		System.out.println(phoneFacade.buildWindowsPhone());

	}

}
