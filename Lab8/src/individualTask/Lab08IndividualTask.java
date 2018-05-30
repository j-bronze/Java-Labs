/**
 * The purpose of the program: to learn methods of work with arrays in Java.
 * Laboratory work ¹8. Java-arrays.
 * The program has been written and tested with the 
 * Eclipse IDE for Java Developers (Version: Oxygen.2 Release(4.7.2))
 * @author Boroznovskaya Evgeniya
 * 1706v
 * 30/05/2018
 */

package individualTask;

import java.util.Arrays;

public class Lab08IndividualTask {

	public static void main(String[] args) {
		int size = 0;
		double[] array;
		int[] arrayIntNumbers;
		double result;
		int resultIndex;
		double userInputNumber;
		double userInputNumberRange;
		
		
		size = UserInput.input("\nInput size of array: ");
		array = ArrayCreator.createArray(size);
		ArrayInitializer.rndInitDouble(array, -20, 20);
		View.print("\nArray: " + Arrays.toString(array)+ "\n");
		
		result = Logic01.countSumNegativeElements(array);
		View.print("\nThe sum of negative elements of the array is: " + result);
		result = Logic01.multiplyElementsBetweenMaxMin(array);
		View.print("\nThe multiplication of elements of the array between max and min elements is: " + result);
		
		result = Logic03.findMaxElement(array);
		View.print("\nThe max element in the array is: " + result);
		result = Logic03.SumToLastPositiveElement(array);
		View.print("\nThe sum of elements to last positive element in array is: " + result);
		
		result = Logic05.findMaxAbsElem(array);
		View.print("\nThe absolute max element in array is: " + result);
		result = Logic05.sumElementsBetweenFirstSecondPositiveElements(array);
		View.print("\nThe sum of elements between the first and the second positive elements in array is: " + result);
		
		resultIndex = Logic06.findIndexMaxAbs(array);
		View.print("\nThe index of absolute max element of the array is: " + resultIndex);
		result = Logic06.findSumElementsAfterFirstPositive(array);
		View.print("\nThe sum of elements after first positive element of the array is: " + result);
		
		userInputNumber = UserInput.input("\nEnter any number: ");
		resultIndex = Logic07.countGreaterUserInputNubmer(array, userInputNumber);
		View.print("\nThe quantity of elements greater C(user input) is: " + resultIndex);
		result = Logic07.multiplyElementsAfterAbsMaxElement(array);
		View.print("\nThe multiplication of elements situated after absolute max element is: " + result);
		
		result = Logic09.multiplyNegativeElements(array);
		View.print("\nThe multiplication of negative elements in array is: " + result);
		result = Logic09.sumPositiveToMaxElement(array);
		View.print("\nThe sum of positive elements till max element in array is: " + result);
		
		result = Logic10.findMinElement(array);
		View.print("\nThe min element of array is: " + result);
		result = Logic10.sumElementsFirstToLastPositiveElements(array);
		View.print("\nThe sum of elements between the first and the last positive elements in array is: " + result);
		
		userInputNumber = UserInput.input("\nEnter lower range limit: ");
		userInputNumberRange = UserInput.input("Enter upper range limit : ");
		resultIndex = Logic11.countQuantityInRange(array, userInputNumber, userInputNumberRange);
		View.print("\nThe quantity of elements which lie in the range from A to B (user input the range limits) is: " + resultIndex);
		result = Logic11.sumElementsAfterMaxElement(array);
		View.print("\nThe sum of elements after max element is: " + result);
		
		result = Logic12.multiplyPositiveElements(array);
		View.print("\nThe multiplication of positive elements in array is: " + result);
		result = Logic12.sumToMinElement(array);
		View.print("\nThe sum of elements till min element in array is: " + result);
		
		result = Logic13.sumElementsOddIndexes(array);
		View.print("\nThe sum of elements with odd indexes in array is: " + result);
		result = Logic13.sumElementsFirstToLastNegativeElements(array);
		View.print("\nThe sum of elements between the first and the last negative elements in array is: " + result);
		
		resultIndex = Logic14.findIndexMinElement(array);
		View.print("\nThe index of min element in array is: " + resultIndex);
		result = Logic14.sumElementsBetweenFirstSecondNegativeElements(array);
		View.print("\nThe sum of elements between the first and the second negative elements in array is: " + result);
		
		resultIndex = Logic15.countQuantityZero(array);
		View.print("\nThe quantity of elements which equal zero is: " + resultIndex);
		result = Logic15.countSumAfterMinElement(array);
		View.print("\nThe sum of elements after min element is: " + result);
		
		
		
		size = UserInput.input("\n\nInput size of array: ");
		arrayIntNumbers = ArrayCreator.createIntArray(size);
		ArrayInitializer.rndInitInt(arrayIntNumbers, -10, 10);;
		View.print("\nArray: " + Arrays.toString(arrayIntNumbers)+ "\n");
		
		resultIndex = Logic02.multiplyElementsEvenIndexes(arrayIntNumbers);
		View.print("\nThe multiplication of elements with even indexes is: " + resultIndex);
		resultIndex = Logic02.sumElementsFirstToLastElementsEqualZero(arrayIntNumbers);
		View.print("\nThe sum of elements between the first and the last elements equal zero is: " + resultIndex);
		
		resultIndex = Logic04.findIndexMaxElem(arrayIntNumbers);
		View.print("\nThe index of max element is: " + resultIndex);
		resultIndex = Logic04.multiplyElementsBetweenFirstSecondElementsZero(arrayIntNumbers);
		View.print("\nThe multiplication of elements between the first and the second elements equal zero is: " + resultIndex);
		
		resultIndex = Logic08.countQuantityPositiveElements(arrayIntNumbers);
		View.print("\nThe quantity of positive elements in array is: " + resultIndex);
		resultIndex = Logic08.findSumElementsAfterLastZero(arrayIntNumbers);
		View.print("\nThe sum of elements after last element equals zero in array is: " + resultIndex);
		
		
		
	}

}
