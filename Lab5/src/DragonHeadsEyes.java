
public class DragonHeadsEyes {
	// предполагаемое количество глаз на одной голове дракона
	public static final int EYES = 2;
			
	//градация возраста дракона
	public static final int YOUNG_AGE = 200; 
	public static final int OLD_AGE = 300; 

	// Количество отрастаемых ежегодно голов по возрастам дракона
	public static final int HEADS_YOUNG_DRAGON = 3;
	public static final int HEADS_GROWN_DRAGON = 2;
	public static final int HEADS_OLD_DRAGON = 1;
			
	public static String solve(int age) {
		String resultMessage = "Please, enter correct age of Dragon.";
		boolean flag = false;
		
		int heads = 0; // количество голов дракона
		int countEyes = 0;
	
		if(age > 0 && age < YOUNG_AGE)	{
			heads = age * HEADS_YOUNG_DRAGON;
			flag = true;
		}else if(age >= YOUNG_AGE && age < OLD_AGE)	{
			heads = (YOUNG_AGE-1) * HEADS_YOUNG_DRAGON + (age - YOUNG_AGE+1) * HEADS_GROWN_DRAGON;
			flag = true;
		}else if(age >= OLD_AGE)	{
			heads = (YOUNG_AGE - 1) * HEADS_YOUNG_DRAGON + (OLD_AGE - YOUNG_AGE) * HEADS_GROWN_DRAGON + (age - OLD_AGE + 1) * HEADS_OLD_DRAGON;
			flag = true;
		}
		
		countEyes = heads * EYES;
		
		if (flag) {
			resultMessage = "In age of " + age + " years the Dragon has " + heads + " heads and " + countEyes + " eyes.";
		}
			
		return resultMessage;
		
	}
}
