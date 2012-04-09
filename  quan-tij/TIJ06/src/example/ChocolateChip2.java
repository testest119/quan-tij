package example;

import example.dessert.Cookie2;

public class ChocolateChip2 extends Cookie2 {
	public ChocolateChip2() {
		System.out.println("ChocolateChip2 constructor");
	}

	public void chomp() {
		bite();
	}

	public static void main(String[] args) {
		ChocolateChip2 chocolateChip2 = new ChocolateChip2();
		chocolateChip2.chomp();
	}
}
