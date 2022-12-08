package exerceses;

public class Ex12 {
	public static void main(String[] args) {
		System.out.println("Smallest Digit of \"92129\": " + findSmallestDigitInNumber(92129));
	}

	public static int findSmallestDigitInNumber(int number) {
		if (number > 0) {
//			result assign is 9 to compare with digits in number
//			If result is 0, smallest digit of number always is 0
			return findSmallestDigitInArray(number + "", 0, 9);
		} else {
			throw new RuntimeException("Error");
		}
	}

	public static int findSmallestDigitInArray(String number, int indexDigitNow, int result) {
		if (indexDigitNow < number.length()) {
			result = minNumber(Integer.parseInt(number.charAt(indexDigitNow) + ""),
					findSmallestDigitInArray(number, indexDigitNow + 1, result));
		}
		return result;
	}

	public static int minNumber(int number1, int number2) {
		if (number1 < number2) {
			return number1;
		} else {
			return number2;
		}
	}
}
