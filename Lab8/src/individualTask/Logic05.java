package individualTask;

public class Logic05 {
	// In one-dimension array of N real numbers find:
	// absolute max element and
	// the sum of elements between the first and the second positive elements

	public static double findMaxAbsElem(double[] array) {
		double max = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (Math.abs(array[i]) > max) {
				max = Math.abs(array[i]);
			}
		}
		return max;
	}
	
	public static double sumElementsBetweenFirstSecondPositiveElements(double[] array) {
		double sum = 0;
		int indexFirstPositiveElem = -1;
		int indexSecondPositiveElem = -1;

		// find indexes of the first and the second negative elements
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				indexFirstPositiveElem = i;
				break;
			}
		}
		//System.out.println("\nfirst Positive elem is on position   " + indexFirstPositiveElem);
		for (int i = indexFirstPositiveElem + 1; i < array.length; i++) {
			if (array[i] > 0) {
				indexSecondPositiveElem = i;
				break;
			}
		}
		//System.out.println("\nsecond Positive elem is on position   " + indexSecondPositiveElem);

		// find the sum of elements between the first and the second positive elements
		for (int i = indexFirstPositiveElem + 1; i < indexSecondPositiveElem; i++) {
			sum += array[i];
		}

		return sum;
	}
	
	
}
