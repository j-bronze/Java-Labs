package task4;

public class CommonDivisorAndMultiple {

	public static int findGCD(int num1, int num2) {
		int gcd = 0;

		while (num1 != 0 && num2 != 0) {
			if (num1 > num2) {
				num1 %= num2;
			} else {
				num2 %= num1;
			}
		}
		gcd = num1 + num2;

		return gcd;
	}

	public static int findLCM(int num1, int num2) {
		int lcm = 0;
		int number1 = num1;
		int number2 = num2;
		int gcd = 0;

		while (num1 != 0 && num2 != 0) {
			if (num1 > num2) {
				num1 %= num2;
			} else {
				num2 %= num1;
			}
		}

		gcd = num1 + num2;
		lcm = number1 / gcd * number2;

		return lcm;
	}
}
