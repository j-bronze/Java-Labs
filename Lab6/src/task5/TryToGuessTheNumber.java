package task5;

import java.util.Random;

public class TryToGuessTheNumber {

	public static final int MAX_TRY = 10;
	public static final int RANGE = 100;

	public static String guessNumber() {

		int num;
		int generatedNumber;
		int count = 0;
		String message = " ";

		Random rnd = new Random();
		generatedNumber = rnd.nextInt(RANGE);

		while (count < MAX_TRY) {
			count++;
			num = UserInput.inputInt("Input your number: ");
			if (num == generatedNumber) {
				message = "Congratulations! You guess the number! It's " + num + ". Quantity of try is " + count + " from " + MAX_TRY;
				break;
			} else if (num < generatedNumber) {
				message = "Your number is lower then generated number. Try one more time.";
				System.out.println(message);
			} else if (num > generatedNumber) {
				message = "Your number is higher then generated number. Try one more time.";
				System.out.println(message);
			}
			if (count == MAX_TRY && num != generatedNumber) {
				message = "Game over.";
			}
		}

		return message;
	}

}