package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class FamiliarSet {
	public static void main(String[] args) {
		Set<String> hashSetString = new HashSet<String>();
		hashSetString.add("Abc");
		System.out.println("Abc: "+"Abc".hashCode());
		hashSetString.add("ABC");
		System.out.println("ABC: "+"ABC".hashCode());
		hashSetString.add("abc");
		System.out.println("abc: "+"abc".hashCode());
		System.out.println(hashSetString);
		
		Set<String> treeSetString = new TreeSet<String>();
		treeSetString.add("Mot");
		treeSetString.add("Hai");
		treeSetString.add("Ba");
		System.out.println("Mot".compareTo("Hai"));
//		"Mot" > "Hai" => [Hai, Mot]
		System.out.println("Mot".compareToIgnoreCase("mot"));
		System.out.println(treeSetString);
	}
}
