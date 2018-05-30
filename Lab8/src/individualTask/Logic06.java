package individualTask;

public class Logic06 {
	// In one-dimension array of real numbers find: the index of absolute max
	// element and the sum of elements after first positive element of the array

	public static int findIndexMaxAbs(double[] array) {
		double max = 0;
		int indexMaxAbsElem = -1;

		for (int i = 0; i < array.length; i++) {
			if (Math.abs(array[i]) > max) {
				max = Math.abs(array[i]);
			}
			if (array[i] == max) {
				indexMaxAbsElem = i;
			}
		}

		return indexMaxAbsElem;
	}

	public static double findSumElementsAfterFirstPositive(double[] array) {
		double SumElementsAfterFirstPositive = 0;
		int indexFirstPositivElem = -1;

		// find index of the first positive element
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				indexFirstPositivElem = i;
				break;
			}
		}
		// System.out.println("\nindex of first positive elem " + indexFirstPositivElem);

		for (int i = indexFirstPositivElem + 1; i < array.length; i++) {
			SumElementsAfterFirstPositive += array[i];
		}

		return SumElementsAfterFirstPositive;
	}
}
