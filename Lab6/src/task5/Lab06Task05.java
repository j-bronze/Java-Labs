/**
 * The purpose of the program: ----------
 * The program has been written and tested with the 
 * Eclipse IDE for Java Developers (Version: Oxygen.2 Release(4.7.2))
 * @author Boroznovskaya Evgeniya
 * 1706v
 * 21/05/2018
 */
package task5;

public class Lab06Task05 {

	public static void main(String[] args) {
		
		while (true) {
			
			View.print("Let's play! Try to guess tne number from 0 to 100.");
			View.print(TryToGuessTheNumber.guessNumber()); //why do it work on double Enter?
			
			
			if (!Complete.complete("\nDo you want to continue?")) {
				break;
			}
		}

	}

}
