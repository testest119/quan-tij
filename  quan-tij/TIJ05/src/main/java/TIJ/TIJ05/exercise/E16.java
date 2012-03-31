package TIJ.TIJ05.exercise;

public class E16 {
	public static void main(String[] args) {
		String s1[] = new String[4];
		s1[0] = "These";
		s1[1] = "are";
		s1[2] = "some";
		s1[3] = "strings";
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
		}
		String s2[] = { "These", "are", "some", "strings" };
		for (int i = 0; i < s2.length; i++) {
			System.out.println(s2[i]);
		}
	}
}
