package task4;

public class Logic {

	// Var.1. Hard code

	/*
	public static String defineLetter(char letter) {

		String resultMessage = "Please, enter a letter, not a symbol or a digit.";
		boolean flag = false;
		String letterType = " ";

		flag = Character.isLetter(letter);

		if (flag) {
			if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y'
					|| letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'
					|| letter == 'Y') {
				letterType = "vowel";

			} else if (letter == 'b' || letter == 'c' || letter == 'd' || letter == 'f' || letter == 'g'
					|| letter == 'h' || letter == 'j' || letter == 'k' || letter == 'l' || letter == 'm'
					|| letter == 'n' || letter == 'p' || letter == 'q' || letter == 'r' || letter == 's'
					|| letter == 't' || letter == 'v' || letter == 'w' || letter == 'x' || letter == 'z'
					|| letter == 'B' || letter == 'C' || letter == 'D' || letter == 'F' || letter == 'G'
					|| letter == 'H' || letter == 'J' || letter == 'K' || letter == 'L' || letter == 'M'
					|| letter == 'N' || letter == 'P' || letter == 'Q' || letter == 'R' || letter == 'S'
					|| letter == 'T' || letter == 'V' || letter == 'W' || letter == 'X' || letter == 'Z') {
				letterType = "consonant";
			}

			resultMessage = "The letter " + letter + " is a " + letterType + ".";

		}

		return resultMessage;
	}
	*/
	
	
	

	// Var.2 Array.
	
	public static final char[] VOWEL_LETTERS = { 'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y' };
	public static final char[] CONSONANT_LETTERS = { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q',
			'r', 's', 't', 'v', 'w', 'x', 'z', 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R',
			'S', 'T', 'V', 'W', 'X', 'Z' };

	public static String defineLetter(char letter) {

		String resultMessage = "Please, enter a letter, not a symbol, notu a digit.";
		boolean flag = false;
		String letterType = " ";

		flag = Character.isLetter(letter);

		if (flag) {

			for (int i = 0; i < VOWEL_LETTERS.length; i++) {

				if (letter == VOWEL_LETTERS[i]) {
					letterType = "vowel";
				} else if (letter == CONSONANT_LETTERS[i]) {
					letterType = "consonant";
				}

				resultMessage = "The letter " + letter + " is a " + letterType + ".";
			}

		}

		return resultMessage;
	}

	
	
	
	
	
}
