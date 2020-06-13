package AbstractFactory;

public class AndroidFactory implements OSFactory {

	@Override
	public Phone phone(ManufacturerType manufacturerType) {
		switch (manufacturerType) {
		case ONEPLUS:
			return new OnePlusPhone();
		case GOOGLE:
			return new GooglePhone();
		default:
			return null;
		}
	}

}
