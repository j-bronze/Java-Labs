package individualTask;

public class Logic11 {
	// In one-dimension array of N real numbers find:
	// quantity of elements which lie in the range from A to B and
	// the sum of elements after max element

	public static int countQuantityInRange(double[] array, double a, double b) {
		int quantityElementsInAB = 0;

		for (int i = 0; i < array.length; i++) {
			if ((array[i] > a) && (array[i] < b)) {
				quantityElementsInAB++;
			}
		}
		return quantityElementsInAB;
	}

	public static double sumElementsAfterMaxElement(double[] array) {
		double sum = 0;
		double max = 0;
		int indexMaxElem = -1;

		// find the index of max element
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] == max) {
				indexMaxElem = i;
			}
		}

		// find the sum of elements after max element
		for (int i = indexMaxElem + 1; i < array.length; i++) {
			sum += array[i];
		}

		return sum;
	}

}
