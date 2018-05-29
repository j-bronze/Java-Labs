package keyTask;

import java.util.Random;

public class ArrayInitializer {
	public static void rndInit(double[] array, int min, int max) {
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			//array[i] = random.nextInt()*max - min;
			array[i] = random.nextInt(max - min + 1) + min;
		}
	}

	public static void userInit(double[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = UserInput.input("[" + (i + 1) + "]: ");
		}
	}
}
