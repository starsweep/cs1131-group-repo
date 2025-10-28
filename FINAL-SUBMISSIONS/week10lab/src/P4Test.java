/*
 * @author Andrew Martin
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class P4Test {
    /*
    public static void main( String[] args ) {
        P4Test p4test = new P4Test();
        p4test.testWorking();
        p4test.testNull();
        p4test.testEmpty();
        System.out.println("All tests passing!");
    }
    */

    @Test
    public void testWorking() {
        P4 p4 = new P4();
        int[] array = { 68, 2, 40, 24, 1, -1, 4, 4, 100, -25, 6 };
        assertEquals( 100, p4.maxValue( array ) );
    }

    @Test
    public void testNull() {
        P4 p4 = new P4();
        int[] array = null;
        assertEquals( 0, p4.maxValue( array ) );
    }

    @Test
    public void testEmpty() {
        P4 p4 = new P4();
        int[] array = {};
        assertEquals( 0, p4.maxValue( array ) );
    }

    @Test
    public void testSingleNumber() {
        P4 p4 = new P4();
        int[] array = {123};
        assertEquals( 123, p4.maxValue( array ) );
    }
}
