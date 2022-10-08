package atHome;

//Giải thuật Euclid dựa trên nguyên tắc là ước chung lớn nhất của hai số nguyên không thay đổi khi thay số lớn hơn bằng hiệu của nó với số nhỏ hơn.
//Chẳng hạn, 21 là ƯCLN của 252 và 105 (vì 252 = 21 × 12 và 105 = 21 × 5) và cũng là ƯCLN của 105 và 252 − 105 = 147.
//Khi lặp lại quá trình trên thì hai số trong cặp số ngày càng nhỏ đến khi chúng bằng nhau, và khi đó chúng là ƯCLN của hai số ban đầu
public class GreatestCommonDivisor {
	public static void main(String[] args) {
		System.out.println(findGCD(12, 20));
	}

	public static int findGCD(int number1, int number2) {
		return greatestCommonDivisor(Math.max(number1, number2), Math.min(number1, number2));
	}

	public static int greatestCommonDivisor(int a, int b) {
		if (a % b == 0) {
			return b;
		} else {
			return greatestCommonDivisor(b, a % b);
		}
	}
}
