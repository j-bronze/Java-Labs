package task1;

public class Lab05Task01 {

	public static void main(String[] args) {

		// Задание 1 - головы дракона
		View.print("The program counts numbers of Dragon's heads and eyes in defined user age.\n");

		int dragonAge = UserInput.input("Input a Dragon age: ");

		String result = DragonHeadsEyes.solve(dragonAge);

		View.print("\n" + result + "\n");

		

	}

}
