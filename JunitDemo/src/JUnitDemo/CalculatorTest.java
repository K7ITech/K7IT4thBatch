package JUnitDemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculatorTest {
	
	Calculator c=new Calculator();
	ExpectedException exceptionRule=ExpectedException.none();
	@Test
	public void addTest()
	{
		assertEquals(25,c.add(10,15));
	}
	
	@Test
	public void negativeCaseAddTest()
	{
		assertNotEquals(25,c.add(20,50));
		
	}
		

	
}
