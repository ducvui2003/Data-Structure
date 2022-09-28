package atHome;

public class DecimalToBinary {
	public static void main(String[] args) {
		System.out.println(decimalToBinary(43));
	}

	public static int decimalToBinary(int decimal) {
		String binary = "";
		String binaryNotReverse = decimalToBinaryNotReverse(decimal);
		char[] arrayBinaryNotReverse = binaryNotReverse.toCharArray();
		for (int i = 0; i < arrayBinaryNotReverse.length; i++) {
			binary += arrayBinaryNotReverse[arrayBinaryNotReverse.length - i - 1];
		}
		return Integer.parseInt(binary);
	}

	public static String decimalToBinaryNotReverse(int decimal) {
		String s = "";
		if (decimal / 2 == 0) {
			return "1";
		} else {
			s = s + (decimal % 2);
			return s + decimalToBinaryNotReverse(decimal / 2);
		}
	}
}
