package task1;

import java.util.Random;

public class HeadsOrTails {

	public static final int NUMBER_THROWS = 1000;
	public static final int HEADS = 1;
	public static final int TAILS = 0;

	public static String tossCoin() {

		int countHeads = 0;
		int countTails = 0;
		int progress = 0;
		String resultMessage = "Ooops... something went wrong.";

		while (progress < NUMBER_THROWS) {

			Random rnd = new Random();

			if (rnd.nextInt(2) == HEADS) {
				countHeads++;
			} else {
				countTails++;
			}
			progress++;
		}

		resultMessage = "In " + NUMBER_THROWS + " throws there are " + countHeads + " Heads and " + countTails
				+ " Tails.";

		return resultMessage;
	}

}
