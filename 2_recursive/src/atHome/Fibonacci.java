package atHome;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println(fibonacciString(10));

	}

	public static String fibonacciString(int number) {
		String s = "";
		for (int i = 0; i < number; i++) {
			s += fibonacci(i) + " ";
		}
		return s;
	}

	public static int fibonacci(int number) {
		if (number < 0) {
			return -1;
		} else {
			if (number == 0 || number == 1) {
				return 1;
			} else {
				return number = fibonacci(number - 1) + fibonacci(number - 2);
			}
		}
	}
}
