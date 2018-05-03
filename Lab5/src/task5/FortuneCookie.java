package task5;

import java.util.Random;

public class FortuneCookie {

	public static final String[] DIVINATIONS = {"When one door closes, another opens.",
												"Fall down seven times, stand up eight time.", 
												"Keep trying. You can do it.", 
												"Try one more time.", 
												"Your doom is as yet unsealed.",
												"Your lucky nubmers for today: 2 12 27",												
												"Wait a while longer."};
	
	public static String eatCookie(){
		
		Random rnd = new Random();
		
		String prophecy;
		int arrayLength = DIVINATIONS.length;
		
		switch (rnd.nextInt(arrayLength)) {
			case 0: prophecy = DIVINATIONS[0]; break;
			case 1: prophecy = DIVINATIONS[1]; break;
			case 2: prophecy = DIVINATIONS[2]; break;
			case 3: prophecy = DIVINATIONS[3]; break;
			case 4: prophecy = DIVINATIONS[4]; break;
			case 5: prophecy = DIVINATIONS[5]; break;
			case 6: prophecy = DIVINATIONS[6]; break;
			default: prophecy = "Ooops... "; break;
		}
		return prophecy;
	}
	
}
