package exerceses;

public class Ex7 {
	public static void main(String[] args) {
		System.out.println("Count Odd Number in \"7421\": " + countOddNumberOfInteger(7421));
	}

	public static int countOddNumberOfInteger(int number) {
		if (number > 0) {
			char[] arrayNumber = (number + "").toCharArray();
			return countOddNumber(arrayNumber, arrayNumber.length);
		} else {
			throw new RuntimeException("Error");
		}
	}

	public static int countOddNumber(char[] arrayNumber, int lengthOfArray) {
		lengthOfArray--;
		if (lengthOfArray == 0) {
			if (checkOddNumber(arrayNumber[lengthOfArray])) {
				return 1;
			} else {
				return 0;
			}
		} else {
			if (checkOddNumber(arrayNumber[lengthOfArray])) {
				return 1 + countOddNumber(arrayNumber, lengthOfArray);
			} else {
				return 0 + countOddNumber(arrayNumber, lengthOfArray);
			}
		}
	}

	public static boolean checkOddNumber(int number) {
		return number % 2 != 0;
	}
}
