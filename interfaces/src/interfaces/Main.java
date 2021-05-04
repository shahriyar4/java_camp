package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers = { new SmsLogger(), new EmailLogger(), new Filelogger() };

		CustomerManager customerManager = new CustomerManager(loggers);

		Customer shahriyar = new Customer(1, "Shahriyar", "Hasanov");

		customerManager.add(shahriyar);

	}

}
