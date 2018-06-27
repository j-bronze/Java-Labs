package by.bsu.Boroznovskaya.utilities;

public class View {
	public static void print(String msg) {
		System.out.print(msg);
	}
	
	public static void printMatrix(double[][] matrixA) {
		for (int i = 0; i < matrixA.length; i++) {
			for (int j = 0; j < matrixA[i].length; j++) {
  				System.out.print( matrixA[i][j] + "\t" );
			}
			System.out.println(); // Переход к следующей строке
		}
	}
}
