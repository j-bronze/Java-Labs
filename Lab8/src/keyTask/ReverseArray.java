package keyTask;

public class ReverseArray {
	public static double[] reverseArray(double[] arr) {
			
		if (arr.length >= 1) {
			
			for (int i = 0; i<=arr.length/2; i++) {
				
				arr[i] = arr[i] + arr[arr.length-1-i];
				arr[arr.length-1-i] = arr[i] - arr[arr.length-1-i];
				arr[i] = arr[i] - arr[arr.length-1-i];
				
			}
		}
		
		return arr;
	}
}
