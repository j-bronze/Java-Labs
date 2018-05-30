package individualTask;

public class Logic02 {
	// In one-dimension array of N integer numbers find:
	// multiplication of elements with even indexes and
	// the sum of elements between the first and the last elements equal zero

	public static int multiplyElementsEvenIndexes(int[] array) {
		int mult = 1;
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				mult *= array[i];
			}
		}
		return mult;
	}

	public static int sumElementsFirstToLastElementsEqualZero(int[] array) {
		int sum = 0;
		int indexFirstElemZero = -1;
		int indexLastElemZero = -1;

		// find indexes of the first and the last elements equal zero
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				indexFirstElemZero = i;
				break;
			}
		}
		//System.out.println("\nfirst elem zero is on position   " + indexFirstElemZero);

		for (int i = array.length - 1; i > 0; i--) {
			if (array[i] == 0) {
				indexLastElemZero = i;
				break;
			}
		}
		//System.out.println("\nlast elem zero is on position   " + indexLastElemZero);

		// find the sum of elements between the first and the last elements equal zero
		if ((indexFirstElemZero != -1) && (indexLastElemZero != -1)) {
			for (int i = indexFirstElemZero + 1; i < indexLastElemZero; i++) {
				sum += array[i];
			}
		}

		return sum;
	}

}
