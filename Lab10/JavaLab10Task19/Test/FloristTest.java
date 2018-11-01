import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import by.bsu.model.entity.Camomile;
import by.bsu.model.entity.Iris;
import by.bsu.model.entity.Tulip;
import by.bsu.model.entity.container.Bouquet;
import by.bsu.model.logic.Florist;

public class FloristTest {

	private static Bouquet bouquet;
	
	public FloristTest() {}
	
	@BeforeClass
	public static void setUpClass() {
		bouquet = new Bouquet();
		
		Tulip whiteTulip = new Tulip (25, "white", 3.50);
//		Tulip yellowTulip = new Tulip (25, "yellow", 3.50);
		Camomile camomileSmall = new Camomile (45, "white", true, 2.80);
		Iris navyBlueIris = new Iris (35, "navy blue", 4.13);
		
		bouquet.add(navyBlueIris);
		bouquet.add(camomileSmall);
		bouquet.add(whiteTulip);
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	@Before
	public void setUp() {

	}

	@After
	public void setDown() {

	}

	@Test
	public void testCalcTotalPrice() {
		double expectedResult = 10.43;
		double result = Florist.calcTotalPrice(bouquet);
		assertEquals(expectedResult, result, 0.0);
		
		System.out.println(bouquet);
	}

}
