package linkedListInJavaFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

public class Class {
	private String id;
	private String name;
	private String year;
	private LinkedList<Student> list;

	public static void main(String[] args) {
		Class cl = new Class("1001", "DH21DTB", "2021");
		Student s = new Student("21130320", "Le Anh Duc", 5.0);
		Student s1 = new Student("21130320", "Le Anh Duc", 8.0);
		Student s2 = new Student("21130310", "Nguyen Tran Sy Dong", 7.0);
		Student s3 = new Student("21130300", "Le Thi Hanh Duyen", 8.5);
		cl.addStudent(s);
		cl.addStudent(s1);
		cl.addStudent(s2);
		cl.addStudent(s3);
//		System.out.println(cl);
		System.out.println(cl.getBottom(2));
		System.out.println(cl.getTop(2));
		cl.removeStudentUnderAVGClass();
		System.out.println(cl);

	}

	public Class(String id, String name, String year) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
		this.list = new LinkedList<Student>();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public LinkedList<Student> getList() {
		return list;
	}

	public void setList(LinkedList<Student> list) {
		this.list = list;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, list, name, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Class other = (Class) obj;
		return Objects.equals(id, other.id) && Objects.equals(list, other.list) && Objects.equals(name, other.name)
				&& Objects.equals(year, other.year);
	}

	@Override
	public String toString() {
		return "ID: " + this.id + "\nClass: " + this.name + "\nYear: " + this.year + "\nList students: "
				+ printLinkedList();
	}

//Add student and sort it in list
	public void addStudent(Student student) {
		if (this.list.isEmpty()) {
			this.list.add(student);
		} else {
			if (student.getAverageMark() <= this.list.getFirst().getAverageMark()) {
				this.list.addFirst(student);
			} else {
				if (student.getAverageMark() >= this.list.getLast().getAverageMark()) {
					this.list.addLast(student);
				} else {
					for (int i = 1; i < this.list.size() - 1; i++) {
						if (student.getAverageMark() <= this.list.get(i).getAverageMark()) {
							this.list.add(i, student);
							break;
						}
					}
				}
			}
		}
	}

	public String printLinkedList() {
		String result = "";
		for (int i = 0; i < this.list.size(); i++) {
			result += this.list.get(i) + "\n";
		}
		return result;
	}

	public LinkedList<Student> getBottom(int numberOfStudent) {
		if (list.size() >= numberOfStudent) {
			LinkedList<Student> listBottom = new LinkedList<Student>();
			for (int i = 0; i < numberOfStudent; i++) {
				listBottom.add(list.get(i));
			}
			return listBottom;
		} else {
			throw new RuntimeException("Size of list is lower than number of students");
		}
	}

	public LinkedList<Student> getTop(int numberOfStudent) {
		if (list.size() >= numberOfStudent) {
			LinkedList<Student> listTop = new LinkedList<Student>();
			for (int i = list.size() - numberOfStudent; i < list.size(); i++) {
				listTop.add(list.get(i));
			}
			return listTop;
		} else {
			throw new RuntimeException("Size of list is lower than number of students");
		}
	}

	public double getAVGByFullName(String name) {
		double result = 0;
		for (Student student : list) {
			if (student.getFullName().equalsIgnoreCase(name)) {
				result = student.getAverageMark();
			}
		}
		return result;
	}

	public double getAVGOfClass() {
		double total = 0;
		for (Student student : list) {
			total += student.getAverageMark();
		}
		return total / this.list.size();
	}

	public void removeStudentUnderAVGClass() {
		double avgClass = getAVGOfClass();
		for (int i = 0; i < this.list.size(); i++) {
			if (this.list.get(i).getAverageMark() < avgClass) {
				this.list.remove(i);
			}
		}
	}
}
