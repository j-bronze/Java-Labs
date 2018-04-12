/**
 * Назначение программы: ----------
 * Программа была написана и тестировалась с использованием среды 
 * разработки Eclipse IDE for Java Developers (Version: Oxygen.2 Release(4.7.2))
 * @author Борозновская Евгения
 * 1706v
 * 11/04/2018
 */
public class Lab05 {

	public static void main(String[] args) {
		// Задание 1 - головы дракона
		View.print("The program counts numbers of Dragon's heads and eyes in defined user age.\n");
		
		int dragonAge = UserInput.input("Input a Dragon age: ");
		
		String result = DragonHeadsEyes.solve(dragonAge);
		
		View.print("\n" + result + "\n");
		
		
		//задание 2
	}

}
