package individualTask;

public class Logic03 {
	// In one-dimension array of real numbers find: max element in the array
	// and the sum of elements till last positive element in array.

	public static double findMaxElement(double[] array) {
		double max = 0;

		// find max element and it's index in array
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static double SumToLastPositiveElement(double[] array) {
		double sumElementsFromMaxToLastPositive = 0;
		int indexLastPositiveElem = -1;

		// find index of last positive element
		for (int i = array.length - 1; i > 0; i--) {
			if (array[i] > 0) {
				indexLastPositiveElem = i;
				break;
			}
		}
		// System.out.println("\nindex of last positiv elem " + indexLastPositiveElem);

		// find the sum from max element to the last positive element
		for (int i = 0; i < indexLastPositiveElem + 1; i++) {
			sumElementsFromMaxToLastPositive += array[i];
		}

		return sumElementsFromMaxToLastPositive;
	}

}
