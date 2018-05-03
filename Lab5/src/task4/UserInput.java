package task4;

import java.util.Scanner;

public class UserInput {
	private static Scanner scn = new Scanner(System.in);

	public static String input(String msg) {
		System.out.print(msg);
		String letter = scn.next();
		return letter;
		
	}
}
