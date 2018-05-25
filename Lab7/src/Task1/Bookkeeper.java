package Task1;

public class Bookkeeper {
	public static int countQuantityOfGoods(Store stockroom) {
		int quantity = stockroom.getGood1().getQuantity() + 
					stockroom.getGood2().getQuantity() + 
					stockroom.getGood3().getQuantity();
		
		return quantity;
	}
	
	public static double countCommonPrice(Store stockroom) {
		
		double sum = stockroom.getGood1().getPrice()*stockroom.getGood1().getQuantity() + 
				stockroom.getGood2().getPrice()*stockroom.getGood2().getQuantity() +
				stockroom.getGood3().getPrice()*stockroom.getGood3().getQuantity();
		
		return sum;
	}
	
	public static int countTotalWeight(Store stockroom) {
		int totalWeight = stockroom.getGood1().getWeight()*stockroom.getGood1().getQuantity() +
				stockroom.getGood2().getWeight()*stockroom.getGood2().getQuantity() +
				stockroom.getGood3().getWeight()*stockroom.getGood3().getQuantity();
		
		return totalWeight;
	}
}
