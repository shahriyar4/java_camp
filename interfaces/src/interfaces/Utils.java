package interfaces;

public class Utils {

	public static void runLogges(Logger[] loggers, String message) {
		
		for (Logger logger : loggers) {
			logger.log(message);

		}
	}

}
