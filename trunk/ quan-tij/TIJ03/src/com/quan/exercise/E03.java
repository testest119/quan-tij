package com.quan.exercise;

public class E03 {

	public static void f(Integral integral) {
		integral.f = 3.0f;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integral integral = new Integral();
		integral.f = 2.0f;
		System.out.println("1: integral.f= " + integral.f);
		f(integral);
		System.out.println("2: integral.f= " + integral.f);
	}

}
