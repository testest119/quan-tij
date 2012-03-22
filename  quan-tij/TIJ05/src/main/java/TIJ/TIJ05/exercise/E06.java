package TIJ.TIJ05.exercise;

class Dog2 {
	public void bark() {
		System.out.println("Default bark!");
	}

	public void bark(int i, int j) {
		System.out.println("int bark = howl!");
	}

	public void bark(double b, double d) {
		System.out.println("double bark = yip!");
	}
}

public class E06 {
	public static void main(String[] args) {
		Dog2 dog = new Dog2();
		dog.bark();
		dog.bark(1, 2);
		dog.bark(1.0, 3);
	}

}
