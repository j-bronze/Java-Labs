package individualTask;

public class Logic10 {
	// In one-dimension array of N real numbers find:
	// min element of array and
	// the sum of array elements between the first and the last positive elements

	public static double findMinElement(double[] array) {
		double min = 0;

		for (int i = 0; i < array.length; i++) {
			// min = Math.min(min, array);
			if (array[i] < min) {
				min = array[i];
			}
		}

		return min;
	}

	public static double sumElementsFirstToLastPositiveElements(double[] array) {
		double sum = 0;
		int indexFirstPositiveElem = -1;
		int indexLastPositiveElem = -1;

		// find indexes of the first and the last positive elements
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				indexFirstPositiveElem = i;
				break;
			}
		}
		//System.out.println("\nfirst positive elem is on position   " + indexFirstPositiveElem);
		for (int i = array.length - 1; i > 0; i--) {
			if (array[i] > 0) {
				indexLastPositiveElem = i;
				break;
			}
		}
		//System.out.println("\nlast positive elem is on position   " + indexLastPositiveElem);

		// find the sum of elements between the first and the last positive elements
		for (int i = indexFirstPositiveElem + 1; i < indexLastPositiveElem; i++) {
			sum += array[i];
		}

		return sum;
	}
}
