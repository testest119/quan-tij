package com.quan.exercise;

public class E04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length < 2) {
			System.err.println("Usage: java E04 distance time");
			System.exit(1);
		}
		float distance = Float.parseFloat(args[0]);
		float time = Float.parseFloat(args[1]);
		System.out.print("Velocity = ");
		System.out.print(distance / time);
		System.out.println("m/s");
	}

}
