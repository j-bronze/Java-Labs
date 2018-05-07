package task2;

import java.util.Scanner;

public class UserInput {
	private static Scanner scn = new Scanner(System.in);
	
	public static int input(String msg) {
		System.out.print(msg);
		return scn.nextInt();
	}
}
