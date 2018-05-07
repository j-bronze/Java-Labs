/**
 * The purpose of the program: ----------
 * The program has been written and tested with the 
 * Eclipse IDE for Java Developers (Version: Oxygen.2 Release(4.7.2))
 * @author Boroznovskaya Evgeniya
 * 1706v
 * 05/05/2018
 */

package task2;

public class Lab06Task02 {

	public static void main(String[] args) {

		while (true) {

		int number = UserInput.input("Enter an integer number: ");
		String result = PerfectNumber.findPerfectNumber(number);
		View.print(result);
		
		if (!Complete.complete("\nDo you want to continue? ")) {
			break;
		}
	}
	}

}
