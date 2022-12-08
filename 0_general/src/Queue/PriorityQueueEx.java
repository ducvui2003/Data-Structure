package Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * First in first out
 * 
 * */
public class PriorityQueueEx {
	public static void main(String[] args) {
		Queue<String> listStudent = new PriorityQueue<String>();
		listStudent.offer("Le Anh Duc");
		listStudent.offer("Nguyen Hoang Anh Duong");
		listStudent.offer("Dao Ngoc Han");
		listStudent.offer("Le Thi Hanh Duyen");

		while (true) {

			String name = listStudent.poll();// => get and delete
			if (name == null) {
				break;
			}
//			String name = lisStudent.poll();  => get and no delete
			System.out.println(name);
		}
	}

}
