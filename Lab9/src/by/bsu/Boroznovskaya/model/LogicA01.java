package by.bsu.Boroznovskaya.model;

public class LogicA01 {
	// Output the column numbers, all the elements of which are even.
	// For every column where there is a negative element on the main diagonal of matrix.
	// output the column number and the sum of all elements of this column. 

	public static String selectColumnWithAllEvenElements(double[][] matrix, int rows, int columns) {
		String answer = " ";
		boolean flag = true;
		int count = 0;

		for (int j = 0; j < columns; j++) {
			for (int i = 0; i < rows; i++) {
				if (matrix[i][j] % 2 != 0) {
					flag = false;
				}
			}
			if (flag) {
				answer += Integer.toString(j + 1) + " ";
				count++;
			}
			flag = true;
		}
		if (count == 0) {
			answer = " no columns.";
		}

		return answer;
	}

	public static String showNumberColumnAndSum(double[][] matrix, int rows,
			int columns) {
		String answer = "";
		boolean flag = true;
		int count = 0;
		double sum = 0;
		int temp = matrix.length+2;

		for (int j = 0; j < columns; j++) {
			for (int i = 0; i < rows; i++) {
				if (matrix[i][j] % 2 != 0) {
					flag = false;
				}
			}
			if (flag) {
				answer += "\n " + Integer.toString(j+1);
				count++;
				temp = j;
				for (int i = 0; i < rows; i++) {
					if ((i == j) && (matrix[i][j] < 0)) {
						for (int p = 0; p < rows; p++) {
							sum += matrix[p][temp];
						}
						answer += ", the sum of elements " + sum + "\n";
					} 
				}
			}

			flag = true;
			sum = 0;

		}
		if (count == 0) {
			answer = " no columns.";
		}

		return answer;
	}

}