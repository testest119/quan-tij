package TIJ.TIJ05.example;

public class EnumOrder {
	public static void main(String[] args) {
		for (Spiciness spiciness : Spiciness.values()) {
			System.out.println(spiciness + ", ordinal " + spiciness.ordinal());
		}
	}
}
