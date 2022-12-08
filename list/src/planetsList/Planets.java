package planetsList;

import java.util.Objects;

public class Planets {
	private String nameVi;
	private String nameEn;
	private double round;
	private double area;
	private double weight;

	public Planets(String nameVi, String nameEn, double round, double area, double weight) {
		super();
		this.nameVi = nameVi;
		this.nameEn = nameEn;
		this.round = round;
		this.area = area * Math.pow(10, 9);
		this.weight = weight * Math.pow(10, 24);
	}

	public String getNameVi() {
		return nameVi;
	}

	public void setNameVi(String nameVi) {
		this.nameVi = nameVi;
	}

	public String getNameEn() {
		return nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	public double getRound() {
		return round;
	}

	public void setRound(double round) {
		this.round = round;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public int hashCode() {
		return Objects.hash(area, nameEn, nameVi, round, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Planets other = (Planets) obj;
		return Double.doubleToLongBits(area) == Double.doubleToLongBits(other.area)
				&& Objects.equals(nameEn, other.nameEn) && Objects.equals(nameVi, other.nameVi)
				&& Double.doubleToLongBits(round) == Double.doubleToLongBits(other.round)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

	@Override
	public String toString() {
		return "Planets [nameVi=" + nameVi + ", nameEn=" + nameEn + ", round=" + round + ", area=" + area + ", weight="
				+ weight + "]";
	}

}
