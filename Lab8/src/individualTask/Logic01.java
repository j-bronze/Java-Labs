package individualTask;

public class Logic01 {
	// In one-dimension array of real numbers find: the sum of negative elements
	// and multiplication of elements of the array between max and min elements

	public static double countSumNegativeElements(double[] array) {
		double sumNegativeElements = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				sumNegativeElements += array[i];
			}
		}
		return sumNegativeElements;
	}

	public static double multiplyElementsBetweenMaxMin(double[] array) {
		double mult = 1;
		double max = array[0];
		int indexMaxElement = -1;
		double min = array[array.length - 1];
		int indexMinElement = -1;

		// find max element and it's index in array
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] == max) {
				indexMaxElement = i;
			}
		}
		//System.out.println("\nMax elem is   " + max + "   on position   " + indexMaxElement);

		// find min element and it's index in array
		for (int i = array.length - 1; i > 0; i--) {
			if (array[i] < min) {
				min = array[i];
			}
			if (array[i] == min) {
				indexMinElement = i;
			}
		}
		//System.out.println("\nMin elem is   " + min + "   on position   " + indexMinElement);

		// compare indexes of max and min elements and find multiplication of elements
		// between max and min elements
		if (indexMaxElement > indexMinElement) {
			for (int i = indexMinElement + 1; i < indexMaxElement; i++) {
				mult *= array[i];
			}
		} else {
			for (int i = indexMaxElement + 1; i < indexMinElement; i++) {
				mult *= array[i];
			}
		}

		return mult;
	}

}
