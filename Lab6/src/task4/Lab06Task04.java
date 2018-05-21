/**
 * The purpose of the program: ----------
 * The program has been written and tested with the 
 * Eclipse IDE for Java Developers (Version: Oxygen.2 Release(4.7.2))
 * @author Boroznovskaya Evgeniya
 * 1706v
 * 04/05/2018
 */
package task4;

public class Lab06Task04 {

	public static void main(String[] args) {
		
		while (true) {
			
			//Find the sum and the quantity of digits of number
			long number = UserInput.inputLong("Input your number: ");
			View.print("Count of number digits = " + NumberWorker.countQuantityOfNumberDigit(number));
			View.print("Sum of number digits = " + NumberWorker.countSumOfNumberDigit(number));
						
			//Find the quantity of various digits of number
			//int numeric = UserInput.inputInt("Input your number: ");
			//View.print("Quantity of various digits of number = " + VariousDigits.countQuantityVariousDigits(numeric));
			
			
			//Find the max digit of the number
			//int numeric = UserInput.inputInt("Input your number: ");
			//View.print("Max digit of number is " + MaxDigit.findMaxDigit(numeric));
			
			
			//Is the number a palindrome?
			//long number = UserInput.inputLong("Input a number: ");
			//View.print("Is the number a palindrome? " + Palindrome.isPalindrome(number));
			
			
			//Is the number a prime number?
			//long number = UserInput.inputLong("Input a number: ");
			//View.print("Is the number a prime number? " + PrimeNumber.detectedPrimeNumber(number));
			
			
			//Find all prime divisors of the number (enumeration without repetitions )
			//int numeric = UserInput.inputInt("Input your number: ");
			//View.print("Prime divisors of number are " + PrimeDivisors.findPrimeDivisors(numeric));
			
			
			//Find the greatest common divisor (GCD) and the least common multiple (LCM) of numbers a and b
			//int num1 = UserInput.inputInt("Input number a: ");
			//int num2 = UserInput.inputInt("Input number b: ");
			//View.print("The greatest common divisor of numbers " + num1 + " and " + num2 + " is " + CommonDivisorAndMultiple.findGCD(num1, num2));
			//View.print("The least common multiple of numbers " + num1 + " and " + num2 + " is " + CommonDivisorAndMultiple.findLCM(num1, num2));
			
			
			if (!Complete.complete("\nDo you want to continue?")) {
				break;
			}
			
			
		}
				
		
	}

}
