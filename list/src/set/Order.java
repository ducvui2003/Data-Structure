package set;

import java.util.Iterator;
import java.util.TreeSet;

public class Order {
	private String id;
	private String customerNAme;
	private String date;
	private TreeSet<OrderItems> bag = new TreeSet<OrderItems>();

	public Order(String id, String customerNAme, String date) {
		super();
		this.id = id;
		this.customerNAme = customerNAme;
		this.date = date;
	}

	public static void main(String[] args) {

	}

	@Override
	public String toString() {
		String result = "HOA DON CUA KHACH HANG: " + this.customerNAme + "\n" + "NGAY LAP HOA DON: " + this.date + "\n"
				+ "DON HANG \n";

		for (OrderItems orderItems : bag) {
			result += orderItems + "\n";
		}
		return result;
	}

	public void add(OrderItems that) {
		if (this.bag.contains(that)) {// check name orderItems
			for (OrderItems orderItems : bag) {
				if (orderItems.getName().compareToIgnoreCase(that.getName()) == 0) {
					orderItems.setQuantity(orderItems.getQuantity() + that.getQuantity());
				}
			}
		} else {
			this.bag.add(that);
		}
	}

	public void remove(OrderItems that) {
		if (this.bag.contains(that)) {
			for (OrderItems orderItem : bag) {
				if (orderItem.getName().compareToIgnoreCase(that.getName()) == 0) {
					if (orderItem.getQuantity() >= that.getQuantity()) {
						int newQuantity = orderItem.getQuantity() - that.getQuantityBegin();
						orderItem.setQuantity(newQuantity);
						if (orderItem.getQuantity() == 0) {
							this.bag.remove(orderItem);
						}
					} else {
						throw new RuntimeException("Quantity of item is noo enough to remove");
					}
				}
			}
		} else {
			throw new RuntimeException("Bags not contain item");
		}
	}

	public double totalPriceInBag() {
		int total = 0;
		for (OrderItems orderItems : bag) {
			total += orderItems.getQuantity() * orderItems.getUnitPrice();
		}
		return total;
	}

	public String printBill() {
		String s = "Name \t Price \t Quantity \t Total\n";
		for (OrderItems orderItem : bag) {
			s += orderItem.getName() + "\t" + orderItem.getUnitPrice() + "\t" + orderItem.getQuantity() + "\t"
					+ orderItem.totalPrice() + "\n";
		}
		s += "Total order: " + this.totalPriceInBag();
		return s;
	}
}
