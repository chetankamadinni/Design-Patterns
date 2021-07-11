package ChainOfResponsibility;

public class Demo {

	private static AbstractLogger getLogger() {

		AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
		AbstractLogger infoLogger = new InfoLogger(AbstractLogger.INFO);
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

		debugLogger.setNextLogger(infoLogger);
		infoLogger.setNextLogger(errorLogger);

		return debugLogger;
	}

	public static void main(String[] args) {
		AbstractLogger logger = getLogger();
		logger.logMessage(AbstractLogger.ERROR, "This is an error information.");
		logger.logMessage(AbstractLogger.INFO, "This is an information.");
		logger.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");

	}
}
