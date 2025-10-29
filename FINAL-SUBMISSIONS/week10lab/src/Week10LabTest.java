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
		public void isPalindrome(){
		
		Week10Lab week10Lab = new Week10Lab();

		assertEquals("aba Should = true", true,week10Lab.isPalindrome("aba"));

		assertEquals("happy yppah  should = true",true week10Lab.isPalindrome("happy yppah "));

		assertEquals("HIih should = true ",true week10Lab.isPalindrome("HIih"));
	}

	/**
	* DESCRIBE TEST
	*/
    @Test
    public void maxValue( ) { 
        Week10Lab p4 = new Week10Lab();
        int[] array = { 68, 2, 40, 24, 1, -1, 4, 4, 100, -25, 6 };
        assertEquals( 100, p4.maxValue( array ) );
    }

    @Test
    public void testNull() {
        Week10Lab p4 = new Week10Lab();
        int[] array = null;
        assertEquals( 0, p4.maxValue( array ) );
    }

    @Test
    public void testEmpty() {
        Week10Lab p4 = new Week10Lab();
        int[] array = {};
        assertEquals( 0, p4.maxValue( array ) );
    }

    @Test
    public void testSingleNumber() {
        Week10Lab p4 = new Week10Lab();
        int[] array = {123};
        assertEquals( 123, p4.maxValue( array ) );
    }

} // END OF CLASS Week10LabTest
