package Task1;

public class Bookkeeper {
	int quantity = 0;
		if (stockroom.getGood1().isAvailability()) {
			quantity += stockroom.getGood1().getQuantity();
		}
		if (stockroom.getGood2().isAvailability()) {
			quantity += stockroom.getGood2().getQuantity();
		}
		if (stockroom.getGood3().isAvailability()) {
			quantity += stockroom.getGood3().getQuantity();
		}
		
		return quantity;
	}
	
	public static double countCommonPrice(Store stockroom) {
		double sum = 0;
		if (stockroom.getGood1().isAvailability()) {
			sum += stockroom.getGood1().getPrice() * stockroom.getGood1().getQuantity();
		}
		if (stockroom.getGood2().isAvailability()) {
			sum += stockroom.getGood2().getPrice() * stockroom.getGood2().getQuantity();
		}
		if (stockroom.getGood3().isAvailability()) {
			sum += stockroom.getGood3().getPrice() * stockroom.getGood3().getQuantity();
		}
		
		return sum;
	}
	
	public static int countTotalWeight(Store stockroom) {
		int totalWeight = 0;
		if (stockroom.getGood1().isAvailability()) {
			totalWeight += stockroom.getGood1().getWeight() * stockroom.getGood1().getQuantity();
		}
		if (stockroom.getGood2().isAvailability()) {
			totalWeight += stockroom.getGood2().getWeight() * stockroom.getGood2().getQuantity();
		}
		if (stockroom.getGood3().isAvailability()) {
			totalWeight += stockroom.getGood3().getWeight() * stockroom.getGood3().getQuantity();
		}
		
		return totalWeight;
	}
}
