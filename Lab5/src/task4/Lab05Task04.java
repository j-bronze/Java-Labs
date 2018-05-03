/**
 * Назначение программы: ----------
 * Программа была написана и тестировалась с использованием среды 
 * разработки Eclipse IDE for Java Developers (Version: Oxygen.2 Release(4.7.2))
 * @author Борозновская Евгения
 * 1706v
 * 16/04/2018
 */

package task4;

public class Lab05Task04 {

	public static void main(String[] args) {
		// Задание 4 - гласная или согласная
		String inputLetter = UserInput.input("Please, input a character: ");
		char charLet = inputLetter.charAt(0);
		String result = Logic.defineLetter(charLet);
		
		View.print("\n" + result + " \n");
		
	}

}
