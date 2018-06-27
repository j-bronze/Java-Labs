package by.bsu.Boroznovskaya.model;

public class LogicA02 {
	//Among the rows of a given matrix containing only odd elements,
	//find the line with the maximum sum of the modules of the elements.
	
	public static int findRowIndex(double[][] matrix, int rows, int columns) {
		double sum = 0;
		double maxSum = 0;
		int rowIndex = 0;
		boolean flag = true;
		
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<columns; j++) {
				if (matrix[i][j] % 2 == 0) {
					flag = false;
				}
			}
			
			if(flag) {
				for(int j = 0; j<columns; j++) {
					sum += Math.abs(matrix[i][j]);
				}
			}
							
			if(sum>maxSum) {
					maxSum = sum;
					rowIndex = i+1;
				}
				
			flag = true;
			
		}
		
		return rowIndex;
	}
	

}
