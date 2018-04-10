
public class Logic {
	/* A-01 */
	public static boolean solve1(double a, double b, double c) {
		boolean answer;
		answer = a != b && b != c && a != c;
		return answer;
	}

	/* A-02 */
	public static boolean isTwoAndMoreSame(double a, double b, double c) {
		boolean answer;
		answer = (a == b) || (b == c) || (a == c);
		return answer;
	}

	public static boolean isOpposite(double a, double b, double c) {
		boolean answer;
		answer = ((a + b) == 0) || ((b + c) == 0) || ((a + c) == 0);
		return answer;
	}

	/* A-03 */
	public static boolean isAllPositive(double a, double b, double c) {
		boolean answer;
		answer = (a > 0) && (b > 0) && (c > 0);
		return answer;
	}

	/* A-04 */
	public static boolean isAnyPositive(double a, double b, double c) {
		boolean answer;
		answer = (a > 0) || (b > 0) || (c > 0);
		return answer;
	}

	/* A-05 */
	public static boolean isOnePositive(double a, double b, double c) {
		boolean answer;
		answer = ((a > 0) && (b < 0) && (c < 0)) || ((a < 0) && (b > 0) && (c < 0)) || ((a < 0) && (b < 0) && (c > 0));
		return answer;
	}

	/* A-06 */
	public static boolean isTwoAndMorePositive(double a, double b, double c) {
		boolean answer;
		answer = ((a > 0) && (b > 0) && (c > 0)) || ((a > 0) && (b > 0) && (c < 0)) || ((a > 0) && (b < 0) && (c > 0))
				|| ((a < 0) && (b > 0) && (c > 0));
		return answer;
	}

	/* A-07 */
	/* Чётность в теории чисел — характеристика целого числа */
	public static boolean isAllEven(int a, int b, int c) {
		boolean answer;
		answer = (a % 2 == 0) && (b % 2 == 0) && (c % 2 == 0);
		return answer;
	}

	/* A-08 */
	public static boolean isAnyEven(int a, int b, int c) {
		boolean answer;
		answer = (a % 2 == 0) || (b % 2 == 0) || (c % 2 == 0);
		return answer;
	}

	/* A-09 */
	public static boolean isOneEven(int a, int b, int c) {
		boolean answer;
		answer = ((a % 2 == 0) && (b % 2 != 0) && (c % 2 != 0)) || ((a % 2 != 0) && (b % 2 == 0) && (c % 2 != 0))
				|| ((a % 2 != 0) && (b % 2 != 0) && (c % 2 == 0));
		return answer;
	}

	/* A-10 */
	public static boolean isAllEvenOrOdd(int a, int b, int c) {
		boolean answer;
		answer = ((a % 2 == 0) && (b % 2 == 0) && (c % 2 == 0)) || ((a % 2 != 0) && (b % 2 != 0) && (c % 2 != 0));
		return answer;
	}

	/* A-11 */
	public static boolean isTwoAndMoreEven(int a, int b, int c) {
		boolean answer;
		answer = ((a % 2 == 0) && (b % 2 == 0) && (c % 2 == 0)) || ((a % 2 != 0) && (b % 2 == 0) && (c % 2 == 0))
				|| ((a % 2 == 0) && (b % 2 != 0) && (c % 2 == 0)) || ((a % 2 == 0) && (b % 2 == 0) && (c % 2 != 0));
		return answer;
	}

	/* A-12 */
	public static boolean ascendingSequence(int k) {
		boolean answer;

		/* CopyPaste, конечно, а как иначе, если алгоритм линейный? */
		int a = k % 10;
		k = k / 10;
		int b = k % 10;
		k = k / 10;
		int c = k % 10;
		k = k / 10;
		int d = k % 10;

		answer = (a > b) && (b > c) && (c > d);
		return answer;
	}

	/* A-13 */
	public static boolean palindrome(int k) {
		boolean answer;

		/* CopyPaste, конечно, а как иначе, если алгоритм линейный? */
		int a = k % 10;
		k = k / 10;
		int b = k % 10;
		k = k / 10;
		int c = k % 10;
		k = k / 10;
		int d = k % 10;

		answer = (a == d) && (b == c) || (a == b && b == c && c == d);// и репдиджит, и репьюнит. Заодно узнала, что это
																		// значит.
		return answer;
	}

	/* A-14 */
	public static boolean coordinateFirstQuarter(double x, double y) {
		boolean answer;
		answer = x > 0 && y > 0;
		return answer;
	}

	/* A-15 */
	public static boolean isTriangle(double a, double b, double c) {
		boolean answer;
		answer = b + c > a && a + b > c && a + c > b;
		return answer;
	}

	/* A-16 */
	public static boolean isEqualTriangle(double a, double b, double c) {
		boolean answer;
		answer = a == b && b == c && c == b;
		return answer;
	}

	/* A-17 */
	public static boolean isIsoscelesTriangle(double a, double b, double c) {
		boolean answer;
		answer = (a == b) || (b == c) || (a == c);
		return answer;
	}

	/* A-18 */
	public static boolean isRightTriangle(double a, double b, double c) {
		boolean answer;
		answer = (a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b);
		return answer;
	}

	/* A-19 */
	public static boolean isIsoscelesAndRightTriangle(double a, double b, double c) {
		boolean answer;
		answer = (a == b || b == c || a == c) && ((a * a == b * b + c * c) || (b * b == a * a + c * c)
				|| (c * c == a * a + b * b));
		return answer;
	}

	/* A-20 */
	public static boolean coordinateWithinRectangle(double x, double y, double x1, double y1, double x2, double y2) {
		boolean answer;
		answer = (x2 > x1 && y2 < y1) && (x < x2 && y < y1) && (x > x1 && y > y2);
		return answer;
	}
}
