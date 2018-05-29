package keyTask;

public class SortArray {
	public static boolean isSorted(double[] array, int size) {
		int flag = 0;

		if (size > 0) {
			for (int i = 1; i < array.length; ++i) {
				if (array[i - 1] >= array[i]) {
					flag++;
					if (i == (array.length - 1) && flag == (array.length - 1)) {
						return true;
					}
				}
			}

			flag = 0;
			for (int i = 1; i < array.length; ++i) {
				if (array[i - 1] <= array[i]) {
					flag++;
					if (i == (array.length - 1) && flag == (array.length - 1)) {
						return true;
					}
				}
			}
		}
		return false;
	}
}