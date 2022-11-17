package minesweeperGame;

import java.util.Random;

public class MinesweeperGame {
	private int numBoom;
	private int row;
	private int col;
	private int[][] matrix;

	public MinesweeperGame(int numBoom, int row, int col) {
		super();
		this.numBoom = numBoom;
		this.row = row;
		this.col = col;
		this.matrix = new int[this.row][this.col];
		setBoomRandomMatrix();
		createMap();
		changeBoom();
	}

	public static void main(String[] args) {
		System.out.println(1);
		MinesweeperGame game = new MinesweeperGame(5, 5, 5);
		System.out.println(game.printMap());
	}

	private void setBoomRandomMatrix() {
		while (this.numBoom > 0) {
			setBoomRandom();
			this.numBoom--;
		}
	}

	private void setBoomRandom() {
//		Random Index 
		Random rd = new Random();
		int row = rd.nextInt(this.row);
		int col = rd.nextInt(this.col);
//		Set Boom for Random Index (check value current in this)
		if (this.matrix[row][col] == -1) {
			setBoomRandom();
		} else {
			this.matrix[row][col] = -1;
		}
	}

	public int[][] createMap() {
		Random rd = new Random();
		if (this.numBoom < getSize()) {
			for (int i = 0; i < this.matrix.length; i++) {
				for (int j = 0; j < this.matrix[i].length; j++) {
					if (this.matrix[i][j] != -1) {
						this.matrix[i][j] = rd.nextInt(1);
					}
				}
			}
			return this.matrix;
		} else {
			throw new RuntimeException("Error");
		}
	}

	public int getSize() {
		int count = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				count = count + 1;
			}
		}
		return count;
	}

	public String printMap() {
		String s = "";
		for (int i = 0; i < this.matrix.length; i++) {
			for (int j = 0; j < this.matrix[i].length; j++) {
				s += this.matrix[i][j] + "\t";
			}
			s += "\n";
		}
		return s;
	}

	public void changeBoom() {
		for (int i = 1; i < matrix.length - 1; i++) {
			for (int j = 1; j < matrix[i].length - 1; j++) {
				if (matrix[i][j] != -1) {
					if (countBoomAround(i, j) != 0) {
						matrix[i][j] = countBoomAround(i, j);
					}
				}
			}
		}
	}

	public int countBoomAround(int row, int col) {
		int boom = 0;
		for (int i = row - 1; i <= row + 1; i++) {
			for (int j = col - 1; j <= col + 1; j++) {
//				Don't count boom in center 3x3
				if (i == row && j == col) {
					boom += 0;
				} else {
					if (matrix[i][j] == -1) {
						boom += 1;
					} else {
						boom += 0;
					}
				}
			}
		}
		return boom;
	}
}
