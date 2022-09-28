package exerceses;

public class Ex4 {
	public static void main(String[] args) {
		System.out.println(countLengthNumber(1902));
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
}