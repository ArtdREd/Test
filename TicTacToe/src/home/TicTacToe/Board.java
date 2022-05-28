package home.TicTacToe;

public class Board {

	private String[][] board = { { " \\ ", "  1  ", "  2  ", "  3  ", "< X pos." },
			{ " 1 ", "     ", "     ", "     " }, { " 2 ", "     ", "     ", "     " },
			{ " 3 ", "     ", "     ", "     " },};

	public String[][] getBoard() {
		return board;
	}

	public void boardPrint() {
		System.out.println("\n");
		for (String[] row : board) {
			for (String r : row) {
				System.out.print(r);
			}
			System.out.println("\n");
		}
	}

	public boolean hasMoreSpace() {
		for (int i=0; i<board.length; i ++) {
			for (int j=0; j<board.length; j ++) {
				if (board[i][j] == "     ") {
					return true;
				}
				
			}
		}
		return false;
	}

	
}