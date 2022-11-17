package set;

import java.util.TreeSet;

public class OrderItems implements Comparable<OrderItems> {
	private String idOrderItem;
	private String idItem;
	private String name;
	private double unitPrice;
	private int quantity;
	private int quantityBegin;

	public OrderItems(String idOrderItem, String idItem, String name, double unitPrice, int quantity) {
		super();
		this.idOrderItem = idOrderItem;
		this.idItem = idItem;
		this.name = name;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.quantityBegin = this.quantity;
	}

	public int getQuantityBegin() {
		return quantityBegin;
	}

	public void setQuantityBegin(int quantityBegin) {
		this.quantityBegin = quantityBegin;
	}

	public static void main(String[] args) {
		OrderItems order1 = new OrderItems("HD01_01", "MH01", "Kem danh rang", 200, 10);
		OrderItems order2 = new OrderItems("HD01_02", "MH02", "Ban chai danh rang", 20, 5);
		OrderItems order3 = new OrderItems("HD01_03", "MH03", "Sua rua mat", 100, 6);

		Order orderBag = new Order("123", "Le Anh Duc", "15/4/2001");
		orderBag.add(order1);
		orderBag.add(order2);
		orderBag.add(order3);
		orderBag.remove(order3);
		orderBag.add(order1);
		orderBag.add(order1);
		orderBag.add(order1);
		orderBag.add(order1);
		orderBag.remove(order1);
		System.out.println(orderBag);
		System.out.println(orderBag.totalPriceInBag());
		System.out.println(orderBag.printBill());
	}

	public String getIdOrderItem() {
		return idOrderItem;
	}

	public void setIdOrderItem(String idOrderItem) {
		this.idOrderItem = idOrderItem;
	}

	public String getIdItem() {
		return idItem;
	}

	public void setIdItem(String idItem) {
		this.idItem = idItem;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "OrderItems [idOrderItem=" + idOrderItem + ", idItem=" + idItem + ", name=" + name + ", unitPrice="
				+ unitPrice + ", quantity=" + quantity + "]";
	}

	@Override
	public int compareTo(OrderItems o) {
		return this.name.compareTo(o.getName());
	}

	public double totalPrice() {
		return getQuantity() * this.unitPrice;
	}
}
