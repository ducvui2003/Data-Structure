package arrayList;

import java.util.ArrayList;
import java.util.Random;
import java.util.StringTokenizer;

import javax.swing.plaf.SliderUI;

public class Award {
	private ArrayList<Customer> lst;

	public Award(String url) {
		super();
		this.lst = loadCustomer(url);

	}

	public static void main(String[] args) {
		Award award = new Award("src\\arrayList\\data.txt");
		System.out.println(award);
		System.out.println("Customer has max score: " + award.getCustomerMaxScore());
		System.out.println("Customer Lucky: \n" + toStringArrayList(award.randomCusAwarded(3)));
		System.out.println("List Customers join in the award: " + award.getLstCustomerJoined());
	}

	public ArrayList<Customer> loadCustomer(String url) {
		ArrayList<Customer> result = new ArrayList<Customer>();
		ArrayList<String> lines = FileUtils.readFile(url);
//		for (int i = 0; i < lines.size(); i++) {
//			String[] stringTokenizer = lines.get(i).split("\t");
//			Customer cus = new Customer(stringTokenizer[0], Integer.parseInt(stringTokenizer[1]), stringTokenizer[2]);
//			result.add(cus);
//		}
		for (String line : lines) {
//			Convert 1 line to 1 string without character 
			StringTokenizer tokens = new StringTokenizer(line, "\t");
			String fullName = "";
			int score = 0;
			String suppermarketID = "";
			int col = 1;
			while (tokens.hasMoreElements()) {
				switch (col) {
				case 1:
					fullName = tokens.nextToken();
					break;
				case 2:
					score = Integer.parseInt(tokens.nextToken());
					break;
				case 3:
					suppermarketID = tokens.nextToken();
					break;
				}
				col++;
			}
			Customer cus = new Customer(fullName, score, suppermarketID);
			result.add(cus);
		}
		return result;
	}

	public ArrayList<Customer> getLst() {
		return lst;
	}

	public void setLst(ArrayList<Customer> lst) {
		this.lst = lst;
	}

	@Override
	public String toString() {
		String result = "Full name\t|\tScore\t|\tSupermarket ID\n";
		for (Customer customer : this.lst) {
			result += customer + "\n";
		}
		return result;
	}

//Find Customer who has max  score in list
	private Customer getCustomerMaxScore() {
		Customer result = this.lst.get(0);
		for (int i = 1; i < this.lst.size(); i++) {
			if (this.lst.get(i).getCode() > result.getCode()) {
				result = this.lst.get(i);
			}
		}
		return result;
	}

//Find n quantity customer get award 
	private ArrayList<Customer> randomCusAwarded(int number) {
		ArrayList<Customer> lstLuckyCustomer = new ArrayList<Customer>();
		if (number < this.lst.size()) {
			int score = 1;
			while (score <= number) {
				randomCusLucky(lstLuckyCustomer);
				score++;
			}
		} else {
			throw new RuntimeException("Quantity customers who has awared must smaller quantity customers of the list");
		}
		return lstLuckyCustomer;
	}

	// Random from 1 to number
	private int randomLst() {
		return new Random().nextInt(this.lst.size());
	}

	// Random Customer Lucky
	private void randomCusLucky(ArrayList<Customer> luckyCusLst) {
		Customer luckyCus = lst.get(randomLst());
		if (luckyCusLst.contains(luckyCus) == true) {
			randomCusLucky(luckyCusLst);
		} else {
			luckyCusLst.add(luckyCus);
		}

	}

	private static String toStringArrayList(ArrayList<Customer> lst) {
		String s = "Full name\t|\tScore\t|\tSupermarket ID\n";
		for (Customer customer : lst) {
			s += customer + "\n";
		}
		return s;
	}

//Print list Customer join in award
	public String getLstCustomerJoined() {
		ArrayList<String> result = new ArrayList<String>();
		for (int i = 0; i < lst.size(); i++) {
			if (result.contains(lst.get(i)) == false) {
				result.add(lst.get(i).getName());
			}
		}
		return result.toString();
	}
}
