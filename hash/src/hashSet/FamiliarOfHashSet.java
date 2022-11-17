package hashSet;

import java.util.HashSet;

import java.util.Set;

public class FamiliarOfHashSet {
	public static void main(String[] args) {
//HashSet only contain object 1 time in list
		Set<String> setString = new HashSet<String>();
//Add

		setString.add("1");
		setString.add("3");
		setString.add("5");
		setString.add("9");
		setString.add("10");
		setString.add("11");
		setString.add("12");
		setString.add("52");
//		setString.add("5");
//		setString.add("11");
//		setString.add("12");
//		setString.add("12");
		for (int i = 0; i < setString.toArray().length; i++) {
			System.out.println(setString.toArray()[i] + " :" + setString.toArray()[i].hashCode());
		}
		System.out.println(setString);// Print from bottom to top in list hash set
//remove
		setString.remove("10");
//		System.out.println(setString);
	}
}
