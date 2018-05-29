package keyTask;

public class ArithmeticGeometricMeanValue {
	public static double findArithmeticMeanValue(double[] array) {
		double sum = 0;
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			count++;
		}
		
		return sum / count;
	}

	public static double findGeometricMeanValue(double[] array) {
		double mult = 1;
		int count = 0;
				
		for (int i = 0; i < array.length; i++) {
			 mult *= array[i];
			count++;			
		}
		
		return Math.pow(mult, 1.0/count);
	}
}
