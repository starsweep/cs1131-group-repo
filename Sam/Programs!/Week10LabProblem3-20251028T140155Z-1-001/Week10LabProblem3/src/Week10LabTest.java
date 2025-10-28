

import static org.junit.Assert.*;
import org.junit.Test;
public class Week10LabTest{


	@Test
	public void isPalindrome(){
		
		Week10Lab week10Lab = new Week10Lab();

		assertEquals("aba Should = true", true,week10Lab.isPalindrome("aba"));
		assertEquals("happy yppah  should = true",true week10Lab.isPalindrome("happy yppah "));
	}

}
