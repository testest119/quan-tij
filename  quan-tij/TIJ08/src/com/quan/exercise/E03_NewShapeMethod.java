package com.quan.exercise;

class Shape {
	public void draw() {
	}

	public void erase() {
	}

	public void msg() {
		System.out.println("Base class msg()");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle.draw()");
	}

	public void erase() {
		System.out.println("Circle.erase()");
	}

//	public void msg() {
//		System.out.println("Circle.msg()");
//	}
}

class Square extends Shape {
	public void draw() {
		System.out.println("Square.draw()");
	}

	public void erase() {
		System.out.println("Square.erase()");
	}

	public void msg() {
		System.out.println("Square.msg()");
	}
}

class Triangle extends Shape {
	public void draw() {
		System.out.println("Triangle.draw()");
	}

	public void erase() {
		System.out.println("Triangle.erase()");
	}

	public void msg() {
		System.out.println("Triangle.msg()");
	}
}

public class E03_NewShapeMethod {
	public static void main(String[] args) {
		Shape[] shapes = { new Circle(), new Square(), new Triangle() };
		for (Shape shape : shapes) {
			shape.draw();
			shape.erase();
			shape.msg();
		}
	}
}
