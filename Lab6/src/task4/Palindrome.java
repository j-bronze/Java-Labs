package task4;

public class Palindrome {
	public static String isPalindrome(long number) {
		String answer = "No";
		long initialNumber = number;
		long reverseNumber = 0;

		number = number > 0 ? number : -number;
		
		while (number>0) {
			reverseNumber = reverseNumber * 10 + number % 10;
			number = number / 10;
		}
		if(initialNumber==reverseNumber) {
			answer = "Yes";
		}
		
		return answer;
	}
}
