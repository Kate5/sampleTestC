import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by kate on 1/12/16.
 */


public class AddTwoValuesTest {

    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");

    }

    @Test
    public void testAddTwoPositiveValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("10 + 5 must be 15", 15, calc.add(10, 5));
    }

    @Test
    public void testAddTwoNegativeValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("-10 + -5 must be -15", -15, calc.add(-10, -5));

    }

    //TODO
    //add new 5 tests for add() method

    //TODO
    //add tests for new methods

    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!! ");

    }
}
