package exercises;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		int[] array = { 0, 1, 3, 4, 5 };
		System.out.println(Arrays.toString(insertValueToArray(array, 2, 2)));
		System.out.println(Arrays.toString(deleteIndexInArray(array, 2)));
	}

	public static int[] insertValueToArray(int[] array, int index, int value) {
		int[] arrayNew = new int[array.length + 1];
		for (int i = 0; i < index; i++) {
			arrayNew[i] = array[i];
		}
		for (int i = index + 1; i < arrayNew.length; i++) {
			arrayNew[i] = array[i - 1];
		}
		arrayNew[index] = value;
		return arrayNew;
	}

	public static int[] deleteIndexInArray(int[] array, int index) {
		int[] arrayNew = new int[array.length - 1];
		for (int i = 0; i < index; i++) {
			arrayNew[i] = array[i];
		}
		for (int i = index; i < arrayNew.length; i++) {
			arrayNew[i] = array[i + 1];
		}
		return arrayNew;
	}
}
