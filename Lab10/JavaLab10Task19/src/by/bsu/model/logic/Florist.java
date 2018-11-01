package by.bsu.model.logic;

import by.bsu.model.entity.container.Bouquet;

public class Florist {
	public static double calcTotalPrice(Bouquet bouquet) {
		double total = 0;
		
		for(int i= 0; i < bouquet.getSize(); i++) {
			total +=bouquet.getFlower()[i].getPrice();
		}
		
		return total;
	}
}
