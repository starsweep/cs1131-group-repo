import java.util.Arrays;
/**
* CLASS DESCRIPTION
* @author AUTHOR NAMES
*/
public class Week10Lab {
	/**
	* DESCRIPTION OF METHOD TRANSFORMATION
	* @param n DESCRIPTION OF PARAMETER
	* @return DESCRIPTION OF RETURN VALUE
	*/
	public int sumDigits( int n ) {
		//if n is < 0, recall sumDigit with n as positive then make negative
		if(n < 0) {
			return -1 * sumDigits(-n);
		}
	
		//int to String
		String digit = String.valueOf(n);
		digit = String.valueOf(digit.charAt(digit.length() - 1));

		//int sum
		int sum = Integer.parseInt(digit); 
		
		//change n
		n = n - sum;
		n = n / 10;

		//end recursion when n = 0
		if(n == 0){
			return sum;
		}
		else{
			return sum + sumDigits(n);
		}
	}

	/**
	* DESCRIPTION OF METHOD TRANSFORMATION
	* @param s DESCRIPTION OF PARAMETER
	* @return DESCRIPTION OF RETURN VALUE
	*/
	//public boolean isPalindrome( String s ) {
		// YOUR CODE HERE
	//}

	/**
	* DESCRIPTION OF METHOD TRANSFORMATION
	* @param a DESCRIPTION OF PARAMETER
	* @return DESCRIPTION OF RETURN VALUE
	*/
	//public Integer maxValue( Integer[ ] a ) {
		// YOUR CODE HERE
	//}
	//

} // END OF CLASS Week10Lab
