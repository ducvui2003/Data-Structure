package exerceses;

public class Ex6 {
	public static void main(String[] args) {
		System.out.println("Multiply number of \"839\" is: " + multiplicationOfInt(839));
	}
	public static int multiplicationOfInt(int number) {
		if (number > 0) {
			char[] numberArray = (number + "").toCharArray();
			return multiplicationOfNumberArray(numberArray, numberArray.length);
		} else {
			throw new RuntimeException();
		}
	}

	public static int multiplicationOfNumberArray(char[] numberArray, int lengthOfArray) {
		lengthOfArray--;
		if (lengthOfArray == 0) {
			return Integer.parseInt(numberArray[lengthOfArray] + "");

		} else {
			return Integer.parseInt(numberArray[lengthOfArray] + "")
					* multiplicationOfNumberArray(numberArray, lengthOfArray);
		}
	}
}
