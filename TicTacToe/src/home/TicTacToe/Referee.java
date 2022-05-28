package home.TicTacToe;

public class Referee {

	public void move(Board board, Player player) {
		board.getBoard()[player.getPositionY()][player.getPositionX()] = player.getFigure().getName();
	}

	public boolean isWin(Board board, Player player) {
		for (int i = 0; i <= 7; i++) {
			String line = null;
			switch (i) {
			case 0:
				line = board.getBoard()[1][1] + board.getBoard()[2][1] + board.getBoard()[3][1];
				break;
			case 1:
				line = board.getBoard()[1][2] + board.getBoard()[2][2] + board.getBoard()[3][2];
				break;
			case 2:
				line = board.getBoard()[1][3] + board.getBoard()[2][3] + board.getBoard()[3][3];
				break;
			case 3:
				line = board.getBoard()[1][1] + board.getBoard()[1][2] + board.getBoard()[1][3];
				break;
			case 4:
				line = board.getBoard()[2][1] + board.getBoard()[2][2] + board.getBoard()[2][3];
				break;
			case 5:
				line = board.getBoard()[3][1] + board.getBoard()[3][2] + board.getBoard()[3][3];
				break;
			case 6:
				line = board.getBoard()[1][1] + board.getBoard()[2][2] + board.getBoard()[3][3];
				break;
			case 7:
				line = board.getBoard()[1][3] + board.getBoard()[2][2] + board.getBoard()[3][1];
				break;
			}
			if (line.equals(
					player.getFigure().getName() + 
					player.getFigure().getName() + 
					player.getFigure().getName())) {
				return true;
			}
		}
		return false;

	}
}