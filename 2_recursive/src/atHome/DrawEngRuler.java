package atHome;

public class DrawEngRuler {
	public static void main(String[] args) {
		drawRuler(3, 4);
	}

	public static void drawRuler(int nInches, int majorLength) {
		drawLine(majorLength, 0);
		for (int i = 1; i < nInches; i++) {
			drawInterval(majorLength - 1);//recursive
			drawLine(majorLength, i);
		}
/*	drawRuler (3,4)
 * 	---- 0
 * 	-
 * 	--
 * 	-
 * 	---
 * 	-
 * 	--
 * 	-
 * 	---- 1
 * 	-
 * 	--
 * 	-
 * 	---
 * 	-
 * 	--
 * 	-
 * 	---- 2
 * */
	}

	private static void drawInterval(int centrelLength) {
		if (centrelLength >= 1) {
			drawInterval(centrelLength - 1);//recursive
			drawLine(centrelLength);
			drawInterval(centrelLength - 1);//recursive
		}
/*	drawInterval (3)
 * 	-
 * 	--
 * 	-
 * 	---
 * 	-
 * 	--
 * 	-
 * 	----
 * 	-
 * 	--
 * 	-
 * 	---
 * 	-
 * 	--
 * 	-
 * 
 * */		
	}

	private static void drawLine(int tickLength, int tickLabel) {
		for (int i = 0; i < tickLength; i++) {
			System.out.print("-");
		}
		if (tickLabel >= 0) {
			System.out.print(" " + tickLabel);
		}
		System.out.print("\n");
/*	drawLine (3,2)
 * 	---- 3
 * 	
 * */
	}

	private static void drawLine(int tickLength) {
		drawLine(tickLength, -1);
/*	drawLine (2)
 * 	---
 * 
 * */
	}
}
