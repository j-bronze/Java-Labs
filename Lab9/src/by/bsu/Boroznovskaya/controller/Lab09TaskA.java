/**The purpose of the program: to learn methods of work with 
 * multidimensional arrays in Java, Test Driven Development, jUnit-testing.
 * Laboratory work ¹9. Multidimensional arrays in Java. Test Driven Development.
 * Using the jUnit framework for unit testing.
 * The program has been written and tested with the 
 * Eclipse IDE for Java Developers (Version: Oxygen.2 Release(4.7.2))
 * @author Boroznovskaya Evgeniya
 * 1706v
 * 01/06/2018
 */
package by.bsu.Boroznovskaya.controller;


import by.bsu.Boroznovskaya.model.*;
import by.bsu.Boroznovskaya.utilities.*;

public class Lab09TaskA {

	public static void main(String[] args) {

		int rows = 0;
		int columns = 0;
		double[][] matrixA;
		String result = " ";
		int answer;
		
		rows = UserInput.input("Input number of rows in array: ");
		columns = UserInput.input("\nInput number of columns in array: ");
		
		matrixA = MatrixCreator.createArray(rows, columns);
		MatrixInitializer.rndInit(matrixA, -20, 20);
		View.printMatrix(matrixA);
		
		//A-01
		result = LogicA01.selectColumnWithAllEvenElements(matrixA, rows, columns);
		View.print("\nThe column number with all even elements is: " + result + "\n");
		result = LogicA01.showNumberColumnAndSum(matrixA, rows, columns);
		View.print("\nThe number of column with even elements and a negative element on the main diagonal of matrix: " + result);
		
		
		View. print("\n\nInput elements of matrix: \n");
		MatrixInitializer.userInit(matrixA, -20, 20);
		View.printMatrix(matrixA);
		
		result = LogicA01.selectColumnWithAllEvenElements(matrixA, rows, columns);
		View.print("\nThe column number with all even elements is: " + result + "\n");
		result = LogicA01.showNumberColumnAndSum(matrixA, rows, columns);
		View.print("\nThe number of column with even elements and a negative element on the main diagonal of matrix: " + result);
		
		
		//A-02
		View. print("\n\nInput elements of matrix: \n");
		MatrixInitializer.userInit(matrixA, -20, 20);
		View.printMatrix(matrixA);
		
		answer = LogicA02.findRowIndex(matrixA, rows, columns);
		View.print("\nThe row number with all odd elements where the sum of absolute numbers is max is " + answer);
		
	}

}
