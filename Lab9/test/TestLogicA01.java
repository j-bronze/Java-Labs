import static org.junit.Assert.*;
import org.junit.*;
import by.bsu.Boroznovskaya.model.LogicA01;

public class TestLogicA01 {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	public void TestMatrix() {}

	@Test //when there are some columns with all even elements in the matrix
	public void testSelectColumnEvenElements() {
		int rows = 3;
		int columns = 3;
		double[][] matrixA = { { 1.0, 2.0, 3.0 }, { 5.0, 4.0, 3.0 }, { 7.0, 6.0, 8.0 } };
		int result = 2;
		Assert.assertEquals(result, LogicA01.selectColumnWithAllEvenElements(matrixA, rows, columns));
	}

	@Test //when there are no any columns with all even elements in the matrix
	public void testNOColumnWithAllEvenElements() {
		int rows = 3;
		int columns = 3;
		double[][] matrixA = { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 3.0 }, { 7.0, 6.0, 8.0 } };

		try {
			LogicA01.selectColumnWithAllEvenElements(matrixA, rows, columns);
		} catch (NoSuchMethodError exc) {
			// ...
		}
	}
    
    
    
    @Test //when there is the column with all even elements in the matrix and on the mail diagonal in this column is a negative element
    public void testShowNumberColumnAndSum() {
    	int rows = 3;
    	int columns = 3;
        double[][] matrixA = {{-10.0, 2.0, 3.0}, {4.0, 4.0, 3.0}, {2.0, 1.0, -8.0}};
        int resultColumn = 1; 
        int resultSum = -4; 
        Assert.assertEquals(resultColumn, LogicA01.showNumberColumnAndSum(matrixA, rows, columns));
        Assert.assertEquals(resultSum, LogicA01.showNumberColumnAndSum(matrixA, rows, columns));
    }
    
    @Test //when there is the column with all even elements in the matrix and on the mail diagonal in this column is a positive element
    public void testShowColumnEvenElementsAndNoNegativeElementOnMainDiagonal() {
    	int rows = 3;
    	int columns = 3;
    	double[][] matrixA = {{10.0, 2.0, 3.0}, {5.0, 4.0, 3.0}, {7.0, 6.0, 8.0}};
    	int resultColumn = 1; 
        int resultSum = 0; 
        Assert.assertEquals(resultColumn, LogicA01.showNumberColumnAndSum(matrixA, rows, columns));
        Assert.assertEquals(resultSum, LogicA01.showNumberColumnAndSum(matrixA, rows, columns));
        try {
        	LogicA01.showNumberColumnAndSum(matrixA, rows, columns);
        	//fail();
        }catch(NoSuchMethodError exc) {
        	//...
        }
    }
    
    @Test //when there are no any columns with all even elements in the matrix, but on the mail diagonal is a negative element
    public void testNOColumnWithAllEvenElementsAndNoSum() {
    	int rows = 3;
    	int columns = 3;
    	double[][] matrixA = {{1.0, 2.0, 3.0}, {5.0, 4.0, 3.0}, {7.0, 6.0, -8.0}};
        
        try {
        	LogicA01.showNumberColumnAndSum(matrixA, rows, columns);
        }catch(NoSuchMethodError exc) {
        	//...
        }
    }
    
    
    
    
    
    
    
    
    
    
    
}
