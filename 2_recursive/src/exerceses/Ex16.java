package exerceses;

public class Ex16 {
	public static void main(String[] args) {
		System.out.println("* Ex 16 S(n) = 1 + 2 + 3 + ... + n - 1 + n, with n=1000: \n-->S(n)=" + eX16(1000));
		System.out
				.println("* Ex 17 S(n) = 1^2 + 2^2 + 3^2 + ... + (n-1)^2 + n^2, with n = 100: \n-->S(n)=" + eX17(100));
		System.out.println("Ex 18 S(n) = 1 + 1/2 + 1/3 + ... + 1/n, with n=100: \n--> S(n)=" + eX18(100));
		System.out.println("Ex 19 S(n) = 1/2 + 1/4 + ... + 1/2n, with n=100: \n-->S(n)=" + eX19(100));
		System.out.println("Ex 20 S(n) = 1 + 1/3 + 1/5 + ... + 1/(2n+1), with n=100: \n-->S(n)=" + eX20(100));
		System.out.println("Ex 21 S(n) = 1/(1*2) + 1/(2*3) + 1/( n(*n-1) ), with n=100: \n-->S(n)=" + eX21(100));
		System.out.println("Ex 22 S(n) = 1/2 + 2/3 + 3/4 + ... + n/(n+1), with n=100 \n-->S(n)=" + eX22(100));
		System.out.println(
				"Ex 23 S(n) = S(n) = 1/2 + 3/4 + 5/6 + ... + (2n+1)/(2n+2), with n=100 \n-->S(n)=" + eX23(100));
		System.out.println("Ex 24 T(n) = 1*2*3*.....*n, with n=100 \n-->T(n)=" + eX24(10));
		System.out.println("Ex 25 T(x,n) = x^n, with x=3, n=7 \n-->T(n)=" + eX25(3, 7));
		System.out.println("Ex 26 S(n) = 1 + 1.2 + 1.2.3 + .... + 1.2.3....n, with n=5 \n-->S(n)=" + eX26b(5));
		System.out.println("Ex 27 S(x,n) = x + x^2 + x^3 + ... + x^n, with x=3 n=5 \n-->S(n)=" + eX27(3, 5));
		System.out.println("Ex 28 S(x,n) = x^2 + x^4 +.... + x^2n, with x=3 n=5 \n-->S(n)=" + eX28(3, 5));
		System.out.println("Ex 29 S(x,n) = x + x^3 + x^5 +....+ x^(2n+1), with x=3 n=5 \n-->S(n)=" + eX29(3, 5));
		System.out
				.println("Ex 30 S(n) = 1 + 1/(1+2) + 1/(1+2+3) + ... + 1/(1+2+3+...+n), with n=5 \n-->S(n)=" + eX30(5));
		System.out.println(
				"Ex 31 S(x,n) = x + (x^2)/2! + (x^3)/3! + ... + (x^n)/n!, with x=3, n=5 \n-->S(n)=" + eX31(3, 5));
		System.out.println(
				"Ex 32 S(x,n) = 1 + (x^2)/2! + (x^4)/4! + ... + (x^2n)/(2n)!, with x=3, n=5 \n-->S(n)=" + eX32(3, 5));
		System.out.println("Uoc cua 100 la: " + eX33(100));

	}

	public static int eX16(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n + eX16(n - 1);
		}
	}

	public static int eX17(int n) {
		if (n == 1) {
			return 1 * 2;
		} else {
			return n * 2 + eX17(n - 1);
		}
	}

	public static double eX18(int n) {
		if (n == 1) {
			return 1.0;
		} else {
			return (1.0 / n) + eX18(n - 1);
		}
	}

	public static double eX19(int n) {
		if (n == 1) {
			return 1.0 / 2;
		} else {
			return (1.0 / (2 * n)) + eX19(n - 1);
		}
	}

	public static double eX20(int n) {
		if (n == 0) {
			return 1.0;
		} else {
			return (1.0 / (2 * n + 1)) + eX20(n - 1);
		}
	}

	public static double eX21(int n) {
		if (n == 2) {
			return 1.0 / (2 * (2 - 1));
		} else {
			return 1.0 / (n * (n - 1)) + eX21(n - 1);
		}
	}

	public static double eX22(int n) {
		if (n == 1) {
			return n / (n + 1.0);
		} else {
			return n / (n + 1.0) + eX22(n - 1);
		}
	}

	public static double eX23(int n) {
		if (n == 0) {
			return (2 * n + 1.0) / (2 * n + 2.0);
		} else {
			return (2 * n + 1.0) / (2 * n + 2.0) + eX23(n - 1);
		}
	}

	public static int eX24(int n) {
		if (n == 1 || n == 0) {
			return 1;
		} else {
			return n * eX24(n - 1);
		}
	}

	public static int eX25(int x, int n) {
		if (n == 0) {
			return 1;
		} else {
			return x * eX25(x, n - 1);
		}
	}

	public static int eX26a(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * eX26a(n - 1);
		}
	}

	public static int eX26b(int n) {
		if (n == 1) {
			return 1;
		} else {
			return eX26a(n) + eX26b(n - 1);
		}
	}

	public static int eX27(int x, int n) {
		if (n == 1) {
			return eX25(x, n);

		} else {
			return eX25(x, n) + eX27(x, n - 1);
		}
	}

	public static int eX28(int x, int n) {
		if (n == 1) {
			return eX25(x, 2 * n);
		} else {
			return eX25(x, 2 * n) + eX28(x, n - 1);
		}
	}

	public static int eX29(int x, int n) {
		if (n == 0) {
			return eX25(x, 2 * n + 1);
		} else {
			return eX25(x, 2 * n + 1) + eX29(x, n - 1);
		}
	}

	public static double eX30(int n) {
		if (n == 1) {
			return 1.0 / eX16(n);
		} else {
			return 1.0 / eX16(n) + eX30(n - 1);
		}
	}

	public static double eX31(int x, int n) {
		if (n == 1) {
			return (eX25(x, n) * 1.0) / eX24(n);
		} else {
			return (eX25(x, n) * 1.0) / eX24(n) + eX31(x, n - 1);
		}
	}

	public static double eX32(int x, int n) {
		if (n == 1) {
			return (eX25(x, 2 * n) * 1.0) / eX24(2 * n);
		} else {
			return (eX25(x, 2 * n) * 1.0) / eX24(2 * n) + eX32(x, n - 1);
		}
	}

	public static int eX33(int number) {
		if (number != 0) {
			return eX33Sub(number, 1, 1);
		} else {
			throw new RuntimeException("Khong co uoc le lon nhat");
		}
	}

	public static int eX33Sub(int number, int i, int result) {
		if (i <= number) {
			if (number % i == 0 && i % 2 != 0) {
				result = i;
				result = eX33Sub(number, i + 1, result);
			} else {
				result = eX33Sub(number, i + 1, result);
			}
		}
		return result;
	}
}
