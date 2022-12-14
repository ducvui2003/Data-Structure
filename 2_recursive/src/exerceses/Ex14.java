package exerceses;

public class Ex14 {
	public static void main(String[] args) {
		System.out.println(checkAllDigitsEvenNumber(1379));
		System.out.println(checkAllDigitsEvenNumber(2468));
		System.out.println(checkAllDigitsEvenNumber(2478));
		System.out.println(countEvenDigit(2468 + "", 0));
	}

	public static boolean checkAllDigitsEvenNumber(int number) {
		if (number > 0) {
			if (countEvenDigit(number + "", 0) == (number + "").length()) {
				return true;
			} else {
				return false;
			}
		} else {
			throw new RuntimeException("Error");
		}
	}

	public static int countEvenDigit(String number, int indexCharNumber) {
		if (indexCharNumber == (number + "").length() - 1) {
			if (checkEvenNumber(Integer.parseInt(number.charAt(indexCharNumber) + "")))
				return 1;
			else
				return 0;
		} else {
			if (checkEvenNumber(Integer.parseInt(number.charAt(indexCharNumber) + ""))) {
				return 1 + countEvenDigit(number, indexCharNumber + 1);
			} else {
				return 0 + countEvenDigit(number, indexCharNumber + 1);
			}
		}
	}

	public static boolean checkEvenNumber(int number) {
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
