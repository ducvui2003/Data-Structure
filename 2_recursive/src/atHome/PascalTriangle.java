package atHome;

public class PascalTriangle {
	public static void main(String[] args) {
		System.out.println(pascalTriangle(10));
	}

	public static String pascalTriangle(int height) {
		String pascalTriangle = "";
		for (int i = 0; i < height; i++) {
//			Align pascal columns by backspace
			for (int j = 0; j <= height - i; j++) {
				pascalTriangle += " ";
			}
//			Implement structure c to calculate 
			for (int j = 0; j <= i; j++) {
				pascalTriangle += c(i, j) + " ";
			}
			pascalTriangle += "\n";
		}
		return pascalTriangle;
	}

	public static int c(int n, int k) {
		int c = factorial(n) / (factorial(k) * factorial(n - k));
		return c;
	}

	public static int factorial(int number) {
		if (number == 1 || number == 0) {
			return 1;
		} else {
			return number * factorial(number - 1);
		}
	}
}
