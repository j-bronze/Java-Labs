package individualTask;

public class Logic13 {
	// In one-dimension array of N real numbers find:
	// the sum of elements with odd indexes and
	// the sum of elements between the first and the last negative elements

	public static double sumElementsOddIndexes(double[] array) {
		double sumElementsOddIndexes = 0;

		for (int i = 0; i < array.length; i++) {
			if (i % 2 != 0) {
				sumElementsOddIndexes += array[i];
			}
		}
		return sumElementsOddIndexes;
	}

	public static double sumElementsFirstToLastNegativeElements(double[] array) {
		double sum = 0;
		int indexFirstNegativeElem = -1;
		int indexLastNegativeElem = -1;

		// find indexes of the first and the last negative elements
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				indexFirstNegativeElem = i;
				break;
			}
		}
		//System.out.println("\nfirst negative elem is on position   " + indexFirstNegativeElem);
		for (int i = array.length - 1; i > 0; i--) {
			if (array[i] < 0) {
				indexLastNegativeElem = i;
				break;
			}
		}
		//System.out.println("\nlast negative elem is on position   " + indexLastNegativeElem);

		// find the sum of elements between the first and the last positive elements
		for (int i = indexFirstNegativeElem + 1; i < indexLastNegativeElem; i++) {
			sum += array[i];
		}

		return sum;
	}

}
