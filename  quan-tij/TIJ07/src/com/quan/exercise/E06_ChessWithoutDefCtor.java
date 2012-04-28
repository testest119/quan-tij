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

class ChessWithoutDefCtor extends BoardGame {
	// public ChessWithoutDefCtor() {
	// // TODO Auto-generated constructor stub
	// System.out.println("ChessWithoutDefCtor constructor");
	// super(11);
	// }
}

public class E06_ChessWithoutDefCtor {
	public static void main(String[] args) {
		new ChessWithoutDefCtor();
	}
}
