import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	Calculator cr=new Calculator();

	@Test
	public void testAdd() {
		
		double result=cr.add(5.0, 2.0);
		assertEquals(7.0,result,2);
		
		
		
	}
	@Test
	public void testSubtract() {
		
		double result=cr.subtract(5.0, 2.0);
		assertEquals(3.0,result,2);
	}
	@Test
	public void testMultiply() {
		
		double result=cr.multiply(5.0, 2.0);
		assertEquals(10.0,result,2);
	}
	@Test
	public void testDivide() {
		
		double result=cr.divide(5.0, 2.0);
		assertEquals(2.25,result,2);
	}
		
		
		
	

}
