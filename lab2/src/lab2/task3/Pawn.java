package lab2.task3;

public class Pawn extends Piece{
	public Pawn(char symbol,Position position ) {
		super(symbol,position);
	}
	public boolean isLegalMove(Position a,Position b) {
		int rowDif=a.row-b.row;	
		int colDif=Math.abs(b.col-a.col);
		return rowDif==1 && colDif<=1;
		
		
			
		
	}

}
