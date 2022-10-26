import java.util.Arrays;

public class SortAlthgorithms {
	public static void main(String[] args) {
		int[] array = { 34, 15, 17, 35, 78, 20, 11, 9, 34, 72 };
		System.out.println(Arrays.toString(selectionSort_MinNonRecursive(array)));
		System.out.println(Arrays.toString(selectionSort_MinRecursive(array)));
		System.out.println(Arrays.toString(bubbleSort_MinNonRecursive(array)));
		System.out.println(Arrays.toString(bubbleSort_MinRecursive(array)));
		System.out.println(Arrays.toString(insertSort_MinNonRecursive(array)));
		System.out.println(Arrays.toString(insertSort_MinNonRecursive(new int[] { 18, 0 })));
		System.out.println(Arrays.toString(insertSort_MinRecursive(array, 1)));
		System.out.println(Arrays.toString(insertSortRecursive(array, 0)));
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
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			if (array[i] != array[minIndex]) {
				swapValueOf2Index(array, i, minIndex);
			}
		}
		return array;
	}

	public static int[] selectionSort_MinRecursive(int[] array) {
		return selectionSort_MinRecursiveTemp(array, 0);
	}

	public static int[] selectionSort_MinRecursiveTemp(int[] array, int stepNum) {
//		Condition stop
		if (stepNum == array.length) {
			return array;
		} else {
			int j = stepNum;
//			Find min value and swap index 
			for (int i = stepNum + 1; i < array.length; i++) {
				if (array[j] < array[stepNum]) {
					j = i;
				}
			}
			if (array[j] == array[stepNum]) {
				swapValueOf2Index(array, j, stepNum);
			}
		}
		return selectionSort_MinRecursiveTemp(array, stepNum + 1);
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

	public static int[] bubbleSort_MinRecursive(int[] array) {
		return bubbleSort_MinRecursiveTemp(array, 0);
	}

	public static int[] bubbleSort_MinRecursiveTemp(int[] array, int n) {
		if (n >= array.length) {
			return array;
		} else {
			for (int j = 0; j < array.length - 1 - n; j++) {
				if (array[j] > array[j + 1]) {
					swapValueOf2Index(array, j, j + 1);
				}
			}
		}
		return bubbleSort_MinRecursiveTemp(array, n + 1);
	}

//	Insert Sort
	public static int[] insertSort_MinNonRecursive(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int point = array[i];
			int index = i;
			while (index > 0 && array[index - 1] > point) {
				array[index] = array[index - 1];
				--index;
			}
			array[index] = point;
		}
		return array;
	}

	public static int[] insertSort_MinRecursive(int[] array, int i) {
		if (i >= array.length) {
			return array;
		} else {
			int point = array[i];
			int index = i;
			while (index > 0 && array[index - 1] > point) {
				array[index] = array[index - 1];
				--index;
			}
			array[index] = point;
			return insertSort_MinRecursive(array, i + 1);
		}
	}

//Sort tu tren xuong duoi
	public static int[] insertSortRecursive(int[] array, int i) {
		if (i < array.length) {
			for (int j = i - 1; j >= 0 && array[j] > array[i]; j--) {
//				Swap
				swapValueOf2Index(array, i, j);
				insertSortRecursive(array, i + 1);
			}
		}
		return array;
	}

//Sort tu duoi len tren
	public static int[] insertionSortRecursive(int[] array, int n) {
		if (n <= 1) {
			return array;
		}

		insertionSortRecursive(array, n - 1);

		int last = array[n - 1];
		int j = n - 2;

		while (j >= 0 && array[j] > last) {
			array[j + 1] = array[j];
			j--;
		}
		array[j + 1] = last;
		return array;
	}

}
