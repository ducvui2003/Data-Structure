package exerceses;

public class Ex9 {
	public static void main(String[] args) {
		System.out.println("Multiply all Odd Number of \"7421\": " + multiplyOddNumberOfInteger(7421));
	}

	public static int multiplyOddNumberOfInteger(int number) {
		if (number > 0) {
			char[] arrayNumberChar = (number + "").toCharArray();
			int[] arrayNumberInt = new int[arrayNumberChar.length];
			for (int i = 0; i < arrayNumberChar.length; i++) {
				arrayNumberInt[i] = Integer.parseInt(arrayNumberChar[i] + "");
			}
			return multiplyEvenNumber(arrayNumberInt, arrayNumberChar.length);
		} else {
			throw new RuntimeException("Error");
		}
	}

	public static int multiplyEvenNumber(int[] arrayNumber, int lengthOfArray) {
		lengthOfArray--;
		if (lengthOfArray == 0) {
			if (checkOddNumber(arrayNumber[0])) {
				return arrayNumber[0];
			} else {
				return 1;
			}
		} else {
			if (checkOddNumber(arrayNumber[lengthOfArray])) {
				return arrayNumber[lengthOfArray] * multiplyEvenNumber(arrayNumber, lengthOfArray);
			} else {
				return 1 * multiplyEvenNumber(arrayNumber, lengthOfArray);
			}
		}
	}

	public static boolean checkOddNumber(int number) {
		return number % 2 != 0;
	}
}
