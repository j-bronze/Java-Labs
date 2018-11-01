package by.bsu.model.controller;

import by.bsu.model.entity.Camomile;
import by.bsu.model.entity.Iris;
import by.bsu.model.entity.Orchid;
import by.bsu.model.entity.Tulip;
import by.bsu.model.entity.container.Bouquet;
import by.bsu.model.logic.Florist;

public class Lab10Task19 {

	public static void main(String[] args) {
		Bouquet bouquet = new Bouquet();
		Bouquet bouquetOrchid = new Bouquet();
		double totalPrice;
		
		Tulip whiteTulip = new Tulip (25, "white", 3.50);
		Tulip yellowTulip = new Tulip (25, "yellow", 3.50);
		Camomile camomileSmall = new Camomile (45, "white", true, 2.80);
		Iris navyBlueIris = new Iris (35, "navy blue", 4.13);
		Orchid roseOrchid = new Orchid (60, "rose", 10, 8.90);
		
		bouquet.add(navyBlueIris);
		bouquet.add(navyBlueIris);
		bouquet.add(navyBlueIris);
		bouquet.add(camomileSmall);
		bouquet.add(whiteTulip);
		bouquet.add(whiteTulip);
		bouquet.add(whiteTulip);
		bouquet.add(yellowTulip);
		bouquet.add(yellowTulip);
		bouquet.add(yellowTulip);
		
		System.out.println(bouquet);
		totalPrice = Florist.calcTotalPrice(bouquet);
		System.out.println("Total: " + totalPrice);
		System.out.println();
		
		bouquetOrchid.add(roseOrchid);
		bouquetOrchid.add(roseOrchid);
		bouquetOrchid.add(roseOrchid);
		
		System.out.println(bouquetOrchid);
		totalPrice = Florist.calcTotalPrice(bouquetOrchid);
		System.out.println("Total: " + totalPrice);
		
		
	}

}
