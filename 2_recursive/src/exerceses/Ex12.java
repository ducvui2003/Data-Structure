package exerceses;

public class Ex12 {
	public static void main(String[] args) {
		System.out.println("Smallest Digit of \"92129\": " + findSmallestDigitInNumber(92129));
	}

	public static int findSmallestDigitInNumber(int number) {
		if (number > 0) {
			char[] numberArrayChar = (number + "").toCharArray();
			int[] numberArrayInt = new int[numberArrayChar.length];
			for (int i = 0; i < numberArrayChar.length; i++) {
				numberArrayInt[i] = Integer.parseInt(numberArrayChar[i] + "");
			}
			return findSmallestDigitInArray(numberArrayInt, numberArrayInt.length);
		} else {
			throw new RuntimeException("Error");
		}
	}

	public static int findSmallestDigitInArray(int[] numberArray, int lengthOfArray) {
		lengthOfArray--;
		if (lengthOfArray == 1) {
			return minNumber(numberArray[1], numberArray[0]);
		} else {
			int minDegit = minNumber(numberArray[lengthOfArray],
					findSmallestDigitInArray(numberArray, numberArray[lengthOfArray]));
			return minDegit;
		}
	}

	public static int minNumber(int number1, int number2) {
		if (number1 < number2) {
			return number1;
		} else {
			return number2;
		}
	}
}
