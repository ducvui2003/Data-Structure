package exerceses;

public class Ex11 {
	public static void main(String[] args) {
		System.out.println("Greatest Digit of \"792402128\": " + findGreatestDigitInNumber(792402128));
//		int i = 6;
//		System.out.println(i = i-1);
	}

	public static int findGreatestDigitInNumber(int number) {
		if (number > 0) {
//			char[] numberArrayChar = (number + "").toCharArray();
//			int[] numberArrayInt = new int[numberArrayChar.length];
//			for (int i = 0; i < numberArrayChar.length; i++) {
//				numberArrayInt[i] = Integer.parseInt(numberArrayChar[i] + "");
//			}
			return findGreatestDigitInArray(number + "", 0, 0);
		} else {
			throw new RuntimeException("Error");
		}
	}

	public static int findGreatestDigitInArray(String number, int cursor, int result) {
		if (cursor < number.length()) {
			result = maxNumber(Integer.parseInt(number.charAt(cursor) + ""),
					findGreatestDigitInArray(number, cursor + 1, result));
		}
		return result;
	}

	public static int maxNumber(int number1, int number2) {
		if (number1 > number2) {
			return number1;
		} else {
			return number2;
		}
	}
}