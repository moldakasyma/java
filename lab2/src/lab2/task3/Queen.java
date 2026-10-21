package lab2.task3;

public class Queen extends Piece{
	public Queen(char symbol,Position position ) {
		super(symbol,position);
	}
	public boolean isLegalMove(Position a,Position b) {
		int rowDif=Math.abs(a.row-b.row);
		int colDif=Math.abs(a.col-b.col);
		return a.isInSameRowOrColumn(b) || rowDif == colDif;
	}

}
