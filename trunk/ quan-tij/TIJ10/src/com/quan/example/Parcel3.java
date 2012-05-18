package com.quan.example;

public class Parcel3 {
	class Contents {
		private int i = 11;

		public int value() {
			return i;
		}
	}

	class Destionation {
		private String label;

		public Destionation(String whereTo) {
			label = whereTo;
		}

		String readLabel() {
			return label;
		}
	}

	public static void main(String[] args) {
		Parcel3 p = new Parcel3();
		// Must use instance of outer class
		// to create an instance of the inner class
		Parcel3.Contents c = p.new Contents();
		Parcel3.Destionation d = p.new Destionation("Tasmania");
	}
}
