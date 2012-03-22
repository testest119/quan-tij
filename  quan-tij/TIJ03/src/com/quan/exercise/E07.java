package com.quan.exercise;

import java.util.Random;

public class E07 {
	public static void main(String[] args) {
		Random random = new Random();
		boolean flip = random.nextBoolean();
		System.out.print("Outcome: ");
		System.out.println(flip ? "HEAD" : "TAIL");
	}
}
