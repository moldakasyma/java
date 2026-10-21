package lab2.task3;
//конь

public class Knight extends Piece{
	public Knight(char symbol,Position position ) {
		super(symbol,position);
		
	}
	public boolean isLegalMove(Position a, Position b) {
		int rowDif=Math.abs(a.row-b.row);
		int colDif=Math.abs(a.col-b.col);
		
		//2 moves horizontally and 1 move vertically or 2 moves vertically,1 horizontally
		return (rowDif==2 && colDif==1)||(rowDif==1 && colDif==2);
	}

}
