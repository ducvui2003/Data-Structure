package exerceses;

public class Ex15 {
	public static void main(String[] args) {
		System.out.printf("%d is a prime number: %s \n" , 1, checkPrime(1));
		System.out.printf("%d is a prime number: %s \n", 2, checkPrime(2));
		System.out.printf("%d is a prime number: %s \n", 4, checkPrime(4));
		System.out.printf("%d is a prime number: %s \n", 9, checkPrime(9));
		System.out.printf("%d is a prime number: %s \n", 11, checkPrime(11));
		
	}

	public static boolean checkPrime(int number) {
		if (number > 1) {
			if (checkPriceNumber(number, number) == 2) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public static int checkPriceNumber(int number, int numberDecrease) {
		if (numberDecrease == 1) {
			return 1;
		} else {
			if (number % numberDecrease == 0) {
				return 1 + checkPriceNumber(number, numberDecrease - 1);
			} else {
				return 0 + checkPriceNumber(number, numberDecrease - 1);
			}

		}
	}
}
