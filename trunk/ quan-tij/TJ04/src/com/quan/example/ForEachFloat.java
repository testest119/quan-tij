package com.quan.example;

import java.util.Random;

public class ForEachFloat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random(47);
		float f[] = new float[10];
		for (int i = 0; i < f.length; i++) {
			f[i] = random.nextFloat();
		}
		for (float g : f) {
			System.out.println(g);
		}
	}

}
