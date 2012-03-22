package com.quan.exercise;

public class E06 {
	String s = "Hello world!";

	int storage(String s) {
		return s.length() * 2;
	}

	void print() {
		System.out.println("storage(s)=" + storage(s));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E06 e06 = new E06();
		e06.print();
	}

}
