package Facade;

public class PhoneFacade {

	private IPhone iPhone;
	private OnePlus onePlus;
	private NokiaPhone nokiaPhone;

	public PhoneFacade() {
		this.iPhone = new IPhone();
		this.onePlus = new OnePlus();
		this.nokiaPhone = new NokiaPhone();
	}

	public String buildIPhone() {
		return iPhone.build();
	}

	public String buildAndroidPhone() {
		return onePlus.build();
	}

	public String buildWindowsPhone() {
		return nokiaPhone.build();
	}
}
