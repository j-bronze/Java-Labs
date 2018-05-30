package individualTask;

import java.util.Random;

public class ArrayInitializer {
	public static void rndInitInt(int[] array, int min, int max) {
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(max - min + 1) + min;
		}
	}

	public static void userInitInt(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = UserInput.input("[" + (i + 1) + "]: ");
		}
	}
	
	
	
	public static void rndInitDouble(double[] array, int min, int max) {
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			//array[i] = random.nextInt()*max - min;
			array[i] = random.nextInt(max - min + 1) + min;
		}
	}

	public static void userInitDouble(double[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = UserInput.input("[" + (i + 1) + "]: ");
		}
	}
}
