package manageScorce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class StudentsList {

	private Student[] arrayStudent;
//	private ArrayList<Student> arrayListStudent = new ArrayList<Student>();

	public static void main(String[] args) {
		Student st1 = new Student("21130320", "Le Anh Duc", "2", 9, 8, 5.5);
		Student st2 = new Student("21137820", "Dao Ngoc Han", "2", 7, 5.3, 8.5);
		Student st3 = new Student("21136720", "Nguyen Hoang Anh Duong", "2", 4, 2.5, 9.5);
		Student st4 = new Student("21135620", "Trinh Tran Sy Dong", "2", 8, 8, 6.5);

		StudentsList stdList = new StudentsList(new Student[] { st1, st2, st3, st4 });
		System.out.println(
				stdList.printLstStudent(stdList.getaArrayStudent_Sort_SelectionSort(stdList.getArrayStudent())));
	}

	public StudentsList(Student[] arrayStudent) {
		super();
		this.arrayStudent = arrayStudent;
	}

	public String printLstStudent(Student[] arrayStudent) {
		String s = "";
		for (Student student : arrayStudent) {
			s += student.toString() + "\n";
		}
		return s;
	}

	private Student[] toArray(ArrayList<Student> arrayListStudent) {
		Student[] arrayStudent = new Student[arrayListStudent.size()];
		for (int i = 0; i < arrayStudent.length; i++) {
			arrayStudent[i] = arrayListStudent.get(i);
		}
		return arrayStudent;
	}

	public Student[] getArrayStudent() {
		return arrayStudent;
	}

	public void setArrayStudent(Student[] arrayStudent) {
		this.arrayStudent = arrayStudent;
	}

	private Student[] getaArrayStudent_Sort_SelectionSort(Student[] arrayStd) {
		for (int i = 0; i < arrayStd.length; i++) {
			double cur = arrayStd[i].getAverageScorce();
			int indexCur = i;
			for (int j = i + 1; j < arrayStd.length; j++) {
				if (arrayStd[j].getAverageScorce() < cur) {
					cur = arrayStd[j].getAverageScorce();
					indexCur = j;
				}
			}
			if (arrayStd[i].getAverageScorce() != cur) {
				Student temp;
				temp = arrayStd[i];
				arrayStd[i] = arrayStd[indexCur];
				arrayStd[indexCur] = temp;
			}
		}
		return arrayStd;
	}

}
