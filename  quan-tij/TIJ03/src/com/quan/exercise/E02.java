package com.quan.exercise;

class Integral {
	float f;
}

public class E02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integral integral1 = new Integral();
		Integral integral2 = new Integral();
		integral1.f = 9f;
		integral2.f = 47f;
		System.out.println("1: integral1.f: " + integral1.f + ", integral2.f: "
				+ integral2.f);
		integral1 = integral2;
		System.out.println("2: integral1.f: " + integral1.f + ", integral2.f: "
				+ integral2.f);
		integral1.f = 27f;
		System.out.println("3: integral1.f: " + integral1.f + ", integral2.f: "
				+ integral2.f);
	}

}
