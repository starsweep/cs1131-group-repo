import static org.junit.Assert.*;
import org.junit.Test;

/**
* DESCRIBE TEST SUITE
* @author Andrew Martin, Charles Ceccardi, Samuel Mitchell, Mitchell Onkea
*/
public class Week10LabTest {
	/**
	* DESCRIBE TEST
	*/
	@Test
	public void sumDigits( ) {
		Week10Lab lab = new Week10Lab();
		
		assertEquals(22, lab.sumDigits(52825));
	 			
		assertEquals(2, lab.sumDigits(2));
	
		assertEquals(0, lab.sumDigits(0));	
	 
		assertEquals(-11, lab.sumDigits(-1343));	
	}
 
	/**
	* DESCRIBE TEST
	*/@Test
	public void isPalindrome( ) { }

	/**
	* DESCRIBE TEST
	*/
	@Test
	public void maxValue( ) { }

} // END OF CLASS Week10LabTest
