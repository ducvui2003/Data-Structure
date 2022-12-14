import java.util.Random;

public class FormularUtil {
	public static void main(String[] args) {
		System.out.println(captchaCreate(4));
		System.out.println(captchaCreate(8));
		System.out.println(getAreaByHeronFormula(10., 16.4, 17.7));
		System.out.println(getAreaByHeronFormula(4, 2, 1));
	}

	public static double getAreaByHeronFormula(double a, double b, double c) {
		double area;
		if (a < b + c && b < a + c && c < a + b) {
			double p = (a + b + c) / 2;
			area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		} else {
			throw new RuntimeException("Input value is not edge of triangle.");
		}
		area = (int) area + ((int) (area % 1 * 100)) * 0.01;
		return area;
	}

	public static String captchaCreate(int length) {
		String capcha = "";
		if (length >= 4 && length <= 8) {
			for (int i = 0; i < length; i++) {
				int rd = randomBetween(1, 3);
				switch (rd) {
				case 1: {
					int rdChar = randomBetween(1, 26);
					capcha = capcha + (char) ('A' + rdChar);
					break;
				}
				case 2: {
					int rdChar = randomBetween(1, 26);
					capcha = capcha + (char) ('a' + rdChar);
					break;
				}
				case 3: {
					int rdChar = randomBetween(0, 9);
					capcha = capcha + (char) ('0' + rdChar);
					break;
				}
				}
			}
		} else {
			throw new RuntimeException("Error");
		}
		return capcha;
	}

	public static int randomBetween(int min, int max) {
		int hieu = max - min;
		Random rd = new Random();
		return rd.nextInt(hieu + 1) + min;
	}

}
