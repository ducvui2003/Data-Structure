package manageScorce;

public class Student {
	private String id;
	private String fullName;
	private String accademicYear;
	private double math;
	private double chemistry;
	private double physical;

	public Student(String id, String fullName, String accademicYear, double math, double chemistry, double physical) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.accademicYear = accademicYear;
		this.math = math;
		this.chemistry = chemistry;
		this.physical = physical;
	}

	public double getAverageScorce() {
		double totals = (math + chemistry + physical) / 3.0;
		return totals;
	}

	@Override
	public String toString() {
		return "Id: " + this.id + "\tFull name: " + this.fullName + "\tStudent Year: " + this.accademicYear
				+ "\n\tMath: " + this.math + "\n\tChemistry: " + this.chemistry + "\n\tPhysical: " + this.physical
				+ "\n\t--> Average: " + this.getAverageScorce();
	}

}
