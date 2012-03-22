package com.quan.example;

class Tank {
	int level;
}

public class Assignment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank tank1 = new Tank();
		Tank tank2 = new Tank();
		tank1.level = 9;
		tank2.level = 47;
		System.out.println("1: tank1.level: " + tank1.level + ", tank2.level: "
				+ tank2.level);
		tank1 = tank2;
		System.out.println("2: tank1.level: " + tank1.level + ", tank2.level: "
				+ tank2.level);
		tank1.level = 27;
		System.out.println("3: tank1.level: " + tank1.level + ", tank2.level: "
				+ tank2.level);
	}

}
