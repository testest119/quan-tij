package com.quan.exercise;

class Glyph {
	void draw() {
		System.out.println("Glyph.draw()");
	}

	public Glyph() {
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph {
	private int radius = 1;

	public RoundGlyph(int r) {
		radius = r;
		System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
	}

	void draw() {
		System.out.println("RoundGlyph.draw(), radius = " + radius);
	}
}

class RectangularGlyph extends Glyph {
	private int width = 4;
	private int height = 5;

	public RectangularGlyph(int width, int height) {
		this.width = width;
		this.height = height;
		System.out.println("RectangularGlyph.RectangularGlyph().width = "
				+ width + ", height = " + height);
	}

	void draw() {
		System.out.println("RectangularGlyph.draw(), area = " + width * height);
	}
}

public class E15_PolyConstructors2 {
	public static void main(String[] args) {
		new RoundGlyph(5);
		new RectangularGlyph(2, 2);
	}
}
