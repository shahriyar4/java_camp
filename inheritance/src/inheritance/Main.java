package inheritance;

public class Main {

	public static void main(String[] args) {

		IndividualCustomer shahriyar = new IndividualCustomer();

		shahriyar.customerNumber = "1234";

		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "567";

		CustomerManager customerManager = new CustomerManager();

		Customer[] customers = { shahriyar, hepsiBurada };

		customerManager.addMultitiple(customers);
	}

}
