import java.util.Arrays;

public class SearchAlthgorithms {
	public static void main(String[] args) {
		int[] array1 = new int[] { 4, 6, 7, 5, 8, 9, 10, 12, 15 };
		int[] array2 = new int[] { 23, 45, 67, 78, 92, 101, 120, 135 };
		System.out.println("7 in " + Arrays.toString(array1) + "(Recursive): " + binarySearchRecursive(array1, 7));
		System.out.println("7 in " + Arrays.toString(array1) + ": " + binarySearchNonRecursive(array1, 7));
		System.out.println("-----------------------------");
		System.out.println("5 in " + Arrays.toString(array1) + "(Array not sorted)(Recursive): " + binarySearchRecursive(array1, 5));
		System.out.println("5 in " + Arrays.toString(array1) + "(Array not sorted): " + binarySearchNonRecursive(array1, 5));
		System.out.println("-----------------------------");
		System.out.println("120 in " + Arrays.toString(array2) + "(Recursive): " + linearSearchRecursive(array2, 120));
		System.out.println("120 in " + Arrays.toString(array2) + ": " + linearSearchNonRecursive(array2, 120));
		System.out.println("-----------------------------");
		System.out.println("8 in " + Arrays.toString(array1) + "(Recursive): " + linearSearchRecursive(array2, 8));
		System.out.println("8 in " + Arrays.toString(array1) + ": " + linearSearchNonRecursive(array2, 8));
	}

// Binary Search
	public static boolean binarySearchNonRecursive(int[] array, int target) {
		int low = 0;
		int high = array.length - 1;
		// Condition to continue
		while (low < high) {
			int mid = (high + low) / 2;
			if (target == array[mid]) {
				return true;
			}
			if (target < array[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return false;
	}

	public static boolean binarySearchRecursive(int[] array, int target) {
		return binarySearchRecursiveTemp(array, target, 0, array.length - 1);
	}

	public static boolean binarySearchRecursiveTemp(int[] array, int target, int low, int high) {
		if (low >= high) {
			return false;
		} else {
			int mid = (high + low) / 2;
			if (target == array[mid]) {
				return true;
			} else {
				if (target < array[mid]) {
					return binarySearchRecursiveTemp(array, target, low, mid - 1);
				} else {
					return binarySearchRecursiveTemp(array, target, mid + 1, high);
				}
			}
		}
	}

//	Linear Search
	public static boolean linearSearchRecursive(int[] array, int target) {
		return linearSearchRecursiveTemp(array, target, 0);
	}

	public static boolean linearSearchRecursiveTemp(int[] array, int target, int i) {
		if (i == array.length) {
			return false;
		} else {
			if (target == array[i]) {
				return true;
			} else {
				return linearSearchRecursiveTemp(array, target, i + 1);
			}

		}
	}

	public static boolean linearSearchNonRecursive(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return true;
			}
		}
		return false;
	}
}
