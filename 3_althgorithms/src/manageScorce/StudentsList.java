package manageScorce;

public class StudentsList {
	private String id;
	private String name;
	private Student[] arrayStudent;

//	private ArrayList<Student> arrayListStudent = new ArrayList<Student>();
	public static void main(String[] args) {
		Student st1 = new Student("21130320", "Le Anh Duc", "2", 9, 8, 5.5);
		Student st2 = new Student("21137820", "Dao Ngoc Han", "2", 7, 5.3, 8.5);
		Student st3 = new Student("21136720", "Nguyen Hoang Anh Duong", "2", 4, 2.5, 9.5);
		Student st4 = new Student("21135620", "Trinh Tran Sy Dong", "2", 8, 8, 6.5);

		StudentsList stdList = new StudentsList("1", "ds sv", new Student[] { st1, st2, st3, st4 });
		System.out.println("*Selection Sort\n" + stdList.printLstStudent(stdList.getArrayStudent_Sort_SelectionSort()));
		System.out.println("*Bubble Sort\n" + stdList.printLstStudent(stdList.getArrayStudent_Sort_BubbleSort()));
		System.out.println("*Insertion Sort\n" + stdList.printLstStudent(stdList.getArrayStudent_Sort_InsertSort()));
		test(5);
	}

	public static void test(int i) {
		i++;
		return;
	}

	public StudentsList(String id, String name, Student[] arrayStudent) {
		super();
		this.id = id;
		this.name = name;
		this.arrayStudent = arrayStudent;
	}

	public StudentsList(String id, String name, int arrayLength) {
		super();
		this.id = id;
		this.name = name;
		this.arrayStudent = new Student[arrayLength];
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

	public Student[] getArrayStudent() {
		return arrayStudent;
	}

	public void setArrayStudent(Student[] arrayStudent) {
		this.arrayStudent = arrayStudent;
	}

	public void insert(Student that) {
		if (empty()) {
			arrayStudent[getEmptyIndex()] = that;
		} else {
			throw new RuntimeException("Index bounds");
		}
	}

	public int getEmptyIndex() {
		for (int i = 0; i < this.arrayStudent.length; i++) {
			if (this.arrayStudent[i] == null) {
				return i;
			}
		}
		return 0;
	}

	public boolean empty() {
		for (int i = 0; i < this.arrayStudent.length; i++) {
			if (this.arrayStudent[i] == null) {
				return true;
			}
		}
		return false;
	}

	public void swapStudent(int indexSt1, int indexSt2) {
		Student temp = this.arrayStudent[indexSt1];
		this.arrayStudent[indexSt1] = this.arrayStudent[indexSt2];
		this.arrayStudent[indexSt2] = temp;
	}

	public String printLstStudent(Student[] arrayStudent) {
		String s = "";
		for (Student student : arrayStudent) {
			s += student.toString() + "\n";
		}
		return s;
	}

	public Student[] getArrayStudent_Sort_SelectionSort() {
		for (int i = 0; i < this.arrayStudent.length; i++) {
			double cur = this.arrayStudent[i].getAverageScorce();
			int indexCur = i;
			for (int j = i + 1; j < this.arrayStudent.length; j++) {
				if (this.arrayStudent[j].getAverageScorce() < cur) {
					cur = this.arrayStudent[j].getAverageScorce();
					indexCur = j;
				}
			}
			if (this.arrayStudent[i].getAverageScorce() != cur) {
				Student temp;
				temp = this.arrayStudent[i];
				this.arrayStudent[i] = this.arrayStudent[indexCur];
				this.arrayStudent[indexCur] = temp;
			}
		}
		return this.arrayStudent;
	}

	public Student[] getArrayStudent_Sort_BubbleSort() {
		for (int i = 0; i < this.arrayStudent.length; i++) {
			for (int j = 0; j < arrayStudent.length - i - 1; j++) {
				if (this.arrayStudent[j].getAverageScorce() > this.arrayStudent[j + 1].getAverageScorce()) {
					swapStudent(j, j + 1);
				}
			}
		}
		return this.arrayStudent;
	}

	public Student[] getArrayStudent_Sort_InsertSort() {
		for (int i = 1; i < arrayStudent.length; i++) {
//			Compare point with index below
			double point = arrayStudent[i].getAverageScorce();
			int index = i;
			while (index > 0 && arrayStudent[index - 1].getAverageScorce() > point) {
				arrayStudent[index] = arrayStudent[index - 1];
				index--;
			}
			arrayStudent[index] = arrayStudent[i];
		}
		return arrayStudent;
	}

//	public Student[] getArrayStudent_Sort_InsertSort_Recursive(int i) {
//		if (i >= arrayStudent.length) {
//			
//		}
//	}
}
