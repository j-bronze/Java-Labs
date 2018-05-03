package task3;

import java.util.Random;

public class Dice {
	
	public static final int[] POINTS = { 1, 2, 3, 4, 5, 6 };
		
	public static int throwDices() {
		
		int diceSide1 = POINTS[new Random().nextInt(POINTS.length)];
		int diceSide2 = POINTS[new Random().nextInt(POINTS.length)];
	
		return diceSide1 + diceSide2;
	}
}
