import java.util.Arrays;

public class SortAlthgorithms {
	public static void main(String[] args) {
		int[] array = { 34, 15, 17, 35, 78, 20, 11, 9, 34, 72 };
		System.out.println(Arrays.toString(selectionSort_MinNonRecursive(array)));
		System.out.println(Arrays.toString(selectionSort_MinRecursive(array, 0)));
		System.out.println(Arrays.toString(bubbleSort_MinNonRecursive(array)));
		System.out.println(Arrays.toString(bubbleSort_MinRecursive(array, 0)));
		System.out.println(Arrays.toString(insertSort_MinNonRecursive(array)));
		System.out.println(Arrays.toString(insertSort_MinRecursive(array, 1)));
		int i = 0;
		int j = 0;
		int z = 0;
		System.out.println(i++);
		System.out.println(i);
		System.out.println(++j);
		System.out.println(z + 1);
	}

	private static void swapValueOf2Index(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

//Selection Sort Algorithm
	public static int[] selectionSort_MinNonRecursive(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int minValue = array[i];
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < minValue) {
					minValue = array[j];
					minIndex = j;
				}
			}
			if (minValue != array[i]) {
				swapValueOf2Index(array, i, minIndex);
			}

		}
		return array;
	}

	public static int[] selectionSort_MinRecursive(int[] array, int stepNum) {
//		Condition stop
		if (stepNum == array.length - 1) {
			return array;
		} else {
//			Find min value and swap index 
			for (int i = 0; i < array.length; i++) {
				int minValue = array[i];
				int minIndex = i;
				for (int j = i + 1; j < array.length; j++) {
					if (array[j] < minValue) {
						minValue = array[j];
						minIndex = j;
					}
				}
				swapValueOf2Index(array, i, minIndex);
			}
		}
		return selectionSort_MinRecursive(array, stepNum + 1);
	}

//	Bubble Sort
	public static int[] bubbleSort_MinNonRecursive(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					swapValueOf2Index(array, j, j + 1);
				}
			}
		}
		return array;
	}

	public static int[] bubbleSort_MinRecursive(int[] array, int n) {
		if (1 == array.length - 1 - n) {
			return array;
		} else {
			for (int j = 0; j < array.length - 1 - n; j++) {
				if (array[j] > array[j + 1]) {
					swapValueOf2Index(array, j, j + 1);
				}
			}
		}
		return bubbleSort_MinRecursive(array, n + 1);
	}

//	Insert Sort
	public static int[] insertSort_MinNonRecursive(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int point = array[i];
			int index = i;
			while (index > 0 && array[index - 1] > point) {
				array[index] = array[index - 1];
				index--;
			}
			array[index] = point;
		}
		return array;
	}

	public static int[] insertSort_MinRecursive(int[] array, int i) {
		if (i == array.length) {
			return array;
		} else {
			int point = array[i];
			int index = i;
			while (index > 0 && array[index - 1] > point) {
				array[index] = array[index - 1];
				index--;
			}
			array[index] = point;
			return insertSort_MinRecursive(array, i + 1);
		}
	}
}
