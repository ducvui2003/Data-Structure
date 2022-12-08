package arrayList;

import java.util.ArrayList;

public class FamiliarArrayList {
	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Le Anh Duc");
		nameList.add("Trinh Tran Sy Dong");
		nameList.add("Le Thi Hanh Duyen");
//	Get Size ArrayList => use for
		System.out.println(nameList.size());
//	 Check contain obj
		System.out.println(nameList.contains("Le Anh Duc"));
		for (int i = 0; i < nameList.size(); i++) {
			System.out.println(nameList.get(i));
		}
		System.out.println();
//	Remove obj
		nameList.remove(1);
		for (int i = 0; i < nameList.size(); i++) {
			System.out.println(nameList.get(i));
		}

	}
}
