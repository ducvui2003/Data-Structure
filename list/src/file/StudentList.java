package file;

import java.util.ArrayList;

public class StudentList {
	private ArrayList<Student> stuLst;

	public StudentList() {
		super();
		this.stuLst = new ArrayList<Student>();
	}

	public static void main(String[] args) {
		Student st1 = new Student(21130320, "Le Anh Duc", "15/08/2003", "CNTT");
		Student st2 = new Student(21130320, "Le Anh Duc", "15/08/2003", "CNTT");
		Student st3 = new Student(21130320, "Le Anh Duc", "15/08/2003", "CNTT");
		Student st4 = new Student(21130320, "Le Anh Duc", "15/08/2003", "CNTT");
		StudentList lstStu = new StudentList();
		lstStu.add(st1);
		lstStu.add(st2);
		lstStu.add(st3);
		lstStu.add(st4);
	}

	public void add(Student s) {
		this.stuLst.add(s);
	}

	@Override
	public String toString() {
		return "StudentList [stuLst=" + stuLst + "]";
	}

}
