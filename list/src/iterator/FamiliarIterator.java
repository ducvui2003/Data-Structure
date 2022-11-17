package iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class FamiliarIterator {
	public static void main(String[] args) {
		Integer[] arrayInt = { 1, 2, 3, 4, 5, 6 };
		Double[] arrayDouble = { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0 };
//		Convert Array to List
//		Chỉ xét được chiều đi
		Iterator<Integer> iters = Arrays.asList(arrayInt).iterator();
//		while (iters.hasNext()) {
//			System.out.println(iters.next());
//		}
//		Familiar
//		Xét đc chiều đi chiều về
		ListIterator<Integer> listInt = Arrays.asList(arrayInt).listIterator();
		ListIterator<Double> listDouble = Arrays.asList(arrayDouble).listIterator();
		System.out.println(listInt.next());
		System.out.println(listInt.next());
		System.out.println(listInt.next());
		System.out.println(listInt.next());
		System.out.println(listInt.next());
		System.out.println(listInt.next());
//		listInt.next();
//		listInt.previous();
//		listInt.previous();
//		System.out.println(listInt.next());
//		System.out.println(listDouble.next());
	}

	public void convertArrayToIterator(int[] array) {

	}
}
