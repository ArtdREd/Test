package home.TicTacToe;

import java.util.Scanner;

public class Player {

	private ActionFigure figure;
	private int positionX;
	private int positionY;

	Player(ActionFigure figure) {
		this.figure = figure;
	}
	public int getPositionX() {
		return positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public ActionFigure getFigure() {
		return figure;
	}

	public void turn(Board board) {
		System.out.println("				Player" + this.getFigure().getName() + "Enter X pos.");
		int X = isDigitThatNeed();
		System.out.println("				Player" + this.getFigure().getName() + "Enter Y pos.");
		int Y = isDigitThatNeed();
		if (board.getBoard()[Y][X] == "     ") {
			positionX = X;
			positionY = Y;
		} else {
			System.out.println("Wrong move, enter NEW \n");
			board.boardPrint();
			turn(board);
		}

	}

	Scanner scan = new Scanner(System.in);

	private int isDigitThatNeed() {
		int number;
		while (!scan.hasNextInt()) {
			System.out.println("Wrong enter!");
			scan.next(); // this is important!
		}
		number = scan.nextInt();
		if (number > 0 && number < 4) {
			return number;
		} else {
			System.out.println("Wrong enter! U need 1 or 2 or 3");
		}
		return isDigitThatNeed();
	}

}