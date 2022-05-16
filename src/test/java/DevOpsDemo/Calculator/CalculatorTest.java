package DevOpsDemo.Calculator;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertFalse;
import org.testng.annotations.Test;

public class CalculatorTest {
	Calculator calculator = new Calculator();
	@Test
	public void sumTest() {
		//This test will check the sum functionality of the test
		
		assertTrue("Sum function not working fine.", calculator.sum(10, 20) == 30);
	}
	
	@Test
	public void subtractTest() {
		//This test will check the subtract functionality of the test
		
		assertTrue("Sum function not working fine.", calculator.subtract(100, 20) == 80);
	}
	
	@Test
	public void multiplyTest() {
		//This test will check the multiply functionality of the test
		
		assertTrue("Sum function not working fine.", calculator.multiply(10, 20) == 200);
	}
	
	@Test
	public void devideTest() throws Exception {
		//This test will check the multiply functionality of the test
		
		assertTrue("Sum function not working fine.", calculator.divide(20, 10) == 2);
	}
}
