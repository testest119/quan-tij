package com.quan.exercise;

class Game {
	public Game(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Game constructor");
	}
}

class BoardGame extends Game {

	public BoardGame(int i) {
		super(i);
		// TODO Auto-generated constructor stub
		System.out.println("BoardGame constructor");
	}

}

class ChessWithoutDefCtor extends BoardGame{
	
}

public class E06_ChessWithoutDefCtor {

}
