package individualTask;

public class Logic07 {
	// In one-dimension array of N real numbers find:
	// quantity of elements greater C and
	// multiplication of elements situated after absolute max element

	public static int countGreaterUserInputNubmer(double[] array, double c) {
		int quantityElementsGreaterC = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > c) {
				quantityElementsGreaterC++;
			}
		}
		return quantityElementsGreaterC;
	}

	public static double multiplyElementsAfterAbsMaxElement(double[] array) {
		double mult = 1;
		double max = 0;
		int indexMaxAbsElem = -1;

		// find the index of absolute max element
		for (int i = 0; i < array.length; i++) {
			if (Math.abs(array[i]) > max) {
				max = Math.abs(array[i]);
			}
			if (array[i] == max) {
				indexMaxAbsElem = i;
			}
		}

		// find the multiplication of elements after absolute max element
		for (int i = indexMaxAbsElem + 1; i < array.length; i++) {
			mult *= array[i];
		}

		return mult;
	}
}
