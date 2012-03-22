package com.quan.exercise;

public class E10 {
	public static void main(String[] args) {
		for (int i = 1001; i < 10000; i++) {
			if (i % 100 == 0) {
				continue;
			}
			for (int j = 11; j < 100; j++) {
				for (int k = 11; k < 100; k++) {
					if (i == j * k) {
						int num1[] = new int[4];
						int num2[] = new int[4];
						num1[0] = i / 1000;
						num1[1] = i % 1000 / 100;
						num1[2] = i % 1000 % 100 / 10;
						num1[3] = i % 1000 % 100 % 10;
						num2[0] = j / 10;
						num2[1] = j % 10;
						num2[2] = k / 10;
						num2[3] = k % 10;
						int count = 0;
						for (int l = 0; l < 4; l++) {
							for (int m = 0; m < 4; m++) {
								if (num1[l] == num2[m]) {
									count++;
									num1[l] = -1;
									num2[m] = -2;
								}
							}
						}
						if (count == 4) {
							System.out
									.println("i:" + i + " j:" + j + " k:" + k);
						}
					}
				}
			}
		}
	}
}
