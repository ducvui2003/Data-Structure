package file;

import java.io.Serializable;

public class Student implements Serializable {
	private int id;
	private String name;
	private String Date;
	private String major;

	public Student(int id, String name, String date, String major) {
		super();
		this.id = id;
		this.name = name;
		Date = date;
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Date=" + Date + ", major=" + major + "]";
	}

}
