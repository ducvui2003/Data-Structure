package queue;

import java.util.LinkedList;
import java.util.Queue;

public class FamiliarOfQueue {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(9);
		queue.offer(1);
		queue.add(3);
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.element());
		System.out.println(queue);
		queue.remove();
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		
	}
}
