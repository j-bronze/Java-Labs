/**
 * Назначение программы: ----------
 * Программа была написана и тестировалась с использованием среды 
 * разработки Eclipse IDE for Java Developers (Version: Oxygen.2 Release(4.7.2))
 * @author Борозновская Евгения
 * 1706v
 * 15/04/2018
 */
package task3;

public class Lab05Task03 {

	public static void main(String[] args) {
		// Задание 3 - игра в кости
		int result = Dice.throwDices();
		
		View.print("\nThe scoring of throwing is " + result + " points.\n");
		
	}
}