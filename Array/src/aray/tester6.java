package aray;

public class tester6 {

	public static void main(String[] args) {
		double price;
		Order order = new Order(101, "Bajji");
		price = order.caluclateTotalPrice(20, 4);
		System.out.println("orderDetails:");
		System.out.println(order.orderId);
		System.out.println(order.orderFood);
		System.out.println("orderStatus:sucessful");
		System.out.println(price);

	}

}

class Order {
	public int orderId;
	public String orderFood;
	public double totalPrice;
	public String status;

	Order(int orderId, String orderFood) {
		this.orderId = orderId;
		this.orderFood = orderFood;
	}

	public double caluclateTotalPrice(int unitPrice, int quantity) {
		double cost;
		cost = unitPrice * quantity;
		return cost;

	}
}