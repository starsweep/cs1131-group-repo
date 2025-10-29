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
	* @return returns 
	*/
		public boolean isPalindrome(String s){
			boolean palinbool = false;
			String reverse = "";
			String reverseShow ="";
			String staken = s;
			if(staken.contains(" ")){
				staken = ""+s.replace(" ","");
			}

			for(int i = staken.length()-1; i >=0; i--)
			{		
				reverse += staken.charAt(i);
			}
			for(int i = s.length()-1; i >=0; i--)
			{
				reverseShow += s.charAt(i);
			}

			if (reverse.toLowerCase().equals(staken.toLowerCase()))
			{
				palinbool = true;

			}
		System.out.println("Original = "+s+"\n Reverse"+reverseShow);


	return palinbool;

}
	/**
	* DESCRIPTION OF METHOD TRANSFORMATION
	* @param a DESCRIPTION OF PARAMETER
	* @return returns true or false depending on the type of parameter being it being a palindrome
	*/

} public int maxValue( int[] array ) {
        Week10Lab p4 = new Week10Lab();
        if ( array == null || array.length == 0 ) {
            return 0;
        }
        return p4.maxValue( array, array[ array.length - 1 ], array.length - 1 );
    }
    private int maxValue( int[] array, int largestValue, int position ) {
        P4 p4 = new P4();
        if ( position == -1 ) {
            return largestValue;
        }
        else if ( largestValue < array[ position ] ) {
            largestValue = array[ position ];
        }
        return p4.maxValue( array, largestValue, position - 1 );
	

} // END OF CLASS Week10Lab
