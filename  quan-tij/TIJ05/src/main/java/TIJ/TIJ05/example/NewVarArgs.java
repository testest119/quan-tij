package TIJ.TIJ05.example;

public class NewVarArgs {
	static void printArray(Object... objects) {
		for (Object object : objects) {
			System.out.print(object + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		printArray(new Integer(47), new Float(3.14), new Double(11.11));
		printArray(47, 3.14F, 11.11);
		printArray("one", "two", "three");
		printArray(1, new A(), new A(), new A());
		printArray(new Integer[] { 1, 2, 3, 4 });
		printArray();
	}
}
