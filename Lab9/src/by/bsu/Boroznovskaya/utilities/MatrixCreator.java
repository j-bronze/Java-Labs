package by.bsu.Boroznovskaya.utilities;

public class MatrixCreator {
	public static double[][] createArray(int rows, int columns) {
		if((rows>0)&&(columns>0)) {
			return new double[rows][columns];
		}
		return new double[0][0];
	}
}
