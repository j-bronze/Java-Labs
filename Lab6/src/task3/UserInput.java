package task3;

import java.util.Scanner;

public class UserInput {
	public static Scanner scn = new Scanner(System.in);
	
	public static long input(String msg) {
		System.out.print(msg);
		return scn.nextInt();
	}
}
