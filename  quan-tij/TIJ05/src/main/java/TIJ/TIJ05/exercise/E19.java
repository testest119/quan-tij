package TIJ.TIJ05.exercise;

public class E19 {
	static public void printStrings(String... strings) {
		for (String string : strings) {
			System.out.println(string);
		}
	}

	public static void main(String[] args) {
		printStrings("aaa", "bbb", "ccc", "ddd");
		printStrings(new String[] { "fff", "ggg", "hhh" });

	}
}
