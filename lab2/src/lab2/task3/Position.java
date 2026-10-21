package lab2.task3;

public class Position {
	int row;
	int col; 
	public Position(int row,int col) {
		this.row=row;
		this.col=col;
	}
	public boolean isInSameRowOrColumn(Position other) {
		return this.row==other.row || this.col==other.col;
	}

}
