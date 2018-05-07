package task2;

public class PerfectNumber {
	public static String findPerfectNumber(long number) {

		String resultMessage = "The number " + number + " is not perfect.";
		int sum = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		
		if (sum == number) {
			resultMessage = "The sum is " + sum + ". The number " + number + " is perfect.";
		}
		
		return resultMessage;
	}
}
