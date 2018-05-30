package individualTask;

public class Logic15 {
	// In one-dimension array of N real numbers find:
	// quantity of elements which equal zero and 
	// the sum of elements after min element

	public static int countQuantityZero(double[] array) {
		int quantity = 0;
		
		for(int i = 0; i<array.length;i++) {
			if(array[i]==0) {
				quantity++;
			}
		}
		return quantity;
	}

	
	public static double countSumAfterMinElement(double[] array) {
		double sum = 0;
		double min = 0;
		int indexMin = -1;

		//find min element and it's index
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
			if (array[i] == min) {
				indexMin = i;
			}
		}
		//System.out.println("\nMin elem is   " + min + "   on position   " + indexMin);
		
		//find he sum of elements after min element
		for(int i = indexMin+1; i<array.length;i++) {
			sum+=array[i];
		}
		
		return sum;
	}
}
