package lab2.task3;

public class Rock extends Piece{
	public Rock(char symbol,Position position ) {
		super(symbol,position);
	}
	public boolean isLegalMove(Position a,Position b) {
		return a.row==b.row || a.col==b.col;
	}

}

