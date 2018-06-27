
import org.junit.Assert;
import org.junit.Test;
import by.bsu.Boroznovskaya.model.LogicA02;

public class TestLogicA02 {

	public void TestMatrix() {}
	
	@Test //when there are some rows with all odd elements in the matrix
	public void testFindRowNumberWithMaxAbsSum() {
		int rows = 3;
		int columns = 3;
		double[][] matrixA = { { 1.0, 2.0, 3.0 }, { 5.0, -11.0, -19.0 }, { 7.0, 3.0, 11.0} };
		int result = 2;
		Assert.assertEquals(result, LogicA02.findRowIndex(matrixA, rows, columns));
	}
	
	@Test //when there is no any all odd elements row in the matrix
	public void testFindAnyRowNumber() {
		int rows = 3;
		int columns = 3;
		double[][] matrixA = { { 8.0, -2.0, 3.0 }, { 5.0, -11.0, 0.0 }, { -13.0, 6.0, 11.0} };
		int result = 0;
		Assert.assertEquals(result, LogicA02.findRowIndex(matrixA, rows, columns));
	}
	

}
