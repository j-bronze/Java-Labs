package task3;

import java.util.Scanner;

public class Complete {
	public static boolean complete(String question) {
		System.out.println(question + "Yes or No?");
		Scanner scan = new Scanner(System.in);
		String answer = scan.next().toLowerCase();
		return answer.equals("yes");
	}
}
