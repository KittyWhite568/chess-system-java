package application;

import boardgame.Board;
import boardgame.Positions;

public class Program {

	public static void main(String[] args) {
		
		Positions pos = new Positions(2, 4);
		
		System.out.println(pos);
		
		Board board = new Board(8, 8);
		
	}

}
