package AbstractFactory;

public class AbstarctFactoryExample {
	public static void main(String[] args) {
		OSFactory android = AbstractPhoneFactory.getFactory(OSType.ANDROID);
		Phone google = android.phone(ManufacturerType.GOOGLE);
		google.display();
		
		OSFactory windows = AbstractPhoneFactory.getFactory(OSType.WINDOWS);
		Phone lenono = windows.phone(ManufacturerType.LENOVO);
		lenono.display();
		
	}
}
