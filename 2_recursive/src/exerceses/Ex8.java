
package exerceses;

public class Ex8 {

	public static void main(String[] args) {
		System.out.println("Sum all Even Number of \"7421\": " + sumEvenNumberOfInteger(7421));
	}

	public static int sumEvenNumberOfInteger(int number) {
		if (number > 0) {
			char[] arrayNumberChar = (number + "").toCharArray();
			int[] arrayNumberInt = new int[arrayNumberChar.length];
			for (int i = 0; i < arrayNumberChar.length; i++) {
				arrayNumberInt[i] = Integer.parseInt(arrayNumberChar[i] + "");
			}
			return sumEvenNumber(arrayNumberInt, arrayNumberChar.length);
		} else {
			throw new RuntimeException("Error");
		}
	}

	public static int sumEvenNumber(int[] arrayNumber, int lengthOfArray) {
		lengthOfArray--;
		if (lengthOfArray == 0) {
			if (checkEvenNumber(arrayNumber[0])) {
				return arrayNumber[0];
			} else {
				return 0;
			}
		} else {
			if (checkEvenNumber(arrayNumber[lengthOfArray])) {
				return arrayNumber[lengthOfArray] + sumEvenNumber(arrayNumber, lengthOfArray);
			} else {
				return 0 + sumEvenNumber(arrayNumber, lengthOfArray);
			}
		}
	}

	public static boolean checkEvenNumber(int number) {
		return number % 2 == 0;
	}
}
