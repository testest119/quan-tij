package com.quan.exercise;

public class E08 {

	static int i = 47;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E08 e08 = new E08();
		E08 e082 = new E08();
		System.out.println(e08.i + "==" + e082.i);
		e08.i++;
		System.out.println(e08.i + "==" + e082.i);
	}

}
