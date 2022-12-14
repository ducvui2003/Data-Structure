package exercises;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
//		int[] array = new int[5];
//		System.out.println("Update value of array: ");
//		update(array);
//		System.out.println(printScreeen(array));
//		System.out.print("Valua need be found?: ");
//		int value = in.nextInt();
//		System.out.println("Value in array: " + findValue(array, value));
//		System.out.println("Sum of array" + sumArray(array));
//		System.out.println("Average of array" + averageArray(array));
		int[] array = { 1, 3, 4, 5 };
// 1 3 8 4 5 
		System.out.println(Arrays.toString(insert(array, 2, 8)));
	}

	private static void update(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print("Value of " + i + " : ");
			array[i] = in.nextInt();
		}
	}

	private static String printScreeen(int[] array) {
		return Arrays.toString(array);
	}

	private static String findValue(int[] array, int value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return array[i] + "";
			}
		}
		return "Not Found";
	}

	private static int sumArray(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	private static int averageArray(int[] array) {
		return sumArray(array) / array.length;
	}

	private static int[] insert(int[] array, int index, int value) {
		int[] newArray = new int[array.length + 1];
		for (int i = 0; i < newArray.length; i++) {
			if (i == index)
				newArray[i] = value;
			else if (i > index) {
//				1 3 4 5
//				1 3 8 4 5
				newArray[i] = array[i - 1];
			} else {
				newArray[i] = array[i];
			}
		}
		return newArray;
	}
}
