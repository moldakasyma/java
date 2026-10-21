package lab2.task3;
//слон
public class Bishop extends Piece{
	public Bishop(char symbol,Position position) {
		super(symbol,position);
	}
	public boolean isLegalMove(Position a,Position b) {
		int rowDif=Math.abs(a.row-b.row);
		int colDif=Math.abs(a.col-b.col);
		//diagonal path
		return rowDif==colDif;
	}

}
