package com.quan.exercise;

public class E09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Byte by = 1; // 自动包装功能将自动的将基本类型转换为包装器类型
		byte b = by; // 自动拆箱功能将自动的将包装器类型转换为基本类型
		System.out.println("byte=" + b);
		Short short1 = 1;
		short s = short1;
		System.out.println("short=" + s);
		Integer integer = 1;
		int i = integer;
		System.out.println("int=" + i);
		Long long1 = 1L;
		long l = long1;
		System.out.println("long=" + l);
		Boolean boolean1 = true;
		boolean c = boolean1;
		System.out.println("boolean=" + c);
		Character character = 'x';
		char d = character;
		System.out.println("char=" + d);
		Float float1 = 1.0f;
		float f = float1;
		System.out.println("float=" + f);
		Double double1 = 1.0d;
		double e = double1;
		System.out.println("double=" + e);
	}
}
