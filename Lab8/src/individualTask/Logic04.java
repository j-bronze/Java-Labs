package individualTask;

public class Logic04 {
	// In one-dimension array of N integer numbers find:
	// the index of max element and multiplication of elements
	// between the first and the second elements equal zero

	public static int findIndexMaxElem(int[] array) {
		int max = 0;
		int indexMaxElem = -1;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] == max) {
				indexMaxElem = i;
			}
		}
		return indexMaxElem;
	}

	public static int multiplyElementsBetweenFirstSecondElementsZero(int[] array) {
		int mult = 1;
		int indexFirstElemZero = -1;
		int indexSecondElemZero = -1;

		// find indexes of the first and the second elements equal zero
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				indexFirstElemZero = i;
				break;
			}
		}
		//System.out.println("\nfirst elem equal zero is on position " + indexFirstElemZero);

		for (int i = indexFirstElemZero + 1; i < array.length; i++) {
			if (array[i] == 0) {
				indexSecondElemZero = i;
				break;
			}
		}
		//System.out.println("\nsecond elem equal zero is on position " + indexSecondElemZero);

		// find the sum of elements between the first and the second elements equal zero
		if ((indexFirstElemZero != -1) && (indexSecondElemZero != -1)) {
			for (int i = indexFirstElemZero + 1; i < indexSecondElemZero; i++) {
				mult *= array[i];
			}
		}else {
			mult = 0;
		}
		
		return mult;
	}
}
