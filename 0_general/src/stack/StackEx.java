package stack;

import java.util.Scanner;
import java.util.Stack;

/*
 * Last in first out
 * 
 * */
public class StackEx {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stack<String> stackString = new Stack<String>();
//		stackString.push("Hello Java");// add value;
//		stackString.pop();// get value (LIFO) => delete stack
//		stackString.peek();// get value (LIFO) => no delete stack
//		stackString.clear();// delete all value in stack
//		stackString.contains(" ");

//	Ex: Reverse String
//		System.out.println("String: ");
//		String s = in.nextLine();
//		for (int i = 0; i < s.length(); i++) {
//			stackString.push(s.charAt(i) + "");
//		}
//		System.out.println("Reverse string: ");
//		for (int i = 0; i < s.length(); i++) {
//			System.out.print(stackString.pop());
//		}

//	Ex: Convert decimal to binary
		Stack<Integer> stackInt = new Stack<Integer>();
		System.out.print("Enter a integer number: ");
		int x = in.nextInt();
		while (x > 0) {
				int remainder = x % 2;
				stackInt.push(remainder);
				x = x / 2;
		}
		int n = stackInt.size();
		for (int i = 0; i < n; i++) {
			System.out.print(stackInt.pop());
		}
	}
}
