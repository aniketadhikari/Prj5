package prj5;

import student.TestCase;

/**
 * Test class for the CompareCFR class
 * 
 * @author Aniket Adhikari, Jenny Tran, Sami Al Jadir
 * @version 2021.04.27
 *
 */
public class CompareCFRTest extends TestCase {

    private Race alien;
    private Race human;
    private CompareCFR<Race> cfr;

    /**
     * Runs before every execution
     */
    public void setUp() {
        cfr = new CompareCFR<Race>();
        alien = new Race("Alien", 120, 352);
        human = new Race("Human", 100, 500);
    }


    /**
     * tests the compare method for when we are
     * comparing the CFRs of two races where
     * the 1st parameter has a lesser CFR
     */
    public void testComparePositive() {
        assertEquals(-1, cfr.compare(alien, human));

    }


    /**
     * Test the compare method for when we are
     * comparing the CFRs of two races where the
     * 1st parameter has a lesser CFR but they
     * both have the same names
     */
    public void testR1GreaterR2() {
        Race r1 = new Race("r1", 99, 100);
        Race r2 = new Race("r1", 1, 100);

        assertEquals(-1, cfr.compare(r1, r2));

    }


    /**
     * tests the compare method for when we are
     * comparing the CFRs of two races where the
     * 2nd parameter has a greater CFR
     */
    public void testCompareNegative() {
        assertEquals(1, cfr.compare(human, alien));
    }


    /**
     * tests the compare method for when we are
     * comparing the CFRs of two races where the
     * CFRs are equal
     */
    public void testCompareEqual() {
        Race alienCopy = new Race("Alien Copy", 120, 352);
        assertEquals(-5, cfr.compare(alien, alienCopy));
    }


    /**
     * tests the compare method when the first parameter
     * is null
     */
    public void testCompareFirstNull() {
        Exception thrown = null;
        try {
            cfr.compare(null, alien);
        }
        catch (Exception e) {
            thrown = e;
        }
        assertTrue(thrown instanceof IllegalArgumentException);
        assertEquals(thrown.getMessage(), "One of the parameters"
            + "has not been initialized");
    }


    /**
     * tests the compare method when the first parameter
     * is null
     */
    public void testCompareSecondNull() {
        Exception thrown = null;
        try {
            cfr.compare(alien, null);
        }
        catch (Exception e) {
            thrown = e;
        }
        assertTrue(thrown instanceof IllegalArgumentException);
        assertEquals(thrown.getMessage(), "One of the parameters"
            + "has not been initialized");
    }

}
