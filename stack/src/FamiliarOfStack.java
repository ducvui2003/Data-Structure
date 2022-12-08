import java.util.Stack;

public class FamiliarOfStack {
//	First in first out
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
//		push(): add last
		stack.add(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.pop();
		System.out.println(stack);
//		peek(): return first element
		System.out.println(stack.peek());
		stack.remove(1);
		System.out.println(stack);
//		get(index)
		System.out.println(stack.get(1));
	}

}
