package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * First in first out
 * 
 * */
public class DequeueEx {
	public static void main(String[] args) {
		Deque<String> listStudent = new ArrayDeque<String>();
		listStudent.offer("Le Anh Duc");
		listStudent.offer("Nguyen Hoang Anh Duong");
		listStudent.offer("Dao Ngoc Han");
		listStudent.offer("Le Thi Hanh Duyen");
		listStudent.offerLast("Vu Xuan Chien");//insert element in last array
		listStudent.offerFirst("Phung Van Duoc");//insert element in first array

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
