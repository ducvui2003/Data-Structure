import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] array = { 6, 1, 4, 9, 0, 3, 5, 2, 7, 8 };
		quickSort2(array, 0, array.length - 1);
		System.out.println(toString(array));
	}

	public static String toString(int[] array) {
		return Arrays.toString(array);
	}

	public static void quickSortRecursive(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

	public static void quickSort(int[] array, int left, int right) {
		int low = left;
		int high = right;
		int mid = (left + right) / 2;
		int key = array[mid]; // point to compare

		while (low <= high) {
			// Tìm phần tử lớn hơn key, +1 cho đến khi tìm ra (Tìm phần tử lớn nhất bên trái
			// key)
			while (array[low] < key) {
				low++;
			}
			// Tìm phần tử bé hơn key, +1 cho đến khi tìm ra (Tìm phần tử bé nhất bên phải
			// key)
			while (array[high] > key) {
				high--;
			}
			if (low <= high) {
				swap(array, low, high);
				low++;
				high--;
			}
		}
//		duyệt mảng bên trái
		if (left < high) {
//			high lúc này đã giảm bằng vị trí cuối cùng của dãy bên trái
			quickSort(array, left, high);
		}
//		Duyệt mảng bên phải
		if (low < right) {
//			right lúc này đã tăng bằng vị trí đầu của dãy bên phải
			quickSort(array, low, right);
		}
	}

	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void quickSort2(int[] array, int low, int high) {
		int left = low;
		int right = high;
		int pivot = array[low];
		while (left >= right) {
			while (array[right] > pivot) {
				right--;
			}
			swap(array, right, left);
			while (array[left] < pivot) {
				left++;
			}
			swap(array, left, right);
		}
		array[left] = pivot;
		if (left < pivot - 1) {
			quickSort2(array, left, pivot - 1);
		}
		if (pivot + 1 < right) {
			quickSort2(array, pivot + 1, right);
		}
	}
}
