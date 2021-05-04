package interfaces;

public class CustomerManager {

	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Musteri eklendi: " + customer.getFirstName());

		Utils.runLogges(loggers, customer.getFirstName());
	}

	public void delete(Customer customer) {
		System.out.println("Musteri silindi: " + customer.getFirstName());
		Utils.runLogges(loggers, customer.getFirstName());

	}
}
