package AbstractFactory;

public class WindowsFactory implements OSFactory {

	@Override
	public Phone phone(ManufacturerType manufacturerType) {
		switch (manufacturerType) {
		case LENOVO:
			return new LenovoPhone();
		case NOKIA:
			return new NokiaPhone();
		default:
			return null;
		}
	}

}
