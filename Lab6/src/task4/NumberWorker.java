package task4;

public class NumberWorker {

	public static int countQuantityOfNumberDigit(long number) {
		int quantity = 1;
		
		number = number > 0 ? number : -number;
		
		while (number > 9) {
			quantity++;
			number /= 10;
		}
		
		return quantity;
	}

	
	public static int countSumOfNumberDigit(long number) {
		int sum = 0;
		
		number = number > 0 ? number : -number;
		
		while (number > 0) {
			sum += number % 10;
			number /= 10;
		}
				
		return sum;
	}

}
