package by.bsu.Boroznovskaya.utilities;
import java.util.Random;

public class MatrixInitializer {

	public static void rndInit(double[][] matrixA, int min, int max) {
		Random random = new Random();

		for (int i = 0; i < matrixA.length; i++) {
			for (int j = 0; j < matrixA[i].length; j++) {
				// matrixA[i][j] = (int)(Math.random() * 10);
				matrixA[i][j] = random.nextInt(max - min + 1) + min;
			}
		}
	}

	public static void userInit(double[][] matrixA, int min, int max) {
		for (int i = 0; i < matrixA.length; i++) {
			for (int j = 0; j < matrixA[i].length; j++) {
				matrixA[i][j] = UserInput.input("[" + (i + 1) + "][" + (j + 1) + "]: ");
			}
		}
	}
	
	
	
}
