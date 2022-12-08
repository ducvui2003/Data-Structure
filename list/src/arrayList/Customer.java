package arrayList;

import java.io.Serializable;

public class Customer implements Serializable {
	private String fullName;
	private int code;
	private String supermarketId;

	public Customer(String name, int code, String market) {
		super();
		this.fullName = name;
		this.code = code;
		this.supermarketId = market;
	}

	public String getName() {
		return fullName;
	}

	public void setName(String name) {
		this.fullName = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMarket() {
		return supermarketId;
	}

	public void setMarket(String market) {
		this.supermarketId = market;
	}

	@Override
	public String toString() {
		return getName() + "\t|\t" + getCode() + "\t|\t" + getMarket();
	}

}
