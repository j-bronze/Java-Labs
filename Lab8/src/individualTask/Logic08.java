package individualTask;

public class Logic08 {
	// In one-dimension array of N integer numbers find:
	// quantity of positive elements and
	// the sum of elements after last element equals zero

	public static int countQuantityPositiveElements(int[] array) {
		int quantityPositiveElements = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				quantityPositiveElements++;
			}
		}
		return quantityPositiveElements;
	}

	public static int findSumElementsAfterLastZero(int[] array) {
		int sum = 0;
		int indexLastElemZero = -1;

		// find index of the last element equals zero
		for (int i = array.length - 1; i > 0; i--) {
			if (array[i] == 0) {
				indexLastElemZero = i;
				break;
			}
		}

		if (indexLastElemZero != -1) {
			for (int i = indexLastElemZero + 1; i < array.length; i++) {
				sum += array[i];
			}
		}
		return sum;
	}

}
