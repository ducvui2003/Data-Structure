package exerceses;

public class Ex1 {
	public static void main(String[] args) {
		System.out.println("Convert \"45\" ro decimal number (Recursive): " + decimalToDecimalRecursive(45));
		System.out.println("Convert \"45\" ro decimal number: " + decimalToDecimalNotRecursive(45));
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("Convert \"110110\" ro decimal number (Recursive): " + binaryToDecimalRecursive(110110));
		System.out.println("Convert \"110110\" ro decimal number: " + binaryToDecimalNotRecursive(110110));
	}

// Decimal to Binary
// Using Recursive
	public static int decimalToDecimalRecursive(int decimal) {
		String stringBinary = reverseString(decimalToDecimalNotReverse(decimal));
		return Integer.parseInt(stringBinary.toString());
	}

	public static String decimalToDecimalNotReverse(int decimal) {
		String stringBinary = "";
		if (decimal / 2 == 0) {
			return "1";
		} else {
			stringBinary += (decimal % 2);
			return stringBinary + decimalToDecimalNotReverse(decimal / 2);
		}
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
		return binaryToDecimalRecursiveTemp(decimalArray, decimalArray.length);
	}

	public static int binaryToDecimalRecursiveTemp(char[] binaryArray, int length) {
		length--;
		if (length == 0) {
			if (binaryArray[length] == '1')
				return 1;
			else
				return 0;
		} else {
			if (binaryArray[length] == '1')
				return (1 * (int) Math.pow(2, length)) + binaryToDecimalRecursiveTemp(binaryArray, length);
			else
				return (0 * (int) Math.pow(2, length)) + binaryToDecimalRecursiveTemp(binaryArray, length);
		}

	}

	public static String reverseString(String string) {
		StringBuilder stringBuilder = new StringBuilder(string);
		return stringBuilder.reverse().toString();
	}
}
