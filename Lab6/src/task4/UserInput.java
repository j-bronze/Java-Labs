package task4;

import java.util.Scanner;

public class UserInput {
	private static final Scanner scn = new Scanner(System.in);
	
	public static long inputLong(String msg) {
		System.out.println(msg);
		return scn.nextLong();
	}
	
	public static int inputInt(String msg) {
		System.out.println(msg);
		return scn.nextInt();
	}
}
