package TIJ.TIJ05.example;

enum PaperCurrencyTypes {
	ONE, TWO, FIVE, TEN, TWENTY, FIFTY
}

public class E21 {
	public static void main(String[] args) {
		for (PaperCurrencyTypes paperCurrencyTypes : PaperCurrencyTypes
				.values()) {
			System.out.println(paperCurrencyTypes + " , ordinal "
					+ paperCurrencyTypes.ordinal());
		}
	}
}
