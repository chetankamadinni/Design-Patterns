package Singleton;

public class Singleton {

	private static volatile Singleton singleton = null;

	// private constructor: so that instantiate of this class wont happen from
	// outside of this class
	private Singleton() {

	}

	//static method to get the instance of this class in a thread safe way
	public static Singleton getInstance() {
		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}
