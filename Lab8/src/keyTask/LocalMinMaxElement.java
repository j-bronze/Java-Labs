package keyTask;

public class LocalMinMaxElement {
	public static int findFirstIndexOfLocalMin(double[] array) {
		
		for (int i = 1; i < array.length-1; i++) {
			if (array[i - 1] > array[i] && array[i + 1] > array[i])
				return i;
		}
		return -1;
	}

	public static int findFirstIndexOfLocalMax(double[] array) {
		
		for (int i = 1; i < array.length-1; i++) {
			if (array[i - 1] < array[i] && array[i + 1] < array[i])
				return i;
		}
		return -1;
	}
}
