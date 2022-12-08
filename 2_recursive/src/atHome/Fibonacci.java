package atHome;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println(fibonacciString(10));

	}

	public static String fibonacciString(int number) {
		String s = "";
		for (int i = 1; i < number; i++) {
			s += fibonacci(i) + " ";
		}
		return s;
	}

	public static int fibonacci(int number) {
		if (number < 1) {
			throw new RuntimeException("Erorr");
		} else {
			if (number == 1|| number == 2) {
				return 1;
			} else {
				return fibonacci(number - 1) + fibonacci(number - 2);
			}
		}
	}
}
