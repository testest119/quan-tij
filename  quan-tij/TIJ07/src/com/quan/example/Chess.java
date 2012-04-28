package com.quan.example;

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

public class Chess extends BoardGame {
	public Chess() {
		// TODO Auto-generated constructor stub
		super(11);
		System.out.println("Chess constructor");
	}

	public static void main(String[] args) {
		Chess x = new Chess();
	}
}
