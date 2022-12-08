package atHome;

public class TowerHaNoi {
	public static void main(String[] args) {
		System.out.println(haNoiTower(3, "a", "b", "c"));
	}

	public static String haNoiTower(int dics, String beginColumn, String midleColumns, String endColumns) {
		if (dics == 1) {
			return beginColumn + " to " + endColumns;
		} else {
			return haNoiTower(dics - 1, beginColumn, endColumns, midleColumns) + "\n" + beginColumn + " to "
					+ endColumns + "\n" + haNoiTower(dics - 1, midleColumns, beginColumn, endColumns);
		}
	}
}
