
public class Ex {
	public static int[][] getSubArray(int[][] array, int indexRemoveRow, int indexRemoveCol) {
		int[][] arraySub = new int[array.length - 1][array[0].length - 1];
		int row = 0;
		int col = 0;
		for (int i = 0; i < arraySub.length; i++) {
			if (row == indexRemoveRow) {
				row = row + 1;
			}
			row++;
			for (int j = 0; j < arraySub[i].length; j++) {
				if (col == indexRemoveCol) {
					col = col + 1;
				}
				arraySub[i][j] = array[row][col];
				col++;
			}
		}
		return arraySub;
	}

	public static void main(String[] args) {
		int[][] array = { { 1, 2, 3, 4 }, { 3, 4, 5, 6 }, { 6, 7, 8, 9 } };
		System.out.println(getSubArray(array, 2, 3));
	}
}
