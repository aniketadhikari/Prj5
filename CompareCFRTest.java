package prj5;
import student.TestCase;

/**
* Test class for the CompareCFR class
* 
* @author Aniket Adhikari
* @version 04.23.2021 v2
*
*/
public class CompareCFRTest extends TestCase {
    
    private Race alien;
    private Race human;
    private CompareCFR<Race> cfr;
    
    public void setUp()
    {
        cfr = new CompareCFR<Race>();
        alien = new Race("Alien", 120, 352);
        human = new Race("Human", 100, 500);
    }
    
    /**
     * tests the compare method for when we are 
     * comparing the CFRs of two two races where 
     * the 1st parameter has a greater CFR
     */
    public void testComparePositive()
    {
        assertEquals(1, cfr.compare(alien, human));
    }
    
    /**
     * tests the compare method for when we are 
     * comparing the CFRs of two races where the 
     * 2nd parameter has a greater CFR 
     */
    public void testCompareNegative()
    {
        assertEquals(-1, cfr.compare(human, alien));
    }
    
    /**
     * tests the compare method for when we are 
     * comparing the CFRs of two races where the 
     * CFRs are equal
     */
    public void testCompareEqual()
    {
        Race alienCopy = new Race("Alien Copy", 120, 352);
        assertEquals(0, cfr.compare(alien, alienCopy));
    }
    
    /**
     * tests the compare method when the first parameter 
     * is null
     */
    public void testCompareFirstNull()
    {
        Exception thrown = null;
        try
        {
            cfr.compare(null, alien);
        }
        catch(Exception e)
        {
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
    public void testCompareSecondNull()
    {
        Exception thrown = null;
        try
        {
            cfr.compare(alien, null);
        }
        catch(Exception e)
        {
            thrown = e;
        }
        assertTrue(thrown instanceof IllegalArgumentException);
        assertEquals(thrown.getMessage(), "One of the parameters"
            + "has not been initialized");
    }

}
