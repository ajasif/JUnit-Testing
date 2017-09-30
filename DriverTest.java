import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DriverTest {

	/** The test fixture to use in the tests. **/
	private Driver driver;
	
	/** A method to initialize the test fixture **/
	@Before
	public void setUp() {
		driver = new Driver(9999999);
	}
	
	@Test
	public void testGetReverse() {
		assertEquals("testGetPalindrome failed!", "olleh", Driver.getReverse("hello"));
		assertEquals("testGetPalindrome failed!", "", Driver.getReverse(""));
		assertEquals("testGetPalindrome failed!", "The Blue Sky", Driver.getReverse("ykS eulB ehT"));		
	}
	
	@Test(expected = ArithmeticException.class)
	public void testUpgrade() {
		driver.upgrade(2147000000);
	}
	
	

}
