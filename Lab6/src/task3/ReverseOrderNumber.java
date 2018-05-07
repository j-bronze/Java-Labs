package task3;

public class ReverseOrderNumber {

	public static long Reverse(long number) {
		
		long reverseNumber = 0;

		//delete zero in the end of number
		while (number % 10 == 0) {
			number = number / 10;
		}
		
		//rewrite number in reverse order
		while (number>0) {
			reverseNumber = reverseNumber * 10 + number % 10;
			number = number / 10;
		}

		return reverseNumber;
	}

}
