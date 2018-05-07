/**
 * The purpose of the program: ----------
 * The program has been written and tested with the 
 * Eclipse IDE for Java Developers (Version: Oxygen.2 Release(4.7.2))
 * @author Boroznovskaya Evgeniya
 * 1706v
 * 06/05/2018
 */

package task3;

public class Lab06Task03 {

	public static void main(String[] args) {

		while (true) {

			long number = UserInput.input("Enter a number, please: ");
			long result = ReverseOrderNumber.Reverse(number);

			View.print("\nThe number is " + number + "\n");
			View.print("\nIn reverse order is " + result + "\n");

			if (!Complete.complete("Do you want to continue? ")) {
				break;
			}
		}
	}

}
