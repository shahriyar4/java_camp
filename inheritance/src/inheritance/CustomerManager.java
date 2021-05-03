package inheritance;

public class CustomerManager {
	public void add(Customer customer) {
		System.out.println(customer.customerNumber +" kaydedildi.");
	}
	
	public void addMultitiple (Customer[] customers) {
		
		for (Customer customer : customers) {
			add(customer);
		}
		
	}
}
