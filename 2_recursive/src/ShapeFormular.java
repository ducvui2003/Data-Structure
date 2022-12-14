
public class ShapeFormular {
	public static void main(String[] args) {
		System.out.println(areaTriangle(5.2, 7.1, 6.3));
		System.out.println(areaRectangle(5, 7));
		System.out.println(areaTrapezoid(5, 7, 5));
		System.out.println(areaParallelogram(5, 7, 6));
		System.out.println(areaCircle(3.5));
	}

	public static double areaTriangle(double ab, double bc, double height) {
		double base = ab + bc;
		double area = (base * height) / 2;
		return area;
	}

	public static double areaRectangle(double a, double b) {
		return a * b;
	}

	public static double areaTrapezoid(double ab, double cd, double height) {
		double sumOfBases = ab + cd;
		double area = (sumOfBases * height) / 2;
		return area;
	}

	public static double areaParallelogram(double ab, double cd, double height) {
		double base = (ab + cd) * 2;
		double area = base * height;
		return area;
	}

	public static double areaCircle(double radius) {
		double area = Math.PI * (radius * radius);
		return area;
	}
}
