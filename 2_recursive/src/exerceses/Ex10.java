package exerceses;

public class Ex10 {
	public static void main(String[] args) {
		System.out.println("Reverse number \"8172\": " + numberReverse(8172));
	}

	public static int numberReverse(int number) {
		char[] arrayNumberChar = (number + "").toCharArray();
		String s = reverseString(arrayNumberChar, arrayNumberChar.length);
		return Integer.parseInt(s);
	}

	public static String reverseString(char[] arrayNumberChar, int lengthArray) {
		lengthArray--;
		if (lengthArray == 0) {
			return arrayNumberChar[0] + "";
		} else {
			return arrayNumberChar[lengthArray] + "" + reverseString(arrayNumberChar, lengthArray);
		}
	}
}
