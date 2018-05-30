package individualTask;

public class Logic14 {
	// In one-dimension array of N real numbers find:
	// the index of min element and
	// the sum of elements between the first and the second negative elements

	public static int findIndexMinElement(double[] array) {
		double min = array[0];
		int indexMinElem = -1;

		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
			if (array[i] == min) {
				indexMinElem = i;
			}
		}

		return indexMinElem;
	}

	public static double sumElementsBetweenFirstSecondNegativeElements(double[] array) {
		double sum = 0;
		int indexFirstNegativeElem = -1;
		int indexSecondNegativeElem = -1;

		// find indexes of the first and the second negative elements
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				indexFirstNegativeElem = i;
				break;
			}
		}
		//System.out.println("\nfirst negative elem is on position   " + indexFirstNegativeElem);
		for (int i = indexFirstNegativeElem + 1; i < array.length; i++) {
			if (array[i] < 0) {
				indexSecondNegativeElem = i;
				break;
			}
		}
		//System.out.println("\nsecond negative elem is on position   " + indexSecondNegativeElem);

		// find the sum of elements between the first and the second negative elements
		for (int i = indexFirstNegativeElem + 1; i < indexSecondNegativeElem; i++) {
			sum += array[i];
		}

		return sum;
	}
}
