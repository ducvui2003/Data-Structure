package map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class FamiliarOfMap {
	public static void main(String[] args) {
		HashMap<String, String> hashMapString = new HashMap<>();
		hashMapString.put("Ten", "4");
		hashMapString.put("Duc", "1");
		hashMapString.put("Le", "2");
		hashMapString.put("Anh", "3");
		System.out.println(hashMapString);
		System.out.println(hashMapString.size());
		System.out.println(hashMapString.containsKey("Duc"));
		System.out.println(hashMapString.containsValue("0"));
		System.out.println(hashMapString.get("Duc"));// return value that mapping with key
		System.out.println(hashMapString.values());// return array that contain all key in hash map
		System.out.println(hashMapString.keySet());// return set that contain all sorted value in hash map
		System.out.println(hashMapString.entrySet());// return set that contain sorted key and value mapping in hash map
		hashMapString.remove("Ten");
		System.out.println(hashMapString);
		hashMapString.put("Anh", "4");
		hashMapString.put("Ba", "4");
		System.out.println(hashMapString);
	
		int[] array = { 1, 2, 3, 4, 6, 7, 8 };
		int[] array2 = { 1, 2, 5, 3, 7, 8, 3, 5, 8 };
		System.out.println(Arrays.toString(insertValue(array, 5)));
		System.out.println(findMaxSecond(array2));
		System.out.println(total(10));
	}

	public static int[] insertValue(int[] array, int value) {
		int[] newArray = new int[array.length + 1];
		int i, j, found;
		i = 0;
		j = 0;
		found = 0;
		while (i < array.length) {
			if (value < array[i] && found == 0) {
				newArray[j] = value;
				found = 1;
			} else {
				newArray[j] = array[i];
				i++;
			}
			j++;
		}
		return newArray;
	}

	public static int findMaxSecond(int[] array) {
		int max1 = array[0];
		int max2 = array[0];
		int i = 0;
		while (i < array.length) {
			if (array[i] > max1) {
				max1 = array[i];
			}
			i++;
		}
		i = 0;
		while (i < array.length) {
			if (array[i] != max1) {
				if (array[i] > max2) {
					max2 = array[i];
				}
			}
			i++;
		}
		return max2;
	}

	public static int total(int number) {
		if (number == 1) {
			return number;
		} else {
			int sum = number + total(number - 1);
			return sum;
		}
	}
}
