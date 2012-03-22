package com.quan.exercise;

public class E14 {

	static void compare(String s1, String s2) {
		System.out.println("s1==s2: " + (s1 == s2));
		System.out.println("s1!=s2: " + (s1 != s2));
		System.out.println("s1.equals(s2): " + (s1.equals(s2)));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compare("Hello", "Hello");
		String s = new String("Hello");
		compare("Hello", s);
		compare("Hello", "Goobye");
	}

}
