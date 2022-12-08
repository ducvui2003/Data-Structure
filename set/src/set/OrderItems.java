package set;

import java.util.Objects;
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
		OrderItems order4 = new OrderItems("HD01_04", "MH04", "Kem danh rang", 200, 10);

		Order orderBag = new Order("123", "Le Anh Duc", "15/4/2001");
		orderBag.add(order1);
		orderBag.add(order2);
		orderBag.add(order3);
		orderBag.remove(order3);
		orderBag.add(order1);
		orderBag.add(order1);
		orderBag.add(order1);
		orderBag.add(order1);
//		orderBag.add(order4);
		orderBag.remove(order1);
		
		System.out.println("**Show order items in bags: \n"+orderBag);
		System.out.println("\n**Total price in bag: " + orderBag.totalPriceInBag());
		System.out.println();
		System.out.println("\n**Print Bill: " + orderBag.totalPriceInBag());
		System.out.println();
		System.out.println("**Find by char: ");
		System.out.println(orderBag.findOrderItemsByChar('B').toString());
		System.out.println("**Find by quantity");
		System.out.println(orderBag.findOrderItemsByQuantity(5));
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
		return "Id order item: " + this.idOrderItem + "\nId item: " + this.idItem + "\nName: " + this.name
				+ "\nQuantity: " + this.quantity + "\nUnit Price: " + this.unitPrice;
	}

	@Override
	public int compareTo(OrderItems o) {
		return this.name.compareTo(o.getName());
	}

	public double totalPrice() {
		return getQuantity() * this.unitPrice;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idItem, idOrderItem, name, quantity, quantityBegin, unitPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItems other = (OrderItems) obj;
		return Objects.equals(idItem, other.idItem) && Objects.equals(idOrderItem, other.idOrderItem)
				&& Objects.equals(name, other.name) && quantity == other.quantity
				&& quantityBegin == other.quantityBegin
				&& Double.doubleToLongBits(unitPrice) == Double.doubleToLongBits(other.unitPrice);
	}
	
}
