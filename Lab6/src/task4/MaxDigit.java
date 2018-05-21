package task4;

public class MaxDigit {
	public static int findMaxDigit(int numeric) {
		int maxDigit = 0;
		int temp;

		numeric = numeric > 0 ? numeric : -numeric;

		while (numeric > 0) {
			temp = numeric % 10;
			if (maxDigit < temp) {
				maxDigit = temp;
			}
			numeric = numeric / 10;
		}

		return maxDigit;
	}
}
