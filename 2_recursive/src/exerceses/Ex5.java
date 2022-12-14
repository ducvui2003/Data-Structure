package exerceses;

public class Ex5 {

	public static void main(String[] args) {
		System.out.println("Sum number of \"839\" is: " + totalNumberOfInt(839));
	}

	public static int totalNumberOfInt(int number) {
		if (number > 0) {
			char[] stringNumberOfInt = (number + "").toCharArray();
			return totalNumber(stringNumberOfInt, stringNumberOfInt.length);
		} else {
			throw new RuntimeException("Error");
		}
	}

	public static int totalNumber(char[] arrayNumber, int length) {
		length--;
		if (length == 0) {
			return Integer.parseInt(arrayNumber[length] + "");
		} else {
			return Integer.parseInt(arrayNumber[length] + "") + totalNumber(arrayNumber, length);
		}
	}
}
