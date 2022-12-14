package exerceses;

public class Ex1 {
	public static void main(String[] args) {
		System.out.println("Convert \"45\" ro decimal number (Recursive): " + decimalToDecimalNotReverse(45));
		System.out.println("Convert \"45\" ro decimal number: " + decimalToDecimalNotRecursive(45));
		System.out.println("Convert \"45\" ro decimal number: " + decimalToDecimalNotRecursive(10));
		System.out.println(decToBin(84));
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("Convert \"110110\" ro decimal number (Recursive): " + binaryToDecimalRecursive(110110));
		System.out.println("Convert \"110110\" ro decimal number: " + binaryToDecimalNotRecursive(110110));
		System.out.println(binaryToDecimalRecursive2("110000110", "110000110".length() - 1, 0));
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println(decToBin(45));
		System.out.println((110110 + "").length());
		System.out.println(Integer.parseInt((10111 + "").charAt(0) + ""));
		System.out.println(biToDec(110110, (110110 + "").length()));
	}

// Decimal to Binary
// Using Recursive
	public static int decimalToDecimalRecursive(int decimal) {
		String stringBinary = reverseString(decimalToDecimalNotReverse(decimal));
		return Integer.parseInt(stringBinary.toString());
	}

	public static String decimalToDecimalNotReverse(int decimal) {
		String stringBinary = "";
		if (decimal == 0) {

		} else {
			stringBinary += (decimal % 2);
			stringBinary += decimalToDecimalNotReverse(decimal / 2);
		}
		return stringBinary;
	}

// Using While
	public static int decimalToDecimalNotRecursive(int decimal) {
		String stringBinaryNotReverse = "";
		while (decimal / 2 != 0) {
			stringBinaryNotReverse += decimal % 2;
			decimal = decimal / 2;
		}
		stringBinaryNotReverse += "1";
		return Integer.parseInt(reverseString(stringBinaryNotReverse));
	}

// Using divide to get 
	public static int decToBin(int n) {
		if (n / 2 == 0)// stop
			return n % 2;
		return (decToBin(n / 2) * 10) + n % 2;
	}

//	--------------------------------------------------------------------
//	Convert Binary to Decimal
//	Using For
	public static int binaryToDecimalNotRecursive(int binary) {
		char[] arrayBinary = (binary + "").toCharArray();
		int decimal = 0;
		for (int i = 0; i < arrayBinary.length; i++) {
			if (arrayBinary[i] == '1') {
				decimal += 1 * Math.pow(2, arrayBinary.length - i - 1);
			} else {
				if (arrayBinary[i] == '0') {
					decimal += 0 * Math.pow(2, arrayBinary.length - i - 1);
				} else {
					break;
				}
			}
		}
		return decimal;
	}

// Using Recursive
	public static int binaryToDecimalRecursive(int binary) {
		char[] decimalArray = (reverseString("" + binary)).toCharArray();
		return binaryToDecimalRecursive1(decimalArray, decimalArray.length);
	}

	public static int binaryToDecimalRecursive1(char[] binaryArray, int length) {
		length--;
		if (length == 0) {
			if (binaryArray[length] == '1')
				return 1;
			else
				return 0;
		} else {
			if (binaryArray[length] == '1')
				return (1 * (int) Math.pow(2, length)) + binaryToDecimalRecursive1(binaryArray, length);
			else
				return (0 * (int) Math.pow(2, length)) + binaryToDecimalRecursive1(binaryArray, length);
		}

	}

// Using CharAt to get char in Binary (String) with index char is cursor. Using result to return output
	public static int binaryToDecimalRecursive2(String biNum, int cursor, int result) {
		if (cursor > -1) {
			result += Integer.parseInt(biNum.charAt(cursor) + "") * Math.pow(2, biNum.length() - cursor - 1)
					+ binaryToDecimalRecursive2(biNum, cursor - 1, result);
		}
		return result;

	}

	public static String reverseString(String string) {
		StringBuilder stringBuilder = new StringBuilder(string);
		return stringBuilder.reverse().toString();
	}

	public static int biToDec(int number, int i) {
		int result = 0;
		if (i == 0) {
			return result;
		} else {
			int digit = Integer.parseInt((number + "").charAt(i - 1) + "");

			return result = digit * (int) Math.pow(2, (number + "").length() - i) + biToDec(number, i - 1);
		}
	}
}
