package exampleTask;

import java.util.Arrays;

public class Lab08ExampleTask {

	public static void main(String[] args) {
		
		// example 1
		int size = 0;
		int[] array = ArrayCreator.createArray(size);
		boolean result = ArrayWorker.checkEvenOddNumbersInterchange(array);
		View. print("\nArray: " + Arrays.toString(array));
		View. print("\nResult: " + result);
		
		// example 2
		size = 1;
		array = ArrayCreator.createArray(size);
		result = ArrayWorker.checkEvenOddNumbersInterchange(array);
		View. print("\nArray: " + Arrays.toString(array));
		View. print("\nResult: " + result);
		size = UserInput.input("\n\nInput size of array: ");
		array = ArrayCreator.createArray(size);
		
		// example 3
		ArrayInitializer.rndInit(array, -10, 10);
		result = ArrayWorker.checkEvenOddNumbersInterchange(array);
		View. print("\nArray: " + Arrays.toString(array));
		View. print("\nResult: " + result);
		
		// example 4
		View. print("\n\nInput elements of array: \n");
		ArrayInitializer.userInit(array);
		result = ArrayWorker.checkEvenOddNumbersInterchange(array);
		View. print("\nArray: " + Arrays.toString(array));
		View. print("\nResult: " + result);
	}

}
