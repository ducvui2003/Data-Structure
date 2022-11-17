package linkedListInJavaFramework;

import java.util.Objects;

public class Student {
	private String id;
	private String fullName;
	private double averageMark;

	public Student(String id, String fullName, double averageMark) {
		super();
		this.id = id;
		this.fullName = fullName;
		if (averageMark <= 10.0) {
			this.averageMark = averageMark;
		} else {
			throw new RuntimeException("Error");
		}
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

	public double getAverageMark() {
		return averageMark;
	}

	public void setAverageMark(int averageMark) {
		this.averageMark = averageMark;
	}

	@Override
	public String toString() {
		return "\n\tID: " + this.id + "\tName: " + this.fullName + "\tAverage score: " + this.averageMark;
	}

	@Override
	public int hashCode() {
		return Objects.hash(averageMark, fullName, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return averageMark == other.averageMark && Objects.equals(fullName, other.fullName)
				&& Objects.equals(id, other.id);
	}

}
