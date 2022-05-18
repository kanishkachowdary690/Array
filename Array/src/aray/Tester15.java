package aray;

class Customer1 {

	private int customerId;
	private String customerName;

	public void setCustomerId(int Id) {
		if (Id > 100) {
			customerId = Id;
		}
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerName() {
		return customerName;
	}
}

class Tester15 {
	public static void main(String args[]) {
		Customer1 customer = new Customer1();
		customer.setCustomerName("jack");
		customer.setCustomerId(101);
		System.out.println("Customer Name : " + customer.getCustomerName());
		System.out.println("customer Id : " + customer.getCustomerId());

	}
}