package lab2.task3;

import java.util.Scanner;

public class ChessMain {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Piece p=null;
		
	
		while(true) {
			System.out.println("Choose your piece: ");
			String piece=scan.nextLine();
			
			
			System.out.println("Enter your start position:");
			int pieceR=scan.nextInt();
			int pieceC=scan.nextInt();
			System.out.println("Enter your end position");
			int pieceR2=scan.nextInt();
			int pieceC2=scan.nextInt();
			Position pieceStart=new Position(pieceR,pieceC);
			Position pieceEnd=new Position(pieceR2,pieceC2);
			
			if("B".equals(piece)) {
				p=new Pawn('B',pieceStart);
			}
			else if("K".equals(piece)) {
				p=new King('K',pieceStart);
			}
			else if("N".equals(piece)) {
				p=new Knight('N',pieceStart);
			}
			else if("P".equals(piece)) {
				p=new Pawn('P',pieceStart);
			}
			else if("Q".equals(piece)) {
				p=new Queen('Q',pieceStart);
			}
			else if("R".equals(piece)) {
				p=new Rock('R',pieceStart);
			}
			else {
				System.out.println("Wrong symbol.Try again");
				scan.nextLine();
				continue;
				
			}
			
			if(p.isLegalMove(pieceStart, pieceEnd)) {
				System.out.println("Piece is moving from: "+pieceStart.row+","+pieceStart.col+" to "+pieceEnd.row+","+pieceEnd.col);
				break;
			}
			else {
				System.out.println("piece can not move,try again");
				scan.nextLine();
			}
			
			
		
			
		

	}
		scan.close();

}
}
