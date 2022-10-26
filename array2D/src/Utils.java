import java.util.Random;

public class Utils {
	public static void main(String[] args) {
		int matrix1[][] = new int[10][9];
		int matrix2[][] = new int[10][9];
		
		fillValue(matrix1);
		fillValue(matrix2);
		System.out.println(printfArray2D(matrix1));
		System.out.println(printfArray2D(matrix2));
		System.out.println(getSize(matrix1));
		System.out.println(search(matrix1, 2));
	
		System.out.println(printfArray2D(sum2Matrix(matrix1, matrix2)));
		System.out.println(printfArray2D(multipMatrixAndNumber(matrix1, 3)));
	}

	public static int getSize(int[][] array) {
		int count = 0;
		for (int[] x : array) {
			for (int y : x) {
				count += 1;
			}
		}
		return count;
	}

	public static void fillValue(int[][] array) {
		Random rd = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rd.nextInt(10);
			}
		}

	}

	public static String printfArray2D(int[][] array2D) {
		String s = "";
//		Array2D la cac  mang ma moi phan tu la 1 array
		for (int[] x : array2D) {
			for (int y : x) {
				s += y + "\t";
			}
			s += "\n";
		}
		return s;
	}

	public static boolean search(int[][] array2D, int target) {
		for (int[] x : array2D) {
			for (int y : x) {
				if (y == target) {
					return true;
				}
			}
		}
		return false;
	}

	public static int getColumn(int[][] array) {
		return array[0].length;
	}

	public static int[][] sum2Matrix(int[][] matrix1, int[][] matrix2) {
		if (matrix1.length == matrix2.length && getColumn(matrix1) == getColumn(matrix2)) {
			int[][] sumMatrix = new int[matrix1.length][getColumn(matrix1)];
			for (int i = 0; i < matrix1.length; i++) {
				for (int j = 0; j < matrix1[i].length; j++) {
					sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
				}
			}
			return sumMatrix;
		} else {
			throw new RuntimeException("Error");
		}
	}

	public static int[][] multipMatrixAndNumber(int[][] matrix, int number) {
		int[][] matrixMultip = new int[matrix.length][getColumn(matrix)];
		for (int i = 0; i < matrixMultip.length; i++) {
			for (int j = 0; j < matrixMultip[i].length; j++) {
				matrixMultip[i][j] = number * matrix[i][j];
			}
		}
		return matrixMultip;
	}
}
