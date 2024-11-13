//Jason Wu 114474379
package jason.Arrays;

public class CheckerBoard {

	public static void main(String[] args) {
		int[][] checkerBoard = new int[8][8];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				double randomValue = Math.random();
				if (randomValue > 0.5)
					checkerBoard[i][j] = 1;
			}
		}
		displayBoard(checkerBoard);

		checkHorizontal(checkerBoard);
		checkVertical(checkerBoard);
		checkDiagonal(checkerBoard);

	}

	public static void displayBoard(int[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}

	public static void checkHorizontal(int[][] board) {
		for (int i = 0; i < board.length; i++) {
			int value = board[i][0];
			for (int j = 1; j < board.length; j++) {
				if (board[i][j] != value)
					break;
				if (j == board.length - 1)
					System.out.println("All" + value + "'s on " + (i + 1) + " row");

			}
		}
	}

	public static void checkVertical(int[][] board) {
		for (int i = 0; i < board.length; i++) {
			int value = board[0][i];
			for (int j = 1; j < board.length; j++) {
				if (board[j][i] != value)
					break;
				if (j == board.length - 1)
					System.out.println("All" + value + "'s on " + (i + 1) + " column");
			}
		}
	}

	public static void checkDiagonal(int[][] board) {
		int value1 = board[0][0];
		for (int i = 1; i < board.length; i++) {
			if (board[i][i] != value1)
				break;

			if (i == board.length - 1)
				System.out.println("All" + value1 + "'s on major diagonal");
		}
		int value2 = board[7][0];
		for (int i = 7; i >= 0; i--) {
			if (board[i][7 - i] != value2)
				break;

			if (i == 0)
				System.out.println("All " + value1 + "'s on minor diagonal");
		}
	}
}
