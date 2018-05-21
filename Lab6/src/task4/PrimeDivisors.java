package task4;

public class PrimeDivisors {

	public static String findPrimeDivisors(int numeric) {
		String answer = "1";
		
		numeric = numeric > 0 ? numeric : -numeric;
		
		for (int i = 2; i <= numeric; i++) {

			if (numeric % i == 0) {
				answer += " " + Integer.toString(i);
				
				while (numeric % i == 0) {
					numeric /= i;
				}
			}
		}

		return answer;
	}
}