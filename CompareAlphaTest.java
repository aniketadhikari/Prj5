package prj5;

import student.TestCase;

/**
 * Test class for the CompareAlpha class
 * 
 * @author Aniket Adhikari
 * @version 04.23.2021
 *
 */
public class CompareAlphaTest extends TestCase {
    private Race alien;
    private Race human;
    private CompareAlpha<Race> alpha;

    /**
     * Runs before every execution
     */
    public void setUp() {
        alien = new Race("Alien", 100, 500);
        human = new Race("Human", 100, 500);
        alpha = new CompareAlpha<Race>();
    }


    /**
     * tests the compare method when the first parameter's
     * name comes before the second parameter's name
     * alphabetically
     */
    public void testCompareNegative() {
        assertEquals(-1, alpha.compare(alien, human));

    }


    /**
     * tests the compare method when the second parameter's
     * name comes before the first parameter's name
     * alphabetically
     */
    public void testComparePositive() {
        assertEquals(1, alpha.compare(human, alien));
    }


    /**
     * tests the compare method when we compare races
     * with the same exact name
     */
    public void testCompareSame() {
        Race alienCopy = new Race("Alien", 0, 0);
        assertEquals(0, alpha.compare(alienCopy, alien));
    }


    /**
     * tests the compare method when we compare races
     * with the same name but different casing
     */
    public void testCompareCases() {
        Race lowerCaseHuman = new Race("hUmAn", 100, 500);
        assertEquals(0, alpha.compare(human, lowerCaseHuman));
    }


    /**
     * tests the compare method when the first parameter
     * is null
     */
    public void testCompareFirstNull() {
        Exception thrown = null;
        try {
            alpha.compare(null, alien);
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
            alpha.compare(alien, null);
        }
        catch (Exception e) {
            thrown = e;
        }
        assertTrue(thrown instanceof IllegalArgumentException);
        assertEquals(thrown.getMessage(), "One of the parameters"
            + "has not been initialized");
    }
}
