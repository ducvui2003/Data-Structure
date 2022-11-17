package planetsList;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.Random;

import javax.management.RuntimeErrorException;

public class ListIterPlanet {
	private ListIterator<Planets> lstPla = null;

	public ListIterPlanet(Planets[] arrayPla) {
		lstPla = Arrays.asList(arrayPla).listIterator();
	}

	public static void main(String[] args) {
		Planets mercury = new Planets("Sao Thuy", "Mercury", 58.646, 0.075, 0.330);
		Planets venus = new Planets("Sao Kim", "Venus", 243.686, 0.46, 4.869);
		Planets earth = new Planets("Trai Dat", "Earth", 0.997, 0.51, 5.937);
		Planets jupiter = new Planets("Sao Moc", "Jupiter", 0.414, 61.4, 1899);
		Planets[] arrayPlanets = { earth, venus, mercury, jupiter };
		ListIterPlanet lstPlanets = new ListIterPlanet(arrayPlanets);
//		System.out.println(lstPlanets);
		System.out.println("The largest planet is: " + lstPlanets.largestAreaPlanet());
		System.out.println("Details of the Earth: " + lstPlanets.searchPlanet("Trai Dat"));
		System.out.println("Random planets of lists: " + lstPlanets.randomPlanet());
		System.out.println("Compare round with the earth: " + lstPlanets.compareRound("Sao Kim"));
	}

	public String toString() {
		refesh();
		String result = "";
		while (lstPla.hasNext()) {
			result += lstPla.next() + "\n";
		}
		return result;
	}

	public void refesh() {
		while (lstPla.hasPrevious()) {
			lstPla.previous();
		}
	}

	public Planets largestAreaPlanet() {
		refesh();
		Planets point = lstPla.next();
		while (lstPla.hasNext()) {
			Planets compare = lstPla.next();
			if (point.getArea() < compare.getArea()) {
				point = compare;
			}
		}
		return point;
	}

	public Planets searchPlanet(String name) {
		refesh();
		String naMe = name.trim();
		while (lstPla.hasNext()) {
			Planets point = lstPla.next();
			if (point.getNameEn().equalsIgnoreCase(naMe) || point.getNameVi().equalsIgnoreCase(naMe)) {
				return point;
			}
		}
		return null;
	}

	public Planets randomPlanet() {
		refesh();
		Planets point = lstPla.next();
		Random rd = new Random();
		int randomNumber = rd.nextInt(getSizeIterator());
		for (int i = 0; i < randomNumber; i++) {
			point = lstPla.next();
		}
		return point;
	}

	public boolean compareRound(String planets) {
		Planets planet = searchPlanet(planets);
		Planets earth = searchPlanet("Earth");
		if (planet == null) {
			throw new RuntimeException("Not find the planet which you want");
		} else {
			if (planet.getRound() > earth.getRound()) {
				return false;
			} else {
				return true;
			}
		}
	}

	public int getSizeIterator() {
		refesh();
		int count = 0;
		while (lstPla.hasNext()) {
			lstPla.next();
			count += 1;

		}
		refesh();
		return count;
	}
}
