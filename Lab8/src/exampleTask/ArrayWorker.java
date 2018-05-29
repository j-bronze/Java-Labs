package exampleTask;

import static java.lang.Math.abs;

public class ArrayWorker {
	public static boolean checkEvenOddNumbersInterchange(int[] array) {

		if (array.length == 0 || array.length == 1) {
			return false;
		}
		
		if (array[0] % 2 == 0) {
			for (int i = 1; i < array.length; i += 2) {
				if (abs(array[i]) % 2 == 0 || abs(array[i + 1]) % 2 == 1) {
					return false;
				}
			}
		} else {
			for (int i = 1; i < array.length; i += 2) {
				if (abs(array[i]) % 2 == 1 || abs(array[i + 1]) % 2 == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
