package exerceses;

public class Ex3 {
	public static void main(String[] args) {
		System.out.println("18 divisible 3 and 18 not divisible 9?: " + mod3AndMod9NotRecursive(18));
		System.out.println(totalDigitInNumber(11231));
		System.out.println("21 divisible 3 and 18 not divisible 9 (Recursive)?: " + mod3AndMod9Recursive(21));
	}

	public static boolean mod3AndMod9NotRecursive(int number) {
		return number % 3 == 0 && number % 9 != 0;
	}

	public static boolean mod3AndMod9Recursive(int number) {
		char[] numberCharArray = ("" + number).toCharArray();
		int[] numberArray = new int[numberCharArray.length];
		for (int i = 0; i < numberArray.length; i++) {
			numberArray[i] = (int) numberCharArray[i] - 48;
		}
		int totalNumberArray = totalArrayNumber(numberArray, numberArray.length);
		return totalNumberArray % 3 == 0 && totalNumberArray % 9 != 0;
	}

	public static int totalArrayNumber(int[] numberArray, int length) {
		length--;
		if (length == 0) {
			return numberArray[length];
		} else {
			return numberArray[length] + totalArrayNumber(numberArray, length);
		}
	}

	public static int totalDigitInNumber(int number) {
		if (number == 0) {
			return number;
		} else {
			return number % 10 + totalDigitInNumber(number / 10);
		}
	}
}
