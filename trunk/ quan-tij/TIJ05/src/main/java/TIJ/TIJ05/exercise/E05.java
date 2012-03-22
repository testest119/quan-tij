package TIJ.TIJ05.exercise;

class Dog {
	public void bark() {
		System.out.println("Default bark!");
	}

	public void bark(int i) {
		System.out.println("int bark = howl!");
	}

	public void bark(double b) {
		System.out.println("double bark = yip!");
	}
}

public class E05 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.bark();
		dog.bark(1);
		dog.bark(1.0);
	}
}
