package home.TicTacToe;

public class Main {

	public static void main(String[] args) {
		Board b = new Board();
		Referee ref = new Referee();
		Player player1 = new Player(ActionFigure.Krestik);
		Player player2 = new Player(ActionFigure.Nolik);
		b.boardPrint();

		do {
			player1.turn(b);
			ref.move(b, player1);
			if (ref.isWin(b, player1)) {
				b.boardPrint();
				System.out.println("   			   WINEER IS " + player1.getFigure().getName());
				System.out.println("   			   SMERT' MOSKALYAM ");
				break;
			}
			if(!b.hasMoreSpace()) {
				b.boardPrint();
				System.out.println("    			  NOBODY WIN");
				break;
			}
			b.boardPrint();
			player2.turn(b);
			ref.move(b, player2);
			if (ref.isWin(b, player2)) {
				b.boardPrint();
				System.out.println("    			  WINEER IS " + player1.getFigure().getName());
				System.out.println("   			   SMERT' MOSKALYAM ");
				break;
			}
			if(!b.hasMoreSpace()) {
				b.boardPrint();
				System.out.println("    			  NOBODY WIN");
				break;
			}
			b.boardPrint();
		} while (true);
		
	}
}
