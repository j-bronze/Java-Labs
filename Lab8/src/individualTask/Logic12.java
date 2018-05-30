package individualTask;

public class Logic12 {
	// In one-dimension array of N real numbers find:
	// multiplication of positive elements and
	// the sum of elements till min element

	public static double multiplyPositiveElements(double[] array) {
		double mult = 1;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				mult *= array[i];
			}
		}

		return mult;
	}

	public static double sumToMinElement(double[] array) {
		double sumToMinElem = 0;
		double min = 0;
		int indexMinElement = -1;

		// find index of min element
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
			if (array[i] == min) {
				indexMinElement = i;
			}
		}
		//System.out.println("\nMin elem is   " + min + "   on position   " + indexMinElement);
		
		//find the sum from the first to min element
		for (int i = 0; i < indexMinElement; i++) {
			sumToMinElem+=array[i];
		}

		return sumToMinElem;
	}
}
