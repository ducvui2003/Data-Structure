import java.util.Arrays;

public class InsertSort {
	private static void swapValueOf2Index(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String[] args) {
		int[] array = { 34, 15, 17, 35, 78, 20, 11, 9, 34, 72 };
		System.out.println(Arrays.toString(insertionSortRecursive(array, 0)));
	}

	// Recursive function to sort an array using
	// insertion sort
	// sap xep tu tren xuong i tang dan
	public static int[] insertSortRecursive(int[] a, int i) { // mac dinh i =1
		if (i < a.length) {
			int j;
			for (j = i - 1; (j >= 0 && a[j] > a[i]); j--) {
				swapValueOf2Index(a, i, j);
				insertSortRecursive(a, i + 1);

			}
		}
		return a;
	}

	// sap xep nguoc tu duoi len n giam dan
	public static int[] insertionSortRecursive(int arr[], int n) {
		// Base case
		if (n <= 1)
			return arr;
		// Sort first n-1 elements
		insertionSortRecursive(arr, n - 1);
		// Insert last element at its correct position
		// in sorted array.
		int last = arr[n - 1];
		int j = n - 2;
		/*
		 * Move elements of arr[0..i-1], that are greater than key, to one position
		 * ahead of their current position
		 */
		while (j >= 0 && arr[j] > last) {
			arr[j + 1] = arr[j];
			j--;
		}
		arr[j + 1] = last;
		return arr;
	}

	/* Function to sort an array using insertion sort */
	public static int[] insertionSort_nonRecursive(int[] arr) {
		int i, key, j;
		for (i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;
			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one position
			 * ahead of their current position
			 */
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		return arr;
	}
}
