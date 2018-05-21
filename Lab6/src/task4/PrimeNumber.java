package task4;

public class PrimeNumber {
	public static String detectedPrimeNumber(long number) {
		String answer = "Something went wrong";
		
		number = number > 0 ? number : -number;
		
		for(int i = 2; i<number;i++) {
			if(number%i==0) {
				answer = "No";
				break;
			}else{
			answer = "Yes";
			}
		}
		
		return answer;
	}
}
