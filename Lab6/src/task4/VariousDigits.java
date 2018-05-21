package task4;

public class VariousDigits {

	public static int countQuantityVariousDigits(int numeric) {

		int quantityVariousDigits = 0;
		int[] digitsCount = new int[10];
		int i;

		numeric = numeric > 0 ? numeric : -numeric;

		while (numeric > 0) {
			i = numeric % 10;
			digitsCount[i]++;
			numeric = numeric / 10;
		}
		for (int j = 0; j < digitsCount.length; j++) {
			if (digitsCount[j] > 0) {
				quantityVariousDigits++;
			}
		}

		return quantityVariousDigits;

	}

}
