/*
 * @author Andrew Martin
 */

class P4 {
    int maxValue( int[] array ) {
        P4 p4 = new P4();
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
    }
}