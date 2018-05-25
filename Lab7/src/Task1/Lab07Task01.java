/**
 * The purpose of the program: ----------
 * The program has been written and tested with the 
 * Eclipse IDE for Java Developers (Version: Oxygen.2 Release(4.7.2))
 * @author Boroznovskaya Evgeniya
 * 1706v
 * 24/05/2018
 */

package Task1;

public class Lab07Task01 {

	public static void main(String[] args) {
		Good good1 = new Good("Paprika milled", 1.93, 10, true, 42);
		Good good2 = new Good("Pepper whole", 1.00, 15, false, 150);
		Good good3 = new Good("Pepper milled", 1.15, 10, true, 200);
		
		Store stockroom = new Store("FlavoringAndSpices");
		String nameStockroom = stockroom.getNameStorage();
		stockroom.setGood1(good1);
		stockroom.setGood2(good2);
		stockroom.setGood3(good3);
		
		int commonCountOfGoods = Bookkeeper.countQuantityOfGoods(stockroom);
		double commonPrice = Bookkeeper.countCommonPrice(stockroom);
		int totalWeigtht = Bookkeeper.countTotalWeight(stockroom);
		
		View.print("Information about store " + nameStockroom);
		View.print("\nCommon count of all of goods at the storage = " + commonCountOfGoods + " units.");
		View.print("\nWhole sum (in monetary units) = " + commonPrice + " m.u.");
		View.print("\nTotal weight of goods = " + totalWeigtht + "g.");
	}

}
