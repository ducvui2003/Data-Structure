package exercises;

public class Max {
	public static int max(int arr[]) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	static int appear(int arr[]) {
		int appear = 0;
		for (int j = 0; j < arr.length; j++) {
			if (max(arr) == arr[j]) {
				appear++;
			}
		}
		return appear;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 10, 7, 10, 2, 10, 10 };
		int result = appear(arr);
		int maxValue = max(arr);
		System.out.println("phan tu lon nhat: "+ maxValue);
		System.out.println("so lan phan tu lon nhat xuat hien: "+result);
	}
}
