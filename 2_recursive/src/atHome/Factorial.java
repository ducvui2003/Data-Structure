package atHome;

public class Factorial {
	public static int factorialImple(int number) {//5!
		if (number < 0) {
			throw new IllegalArgumentException();//pause
		} else {
			if (number == 0) {
				return 1;
			} else {
				return number * factorialImple(number - 1);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(factorialImple(5));
	}
}
