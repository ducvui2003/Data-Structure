package exerceses;

public class Ex13 {
	public static void main(String[] args) {
		System.out.println(checkAllDigitsOddNumber(1379));
		System.out.println(checkAllDigitsOddNumber(1369));
	}

	public static boolean checkAllDigitsOddNumber(int number) {
		if (number > 0) {
			if (countOddDigit(number + "", 0) == (number + "").length()) {
				return true;
			} else {
				return false;
			}
		} else {
			throw new RuntimeException("Error");
		}
	}

	public static int countOddDigit(String number, int indexCharNumber) {
		if (indexCharNumber == (number + "").length() - 1) {
			if (checkOddNumber(Integer.parseInt(number.charAt(indexCharNumber) + "")))
				return 1;
			else
				return 0;
		} else {
			if (checkOddNumber(Integer.parseInt(number.charAt(indexCharNumber) + ""))) {
				return 1 + countOddDigit(number, indexCharNumber + 1);
			} else {
				return 0 + countOddDigit(number, indexCharNumber + 1);
			}
		}
	}

	public static boolean checkOddNumber(int number) {
		if (number % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}
}
