package linkedListInJavaFramework;

import java.util.LinkedList;

public class FamiliarLinkedList {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
		linkedList.add("1"); // add == addLast
		linkedList.add("2");
		linkedList.addFirst("0");
		linkedList.addLast("4");
		linkedList.add(3, "3");// add 3 at index = 3
		System.out.println("Main: " + linkedList);
		System.out.println("Reverse: " + reverse(linkedList));
		System.out.println("Get last: " + linkedList.getLast());
		linkedList.removeLast();
		System.out.println("Remove last:" + linkedList);
//	Many method popular
		System.out.println("Size: " + linkedList.size());
		System.out.println("Contain \"1\": " + linkedList.contains("1"));
		System.out.println("Is empty: " + linkedList.isEmpty());

//	Ex
		linkedList2.add(10);
		linkedList2.addLast(9);

		linkedList2.addFirst(7);

		linkedList2.add(8);
		linkedList2.add(0, 3);
		linkedList2.add(3, 0);
		linkedList2.add(5);
		System.out.println(linkedList2);
		System.out.println(linkedList2.removeFirst());
		System.out.println(linkedList2);
	}

	public static LinkedList<String> reverse(LinkedList<String> input) {
//		LinkedList<String> result = new LinkedList<String>();
//		for (int i = 0; i < input.size(); i++) {
//			result.add(input.get(input.size() - 1 - i));
//		}
//		return result;
		int tmp1 = input.size() - 2;
		int tmp2 = input.size() - 2;
		while (tmp1 >= 0) {
			String s = input.get(tmp1);
			input.add(s);
			tmp1--;
		}
		while (tmp2 >= 0) {
			input.remove(tmp2);
			tmp2--;
		}
		return input;
	}
}
