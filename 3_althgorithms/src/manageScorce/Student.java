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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAccademicYear() {
		return accademicYear;
	}

	public void setAccademicYear(String accademicYear) {
		this.accademicYear = accademicYear;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getChemistry() {
		return chemistry;
	}

	public void setChemistry(double chemistry) {
		this.chemistry = chemistry;
	}

	public double getPhysical() {
		return physical;
	}

	public void setPhysical(double physical) {
		this.physical = physical;
	}

	@Override
	public String toString() {
		return "Id: " + getId() + "\tFull name: " + getFullName() + "\tStudent Year: " + getAccademicYear()
				+ "\n\tMath: " + getMath() + "\n\tChemistry: " + getChemistry() + "\n\tPhysical: " + getChemistry()
				+ "\n\t--> Average: " + getAverageScorce();
	}

}
