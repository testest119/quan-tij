package TIJ.TIJ05.example;

public class E22 {
	static void decribe(PaperCurrencyTypes types) {
		System.out.print(types + " has portrait of ");
		switch (types) {
		case ONE:
			System.out.println("George Washington");
			break;
		case TWO:
			System.out.println("Tomas Jefferson");
			break;
		case FIVE:
			System.out.println("Abraham Lincoln");
			break;
		case TEN:
			System.out.println("Alexander Hamilton");
			break;
		case TWENTY:
			System.out.println("Andrew Jackson");
			break;
		case FIFTY:
			System.out.println("U.S. Grant");
			break;

		default:
			break;
		}
	}

	public static void main(String[] args) {
		for (PaperCurrencyTypes currencyTypes : PaperCurrencyTypes.values()) {
			decribe(currencyTypes);
		}
	}
}
