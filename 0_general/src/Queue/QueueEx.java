package Queue;

import java.util.LinkedList;
import java.util.Queue;

/*
 * First in first out
 * 
 * */
public class QueueEx {
	public static void main(String[] args) {
		Queue<String> lisStudent = new LinkedList<String>();
		lisStudent.offer("Le Anh Duc");
		lisStudent.offer("Dao Ngoc Han");
		lisStudent.offer("Nguyen Hoang Anh Duong");
		lisStudent.offer("Le Thi Hanh Duyen");

		while (true) {

			String name = lisStudent.poll();// => get and delete
			if (name == null) {
				break;
			}
//			String name = lisStudent.poll();  => get and no delete
			System.out.println(name);
		}
	}

}
