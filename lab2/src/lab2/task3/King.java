package lab2.task3;

public class King extends Piece{
	public King(char symbol,Position position ) {
		super(symbol,position);
	}
	public boolean isLegalMove(Position a,Position b) {
		int rowDif=Math.abs(a.row-b.row);
		int colDif=Math.abs(a.col-b.col);
		//make sure that it made only one move 
		return (rowDif<=1 && colDif<=1) &&(rowDif+colDif>0);
		
	}

}
