/**
 * The purpose of the program: to learn methods of work with arrays in Java.
 * Laboratory work ¹8. Java-arrays.
 * The program has been written and tested with the 
 * Eclipse IDE for Java Developers (Version: Oxygen.2 Release(4.7.2))
 * @author Boroznovskaya Evgeniya
 * 1706v
 * 27/05/2018
 */

package keyTask;

import java.util.Arrays;

public class Lab08KeyTask {
	
	public static void main(String[] args) {
		
		int size = 0;
		double[] array;
		double result;
		boolean resultBool;
		int indexOfElement;
		
		//Find extremum values (min & max elements) in the one-dimension array;
		size = UserInput.input("\nInput size of array: ");
		array = ArrayCreator.createArray(size);
		ArrayInitializer.rndInit(array, -10, 10);
		
		View. print("\nArray: " + Arrays.toString(array));
		result = ExtremumElements.findMax(array);
		View. print("\nMax element in array is: " + result);
		result = ExtremumElements.findMin(array);
		View. print("\nMin element in array is: " + result);
		
		//Find arithmetic mean value & geometric mean value of the one-dimension array elements;
		result = ArithmeticGeometricMeanValue.findArithmeticMeanValue(array);
		View. print("\n\nArithmetic mean value: " + result);
		result = ArithmeticGeometricMeanValue.findGeometricMeanValue(array);
		View. print("\nGeometric mean value: " + result);
		
		//Check, if the elements of the array are in ascending or descending order;
		//View. print("\n\nInput elements of array: \n");
		//ArrayInitializer.userInit(array);
		//View. print("\nArray: " + Arrays.toString(array));
		resultBool = SortArray.isSorted(array, size);
		View. print("\n\nArray is sorted: " + resultBool);
		
		//Find the index of the first local min (max),
		//and if there is no such elements, return -1;
		indexOfElement = LocalMinMaxElement.findFirstIndexOfLocalMin(array);
		View. print("\n\nThe index of first local min element is: " + indexOfElement);
		indexOfElement = LocalMinMaxElement.findFirstIndexOfLocalMax(array);
		View. print("\n\nThe index of first local max element is: " + indexOfElement);
		
		//Reverse elements and not use expanded memory
		View. print("\n\nThe Reverse array is: " + Arrays.toString(ReverseArray.reverseArray(array)));
	}
}
