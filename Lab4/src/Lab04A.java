/**
 * Назначение программы: ----------
 * Программа была написана и тестировалась с использованием среды 
 * разработки Eclipse IDE for Java Developers (Version: Oxygen.2 Release(4.7.2))
 * @author Борозновская Евгения
 * 1706v
 * 09/04/2018
 */
public class Lab04A {
	public static void main(String[] args) {
		double a = 4.4;
		double b = 4.4;
		double c = 6.2;
		
		//boolean result = Logic.solve(a, b, c);
		//boolean result = Logic.isTwoAndMoreSame(a, b, c);
		//boolean result = Logic.isOpposite(a, b, c);
		//boolean result = Logic.isAllPositive(a, b, c);
		//boolean result = Logic.isAnyPositive(a, b, c);
		//boolean result = Logic.isOnePositive(a, b, c);
		//boolean result = Logic.isTwoAndMorePositive(a, b, c);
		
		//int a = 4;
		//int b = 8;
		//int c = 10;
		
		//boolean result = Logic.isAllEven(a, b, c);
		//boolean result = Logic.isAnyEven(a, b, c);
		//boolean result = Logic.isOneEven(a, b, c);
		//boolean result = Logic.isAllEvenOrOdd(a, b, c);
		//boolean result = Logic.isTwoAndMoreEven(a, b, c);
		
		//System.out.println("a = " + a + "; b = " + b + "; c = " + c);
		//System.out.println("Result: " + result);
		
		/****************************/
		
		//целое четырёхзначное число!
		//int k = 4221;
		
		//boolean result = Logic.ascendingSequence(k);
		//boolean result = Logic.palindrome(k);
		
		//System.out.println("k = " + k);
		//System.out.println("Result: " + result);
		
		/****************************/
		
		//Координаты:
		//double x = 3.8;
		//double y = -0.9;
		
		//boolean result = Logic.coordinateFirstQuarter(x, y);
		//System.out.println("x = " + x + "; y = " + y);
		//System.out.println("Result: " + result);
		
		/****************************/
		
		//Здесь нужно раскомментировать вещественные числа а, b, с (строки 11-13)
		//boolean result = Logic.isTriangle(a, b, c);
		//boolean result = Logic.isEqualTriangle(a, b, c);
		boolean result = Logic.isIsoscelesTriangle(a, b, c);
		//boolean result = Logic.isRightTriangle(a, b, c);
		//boolean result = Logic.isIsoscelesAndRightTriangle(a, b, c);
		
		System.out.println("a = " + a + "; b = " + b + "; c = " + c);
		System.out.println("Result: " + result);
		
		/****************************/
		
		//Задаются 6 координат:
		//double x = 3.8;
		//double y = 4.9;
		//double x1 = 1.5;
		//double y1 = 8.5;
		//double x2 = 5.0;
		//double y2 = 2.0;
		//boolean result = Logic.coordinateWithinRectangle(x, y, x1, y1, x2, y2);
		
		//System.out.println("x1 = " + x1 + ", y1 = " + y1 + "; x2 = " + x2 + ", y2 = " + y2);
		//System.out.println("x = " + x + ", y = " + y);
		//System.out.println("Result: " + result);
	}

}
