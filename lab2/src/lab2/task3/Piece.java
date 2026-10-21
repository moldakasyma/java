package lab2.task3;

public abstract class Piece {
	char symbol;
	Position position;
	public Piece(char symbol,Position position) {
		this.symbol=symbol;
		this.position=position;
	}
	public abstract boolean isLegalMove(Position a,Position b);
}
