package individualTask;

public class Logic09 {
	// In one-dimension array of N real numbers find:
	// multiplication of negative elements and
	// the sum of positive elements till max element

	public static double multiplyNegativeElements(double[] array) {
		double mult = 1;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				mult *= array[i];
			}
		}
		return mult;
	}

	public static double sumPositiveToMaxElement(double[] array) {
		double sumToMaxElem = 0;
		double max = 0;
		int indexMaxElement = -1;

		// find index of max element
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] == max) {
				indexMaxElement = i;
			}
		}
		//System.out.println("\nindex of max elem " + indexMaxElement);

		// find the sum of positive element from the first position to max element
		for (int i = 0; i < indexMaxElement; i++) {
			if (array[i] > 0) {
				sumToMaxElem += array[i];
			}
		}

		return sumToMaxElem;
	}
}
