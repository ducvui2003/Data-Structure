package exerceses;

public class Ex4 {
	public static void main(String[] args) {
		System.out.println(countLengthNumber(1902));
		System.out.println(countDigitNumber(1902, 0));
	}

	public static int countLengthNumber(int number) {
		char[] numberArray = ("" + number).toCharArray();
		return count(numberArray.length);
	}

	public static int count(int length) {
		length--;
		if (length == 0) {
			return 1;
		} else {
			return 1 + count(length);
		}
	}

	private static int countDigitNumber(int number, int result) {
		if (number / 10 < 1) {
			result++;
		} else {
			result += 1 + countDigitNumber(number / 10, result);
		}
		return result;
	}
}
